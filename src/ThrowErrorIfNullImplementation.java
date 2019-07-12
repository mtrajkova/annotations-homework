import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class ThrowErrorIfNullImplementation {
    Phone phone;
    List<Field> annotatedFields;

    public ThrowErrorIfNullImplementation() {
        phone = new Phone();
        annotatedFields = Arrays.asList(phone.getClass().getFields());
    }

    public ThrowErrorIfNullImplementation(Phone phone) {
        this.phone = phone;
        annotatedFields = Arrays.asList(phone.getClass().getFields());
    }

    public void setup() throws FieldIsNull, IllegalAccessException {
        for (Field field : annotatedFields) {
            if (field.get(phone) == null) {
                if (field.isAnnotationPresent(ThrowErrorIfNull.class)) {
                    ThrowErrorIfNull throwErrorIfNull = field.getAnnotation(ThrowErrorIfNull.class);

                    if (!throwErrorIfNull.message().equals("none"))
                        throw new FieldIsNull(throwErrorIfNull.message());
                    else
                        throw new FieldIsNull();
                }
            }
        }
    }
}
