package com.sap.repositories;

import com.sap.entities.PoDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PoDetailRepository extends JpaRepository<PoDetail, Long> {
    @Query("""
    SELECT p FROM PoDetail p WHERE p.createdAt >= :startDate ORDER BY p.createdAt DESC""")
    List<PoDetail> findRecordsFromDate(
            @Param("startDate") LocalDateTime startDate
    );
}
