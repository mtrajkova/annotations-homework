public class TestAnnotation {
    public static void main(String[] args) throws FieldIsNull, IllegalAccessException {
        try {
            NotNullImplementation annotationImpl = new NotNullImplementation(new Phone(1234L));
            annotationImpl.setup();

            annotationImpl = new NotNullImplementation();
            annotationImpl.setup();
        } catch (FieldIsNull fieldIsNull){
            System.out.println(fieldIsNull.getMessage());
        }

    }
}
