package com.betrybe.agrix.service;

import com.betrybe.agrix.controller.CropNotFound;
import com.betrybe.agrix.model.entities.Crop;
import com.betrybe.agrix.model.repositories.CropRepository;
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

  /**
   * Constructor = faz a injeção de dependencia na services especificadas.
   *
   * @param cropRepository farm repository
   */

  public CropService(CropRepository cropRepository) {
    this.cropRepository = cropRepository;
  }

  /**
   * getAllCrops retorna todas CROPS registradas no DB.
   *
   * @return Uma lista de crop.
   */
  public List<Crop> getAllCrops() {
    return cropRepository.findAll();
  }

  /**
   * getCropById busca por uma farm com o ID especificado.
   *
   * @param id O id da crop a ser procurada.
   * @return crop com o ID especificado.
   */
  public Crop getCropById(Long id) {
    Optional<Crop> optionalCrop = cropRepository.findById(id);

    if (optionalCrop.isEmpty()) {
      throw new CropNotFound();
    }

    return optionalCrop.get();
  }
}
