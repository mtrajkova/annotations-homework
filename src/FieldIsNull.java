public class FieldIsNull extends Exception {
    private String message;

    public FieldIsNull(String message){
        this.message = message;
        System.out.println(message);
    }

    public FieldIsNull(){
        System.out.println("Field is null");
    }

    public String getMessage(){
        return this.message;
    }
}
