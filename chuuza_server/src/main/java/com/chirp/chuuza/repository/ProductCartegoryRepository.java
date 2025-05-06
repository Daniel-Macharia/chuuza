package com.chirp.chuuza.repository;

import com.chirp.chuuza.model.ProductCartegory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCartegoryRepository extends JpaRepository<ProductCartegory, Long>
{
    ProductCartegory getProductCartegoryByProductCartegoryName( String cartegoryName );
}
