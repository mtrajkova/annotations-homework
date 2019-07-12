public class FieldIsNull extends Exception {
    private String message;

    public FieldIsNull(String message){
        this.message = message;
    }

    public FieldIsNull(){
        this.message = "Field cannot be null";
    }

    public String getMessage(){
        return this.message;
    }
}
