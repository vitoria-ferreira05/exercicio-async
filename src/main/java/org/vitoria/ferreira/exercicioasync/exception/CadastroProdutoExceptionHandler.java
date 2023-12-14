package org.vitoria.ferreira.exercicioasync.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CadastroProdutoExceptionHandler {
    @ExceptionHandler(InvestimentoException.class)
    public ResponseEntity<Object> handlerCadastroNomeProduto(InvestimentoException investimentoException){
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(investimentoException.getMessage());
    }

}
