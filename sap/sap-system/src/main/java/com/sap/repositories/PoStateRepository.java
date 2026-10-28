package com.sap.repositories;

import com.sap.entities.PoState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PoStateRepository extends JpaRepository<PoState, Long> {
    @Query("""
    SELECT p FROM PoState p WHERE p.updatedOn >= :startDate ORDER BY p.updatedOn DESC""")
    List<PoState> findRecordsFromDate(
            @Param("startDate") LocalDateTime startDate
    );
}
