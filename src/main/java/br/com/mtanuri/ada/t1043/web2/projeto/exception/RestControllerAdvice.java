package br.com.mtanuri.ada.t1043.web2.projeto.exception;

import br.com.mtanuri.ada.t1043.web2.projeto.exception.dto.response.ValidationErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestControllerAdvice()
public class RestControllerAdvice {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ValidationErrorDto>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        BindingResult bindingResult = ex.getBindingResult();
        List<ValidationErrorDto> errors = new ArrayList<>();
        for (FieldError fieldError: bindingResult.getFieldErrors()) {
            errors.add(new ValidationErrorDto(fieldError.getDefaultMessage(), fieldError.getField()));
        }

        return new ResponseEntity<>(errors, HttpStatus.UNPROCESSABLE_ENTITY);
    }

}
