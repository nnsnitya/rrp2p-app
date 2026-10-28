package com.sap.repositories;

import com.sap.entities.PoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PoItemRepository extends JpaRepository<PoItem, Long> {
    @Query("""
    SELECT itm FROM PoItem itm WHERE itm.createdAt >= :startDate ORDER BY itm.createdAt DESC""")
    List<PoItem> findRecordsFromDate(
            @Param("startDate") LocalDateTime startDate
    );
}
