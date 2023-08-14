package com.betrybe.agrix.controller.dto;

import com.betrybe.agrix.model.entities.Crop;
import com.betrybe.agrix.model.entities.Farm;

/**
 * Criando uma CropDto.
 *
 * @param id da Crop.
 * @param name nome do alimento que foi plantado.
 * @param plantedArea area plantada.
 * @param farmId id da farm.

 */
public record CropDto(Long id, String name, Double plantedArea, Long farmId) {

  /**
   * cropEntityToDto.
   * Recebe uma Crop vinda do DB e passa as informações relevantes para o CropDto.
   */
  public static CropDto cropEntityToDto(Crop crop) {
    return new CropDto(
        crop.getId(),
        crop.getName(),
        crop.getPlantedArea(),
        crop.getFarm().getId()
    );
  }
}
