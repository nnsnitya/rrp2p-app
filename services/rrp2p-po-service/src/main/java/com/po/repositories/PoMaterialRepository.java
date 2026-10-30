package com.po.repositories;

import com.po.entities.PoMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoMaterialRepository extends JpaRepository<PoMaterial, Long> {

}
