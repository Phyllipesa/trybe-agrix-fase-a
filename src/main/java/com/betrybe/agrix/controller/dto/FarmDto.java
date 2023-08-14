package com.betrybe.agrix.controller.dto;

import com.betrybe.agrix.model.entities.Farm;

/**
 * Create the Farm dto.
 *
 * @param id farm id
 * @param name farm name
 * @param size farm size
 */
public record FarmDto(Long id, String name, Double size) {

  /**
   * Create the Farm dto.
   *
   * @param farm from entity.
   */
  public static FarmDto farmEntityToDto(Farm farm) {
    return new FarmDto(
        farm.getId(),
        farm.getName(),
        farm.getSize());
  }
}
