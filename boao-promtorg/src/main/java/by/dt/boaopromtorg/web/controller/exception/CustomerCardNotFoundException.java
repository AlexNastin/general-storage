package by.dt.boaopromtorg.web.controller.exception;


public class CustomerCardNotFoundException extends RuntimeException{

    public CustomerCardNotFoundException(){
    }

    public CustomerCardNotFoundException(String message) {
        super(message);
    }

    public CustomerCardNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
