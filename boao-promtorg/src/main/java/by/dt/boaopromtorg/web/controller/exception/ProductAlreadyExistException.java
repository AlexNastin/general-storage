package by.dt.boaopromtorg.web.controller.exception;

public class ProductAlreadyExistException extends RuntimeException{

    public ProductAlreadyExistException(){
    }

    public ProductAlreadyExistException(String message) {
        super(message);
    }

    public ProductAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
