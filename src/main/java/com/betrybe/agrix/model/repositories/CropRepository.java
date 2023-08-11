package com.betrybe.agrix.model.repositories;

import com.betrybe.agrix.model.entities.Crop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * CropRepository repository to service.
 */
@Repository
public interface CropRepository extends JpaRepository<Crop, Long> {
}
