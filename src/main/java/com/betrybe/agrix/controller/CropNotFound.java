package com.betrybe.agrix.controller;

/**
 * FarmException - Classe de erro customizada para Farm.
 */

public class CropNotFound extends RuntimeException {
  /**
   * Constructor passando uma messangem de erro padrão.
   */
  public CropNotFound() {
    super("Não há plantações nesta fazenda.");
  }
}
