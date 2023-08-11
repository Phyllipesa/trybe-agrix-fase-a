package com.betrybe.agrix.controller;

/**
 * FarmException - Classe de erro customizada para Farm.
 */

public class FarmException extends RuntimeException {
  /**
   * Constructor passando uma messangem de erro padrão.
   */
  public FarmException() {
    super("Fazenda não encontrada!");
  }
}
