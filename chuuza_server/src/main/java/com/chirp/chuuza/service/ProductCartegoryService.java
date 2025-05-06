package com.chirp.chuuza.service;

import com.chirp.chuuza.DTO.ProductCartegoryDTO;
import com.chirp.chuuza.model.ProductCartegory;
import com.chirp.chuuza.repository.ProductCartegoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCartegoryService {

    @Autowired
    private ProductCartegoryRepository cartegoryRepository;

    public void createProductCartegory(ProductCartegory productCartegory)
    {
        cartegoryRepository.save( productCartegory );
    }

    public ProductCartegory getProductCartegoryByCartegoryName( String cartegoryName )
    {
        return cartegoryRepository.getProductCartegoryByProductCartegoryName( cartegoryName );
    }

    public ProductCartegoryDTO getProductCartegoryDataByCartegoryName(String cartegoryName)
    {
        ProductCartegory cart =  cartegoryRepository.getProductCartegoryByProductCartegoryName( cartegoryName );
        System.out.println("retrieved cart = " + cart);

        ProductCartegoryDTO cartDto = null;

        if( cart != null )
        {
            cartDto = new ProductCartegoryDTO( cart.getProductCartegoryName() );
        }

        return cartDto;
    }
}
