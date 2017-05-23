package by.dt.web;

import by.dt.web.controller.exception.AlreadyExistException;
import by.dt.web.controller.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

/**
 * Controller is responsible for handling all exceptions.
 */
@ControllerAdvice
public class ExceptionController {

    private static final Logger LOGGER = Logger.getLogger(ExceptionController.class.getName());

    /**
     * Handle Exception
     *
     * @param request
     * @param e
     * @return entity with exception message
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMessage> handleException(HttpServletRequest request, Throwable e) {
        ErrorMessage errorMessage = new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR, request.getRequestURL().toString(), e.getMessage());
        LOGGER.severe(errorMessage.toString());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
    }

    @ExceptionHandler(AlreadyExistException.class)
    public ResponseEntity<ErrorMessage> handleUserAlreadyExistException(HttpServletRequest request, Throwable e) {
        ErrorMessage errorMessage = new ErrorMessage(HttpStatus.CONFLICT, request.getRequestURL().toString(), e.getMessage());
        LOGGER.severe(errorMessage.toString());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorMessage);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorMessage> handleUserNotFoundException(HttpServletRequest request, Throwable e) {
        ErrorMessage errorMessage = new ErrorMessage(HttpStatus.NOT_FOUND, request.getRequestURL().toString(), e.getMessage());
        LOGGER.severe(errorMessage.toString());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }
}
