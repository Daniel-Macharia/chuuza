package com.chirp.chuuza.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table
@Builder
public class Enterprise {
    @Id
    private Long enterpriseId;
    private String enterpriseName;
    private String enterpriseType;
    private String enterpriseLocation;
    private String enterpriseLogoUrl;
}
