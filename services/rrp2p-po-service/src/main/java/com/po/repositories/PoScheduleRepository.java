package com.po.repositories;

import com.po.entities.PoSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoScheduleRepository extends JpaRepository<PoSchedule, Long> {

}
