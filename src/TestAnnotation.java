public class TestAnnotation {
    public static void main(String[] args) throws FieldIsNull, IllegalAccessException {
        NotNullImplementation annotationImpl = new NotNullImplementation(new Phone(1234L));
        annotationImpl.setup();

        annotationImpl = new NotNullImplementation();
        annotationImpl.setup();


    }
}
