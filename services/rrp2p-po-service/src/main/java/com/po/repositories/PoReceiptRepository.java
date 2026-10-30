package com.po.repositories;

import com.po.entities.PoReceipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoReceiptRepository extends JpaRepository<PoReceipt, Long> {

}
