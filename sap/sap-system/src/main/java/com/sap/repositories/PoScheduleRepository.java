package com.sap.repositories;

import com.sap.entities.PoSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PoScheduleRepository extends JpaRepository<PoSchedule, Long> {
    @Query("""
    SELECT p FROM PoSchedule p WHERE p.createdAt >= :startDate ORDER BY p.createdAt DESC""")
    List<PoSchedule> findRecordsFromDate(
            @Param("startDate") LocalDateTime startDate
    );
}
