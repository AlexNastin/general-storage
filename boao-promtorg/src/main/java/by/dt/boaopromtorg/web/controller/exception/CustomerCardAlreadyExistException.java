package by.dt.boaopromtorg.web.controller.exception;


public class CustomerCardAlreadyExistException extends RuntimeException{
    public CustomerCardAlreadyExistException(){
    }

    public CustomerCardAlreadyExistException(String message) {
        super(message);
    }

    public CustomerCardAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
