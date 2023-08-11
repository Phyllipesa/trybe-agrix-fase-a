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
   * toFarm = Cria uma Farm com dados de uma FarmDto.
   *
   * @return uma farmDTO
   */
  public Farm toFarm() {
    return new Farm(id, name, size);
  }


  /**
   * fromEntity = Cria uma FarmDTO com uma Farm vinda do DB.
   *
   * @param farm retorno vindo do DB.
   * @return uma farmDTO
   */
  public static FarmDto fromEntity(Farm farm) {
    return new FarmDto(farm.getId(), farm.getName(), farm.getSize());
  }
}
