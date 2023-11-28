package br.com.fiap.HealthMinder.error;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import br.com.fiap.HealthMinder.validation.RestValidationError;
//import org.springframework.validation.BindingResult;

@RestControllerAdvice
public class ApplicationErrorHandler {
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public List<RestValidationError> validationHandler(MethodArgumentNotValidException e){
        return e.getBindingResult()
        .getFieldErrors()
        .stream()
        .map(err -> new RestValidationError(err.getField(), err.getDefaultMessage()))
        .collect(Collectors.toList());
    }

}
