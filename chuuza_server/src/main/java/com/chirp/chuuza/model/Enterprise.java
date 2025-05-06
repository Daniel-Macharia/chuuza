package com.chirp.chuuza.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Enterprise {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long enterpriseId;

    @Column(nullable = false, unique = true)
    private String enterpriseName;
    @Column( nullable = false )
    private int enterpriseType;

    @Column( nullable = false )
    private String enterpriseLocation;

    @Column( nullable = false )
    private String enterpriseLogoUrl;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Owner owner;

    @OneToMany(mappedBy = "enterprise")
    private List<Product> products;

}
