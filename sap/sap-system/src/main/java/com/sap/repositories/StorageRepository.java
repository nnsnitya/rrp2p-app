package com.sap.repositories;

import com.sap.entities.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface StorageRepository extends JpaRepository<Storage, Long> {
    @Query("""
    SELECT s FROM Storage s WHERE s.createdAt >= :startDate ORDER BY s.createdAt DESC""")
    List<Storage> findRecordsFromDate(
            @Param("startDate") LocalDateTime startDate
    );
}
