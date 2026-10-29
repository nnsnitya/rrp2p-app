package com.po.entities;

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
public class PoItem {
    @Id
    private Long itemId;
    private Long poId;
    private LocalDateTime createdAt;
    private String description;
    private String state;
    private Long materialId;
    private Long plantId;
    private Long receiptId;
    private Long scheduleId;
}
