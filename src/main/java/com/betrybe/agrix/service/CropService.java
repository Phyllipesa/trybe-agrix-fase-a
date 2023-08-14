package com.betrybe.agrix.service;

import com.betrybe.agrix.model.entities.Crop;
import com.betrybe.agrix.model.repositories.CropRepository;
import com.betrybe.agrix.model.repositories.FarmRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Crop Service.
 */

@Service
public class CropService {

  @Autowired
  private final CropRepository cropRepository;
  private final FarmRepository farmRepository;

  /**
   * Constructor = faz a injeção de dependencia na services especificadas.
   *
   * @param farmRepository farm repository
   */

  public CropService(
      CropRepository cropRepository,
      FarmRepository farmRepository
  ) {
    this.cropRepository = cropRepository;
    this.farmRepository = farmRepository;
  }

  //  /**
  //   * getCropsByFarmId.
  //   *
  //   * @param farmId = ID da farm a ser usado como referencia
  //   *              na buscada das crops referentes a essa farm.
  //   *
  //   * @return Uma lista com todas as crops relacionadas com a Farm especificada.
  //   */
  //  public Optional<List<Crop>> getCropsByFarmId(Long farmId) {
  //    return Optional.ofNullable(cropRepository.findAllByFarmId(farmId));
  //  }
}
