public class Phone {
    @ThrowErrorIfNull(message = "Phone number cannot be null")
    public Long phoneNumber;

    public Phone(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Phone(){}
}
