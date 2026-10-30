package com.po.repositories;

import com.po.entities.PoPlant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoPlantRepository extends JpaRepository<PoPlant, Long> {

}
