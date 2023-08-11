package com.betrybe.agrix.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * ControllerAdvice - Faz o gerenciamento de erros da aplicação.
 */
@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {

  /**
   * ControllerAdvice - Faz o gerenciamento de erros da aplicação.
   */
  @ExceptionHandler(FarmException.class)
  public ResponseEntity<String> handlerFarmNotFound(FarmException error) {
    return ResponseEntity
        .status(HttpStatus.NOT_FOUND)
        .body(error.getMessage());
  }

  //  @ExceptionHandler(Exception.class)
  //  public ResponseEntity<String> handlerException(Exception error) {
  //    System.out.println(error.getMessage());
  //    return ResponseEntity
  //        .status(HttpStatus.INTERNAL_SERVER_ERROR)
  //        .body(error.getMessage());
  //  }
}
