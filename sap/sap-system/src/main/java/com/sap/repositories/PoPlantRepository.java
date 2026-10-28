package com.sap.repositories;

import com.sap.entities.PoPlant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PoPlantRepository extends JpaRepository<PoPlant, Long> {
    @Query("""
    SELECT p FROM PoPlant p WHERE p.createdAt >= :startDate ORDER BY p.createdAt DESC""")
    List<PoPlant> findRecordsFromDate(
            @Param("startDate") LocalDateTime startDate
    );
}
