package com.tech4music.musics.views.handlers;


import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@ControllerAdvice
public class ValidationHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
            HttpHeaders headers, HttpStatus status, WebRequest request) {
                List<FieldError> erros = 
                ex.
                getBindingResult().
                getFieldErrors();       
                List<String> mensagens = new ArrayList<>();

        for (FieldError fe : erros) {
            mensagens.add(fe.getDefaultMessage());
        }
        
                return new ResponseEntity<Object>(mensagens, HttpStatus.OK);
    }
 
    
}
