package com.po.repositories;

import com.po.entities.PoPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoPaymentRepository extends JpaRepository<PoPayment, Long> {

}
