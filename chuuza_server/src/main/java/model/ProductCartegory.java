package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table
@Builder
public class ProductCartegory {

    @Id
    private Long productCartegoryId;
    private String cartegoryName;
}
