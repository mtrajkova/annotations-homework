import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class NotNullImplementation {
    Phone phone;
    List<Field> annotatedFields;

    public NotNullImplementation() {
        phone = new Phone();
        annotatedFields = Arrays.asList(phone.getClass().getFields());
    }

    public NotNullImplementation(Phone phone) {
        this.phone = phone;
        annotatedFields = Arrays.asList(phone.getClass().getFields());
    }

    public void setup() throws FieldIsNull, IllegalAccessException {
        for (Field field : annotatedFields) {
            if (field.get(phone) == null) {
                if (field.isAnnotationPresent(NotNull.class)) {
                    NotNull throwErrorIfNull = field.getAnnotation(NotNull.class);

                    if (!throwErrorIfNull.message().equals("none"))
                        throw new FieldIsNull(throwErrorIfNull.message());
                    else
                        throw new FieldIsNull();
                }
            }
        }
    }
}
