public class TestAnnotation {
    public static void main(String[] args) throws FieldIsNull, IllegalAccessException {
        ThrowErrorIfNullImplementation annotationImpl = new ThrowErrorIfNullImplementation(new Phone(1234L));
        annotationImpl.setup();

        annotationImpl = new ThrowErrorIfNullImplementation();
        annotationImpl.setup();


    }
}
