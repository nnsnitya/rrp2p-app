package com.sap.repositories;

import com.sap.entities.PoReceipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PoReceiptRepository extends JpaRepository<PoReceipt, Long> {
    @Query("""
    SELECT p FROM PoReceipt p WHERE p.createdAt >= :startDate ORDER BY p.createdAt DESC""")
    List<PoReceipt> findRecordsFromDate(
            @Param("startDate") LocalDateTime startDate
    );
}
