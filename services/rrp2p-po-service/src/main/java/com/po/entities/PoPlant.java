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
public class PoPlant {
    @Id
    private Long id;
    private String name;
    private Long itemId;
    private String itemName;
    private LocalDateTime createdAt;
    private String location;
    private String description;
    private String state;
}
