package com.sap.repositories;

import com.sap.entities.Storage;
import com.sap.entities.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long> {
    @Query("""
    SELECT v FROM Vendor v WHERE v.addedAt >= :startDate ORDER BY v.addedAt DESC""")
    List<Vendor> findRecordsFromDate(
            @Param("startDate") LocalDateTime startDate
    );
}
