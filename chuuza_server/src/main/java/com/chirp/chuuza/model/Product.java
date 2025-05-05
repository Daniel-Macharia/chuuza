package com.chirp.chuuza.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table
@Builder
public class Product {

    @Id
    private Long productId;
    private String productName;
    private String productQuantity;
    private String productPrice;

}
