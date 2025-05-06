package com.chirp.chuuza.model;

import jakarta.persistence.*;
import lombok.Builder;

import java.util.List;

@Entity
@Table
@Builder
public class Product {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long productId;
    @Column( unique = true, nullable = false)
    private String productName;
    @Column( nullable = false)
    private String productQuantity;
    @Column( nullable = false)
    private double productPrice;

    @ManyToOne
    @JoinColumn(name = "enterprise_id", nullable = false)
    private Enterprise enterprise;

    @ManyToOne
    @JoinColumn( name =  "cartegory_id", nullable = false)
    private ProductCartegory cartegory;
}
