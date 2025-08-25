package br.ifpr.aloMundo.erros;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handle(Exception e) {
        /*
         * return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
         * .body("Erro: " + e.getMessage());
         */
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "https://http.cat/404.jpg");
        return new ResponseEntity<>(headers, HttpStatus.FOUND);
    }

}
