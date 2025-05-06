package com.chirp.chuuza.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table
@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductCartegory {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( nullable = false )
    private Long productCartegoryId;

    @Column( nullable = false, unique = true)
    private String productCartegoryName;

    @OneToMany(mappedBy = "cartegory")
    private List<Product> products;

}
