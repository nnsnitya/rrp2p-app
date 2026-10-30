package com.po.repositories;

import com.po.entities.PoState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoStateRepository extends JpaRepository<PoState, Long> {

}
