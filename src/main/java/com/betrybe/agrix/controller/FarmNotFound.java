package com.betrybe.agrix.controller;

/**
 * FarmException - Classe de erro customizada para Farm.
 */

public class FarmNotFound extends RuntimeException {
  /**
   * Constructor passando uma messangem de erro padrão.
   */
  public FarmNotFound() {
    super("Fazenda não encontrada!");
  }
}
