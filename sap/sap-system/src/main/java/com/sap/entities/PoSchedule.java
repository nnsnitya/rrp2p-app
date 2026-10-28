package com.sap.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PoSchedule {
    @Id
    private Long id;
    private Long poItem;
    private Long poId;
    private LocalDateTime createdAt;
    private LocalDateTime scheduledOn;
    private String description;
    private String state;
}
