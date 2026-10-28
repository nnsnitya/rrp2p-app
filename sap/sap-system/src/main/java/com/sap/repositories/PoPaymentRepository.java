package com.sap.repositories;

import com.sap.entities.PoPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PoPaymentRepository extends JpaRepository<PoPayment, Long> {
    @Query("""
    SELECT p FROM PoPayment p WHERE p.paidOn >= :startDate ORDER BY p.paidOn DESC""")
    List<PoPayment> findRecordsFromDate(
            @Param("startDate") LocalDateTime startDate
    );
}
