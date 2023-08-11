package com.betrybe.agrix.service;


import com.betrybe.agrix.model.entities.Farm;
import com.betrybe.agrix.model.repositories.FarmRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Farm Service.
 */
@Service
public class FarmService {
  private final FarmRepository farmRepository;

  /**
   * Constructor = faz a injeção de dependencia na farmService com o repository adequado.
   */
  @Autowired
  public FarmService(FarmRepository farmRepository) {
    this.farmRepository = farmRepository;
  }

  /**
   * insertFarm insere uma nova farm no DB.
   *
   * @param farm informações a serem inseridas.
   * @return Retorno dos dados da farm inserida.
   */
  public Farm insertFarm(Farm farm) {
    return farmRepository.save(farm);
  }

  /**
   * getAllFarms retorna todas farms registradas no DB.
   *
   * @return Uma lista de farms.
   */
  public List<Farm> getAllFarms() {
    return farmRepository.findAll();
  }

  /**
   * getFarmById busca por uma farm com o ID especificado.
   *
   * @param id O id da farm a ser procurada.
   * @return farm com o ID especificado.
   */
  public Optional<Farm> getFarmById(Long id) {
    return farmRepository.findById(id);
  }
}
