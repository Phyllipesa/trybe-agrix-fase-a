package com.betrybe.agrix.controller;

import com.betrybe.agrix.controller.dto.FarmDto;
import com.betrybe.agrix.model.entities.Farm;
import com.betrybe.agrix.service.FarmService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Farm Controller.
 */

@RestController
@RequestMapping("/farms")
public class FarmController {
  private final FarmService farmService;

  /**
   * Recebe um bean do tipo FarmServiceInterface por injeção de dependência.
   *
   * @param farmService service.
   */
  @Autowired
  public FarmController(FarmService farmService) {
    this.farmService = farmService;
  }

  /**
   * createFarm = Cria uma nova farm.
   *
   * @param farmDto informações da farm.
   * @return HTTP status 201 e com os dados retornados do DB.
   */
  @PostMapping()
  public ResponseEntity<Farm> createFarm(@RequestBody FarmDto farmDto) {
    Farm newFarm = farmService.insertFarm(farmDto.toFarm());
    return ResponseEntity.status(HttpStatus.CREATED).body(newFarm);
  }

  /**
   * getAllFarms = Lista todas as farms registradas no DB.
   *
   * @return HTTP status 200 e a lista das farms.
   */

  @GetMapping()
  public ResponseEntity<List<FarmDto>> getAllFarms() {
    List<Farm> allFarms = farmService.getAllFarms();
    List<FarmDto> farmDtoList = allFarms.stream()
        .map(FarmDto::fromEntity)
        .toList();

    return ResponseEntity.ok(farmDtoList);
  }

  /**
   * getFarmById = Retorna a farm com o ID fornecido.
   *
   * @param id = ID da farm a ser buscada.
   * @return HTTP status 200 e a farm com o ID especificado..
   */
  @GetMapping("/{id}")
  public ResponseEntity<Farm> getFarmById(@PathVariable Long id) {
    Optional<Farm> optionalFarm = farmService.getFarmById(id);
    if (optionalFarm.isEmpty()) {
      throw new FarmException();
    }

    return  ResponseEntity.ok(optionalFarm.get());
  }
}
