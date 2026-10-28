package com.sap.repositories;

import com.sap.entities.PoHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PoHistoryRepository extends JpaRepository<PoHistory, Long> {
    @Query("""
    SELECT p FROM PoHistory p WHERE p.createdAt >= :startDate ORDER BY p.createdAt DESC""")
    List<PoHistory> findRecordsFromDate(
            @Param("startDate") LocalDateTime startDate
    );
}
