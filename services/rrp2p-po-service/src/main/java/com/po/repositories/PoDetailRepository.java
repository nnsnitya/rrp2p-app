package com.po.repositories;

import com.po.entities.PoDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoDetailRepository extends JpaRepository<PoDetail, Long> {

}
