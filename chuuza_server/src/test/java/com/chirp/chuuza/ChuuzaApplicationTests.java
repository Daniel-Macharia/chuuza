package com.chirp.chuuza;

import com.chirp.chuuza.DTO.EnterpriseDTO;
import com.chirp.chuuza.DTO.OwnerDTO;
import com.chirp.chuuza.DTO.ProductCartegoryDTO;
import com.chirp.chuuza.model.Enterprise;
import com.chirp.chuuza.model.Owner;
import com.chirp.chuuza.model.Product;
import com.chirp.chuuza.model.ProductCartegory;
import com.chirp.chuuza.service.EnterpriseService;
import com.chirp.chuuza.service.OwnerService;
import com.chirp.chuuza.service.ProductCartegoryService;
import com.chirp.chuuza.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChuuzaApplicationTests {

	@Autowired
	private OwnerService ownerService;

	@Autowired
	private EnterpriseService enterpriseService;

	@Autowired
	private ProductCartegoryService cartegoryService;

	@Autowired
	private ProductService productService;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateOwner()
	{
		OwnerDTO ownerDTO = new OwnerDTO("Daniel",
				"0712696965",
				"ndungudanny444@gmail.com");

		Owner owner = Owner.builder()
				.ownerName( ownerDTO.getOwnerName() )
				.ownerEmail( ownerDTO.getOwnerEmail() )
				.ownerPhone( ownerDTO.getOwnerPhone() )
				.build();

		ownerService.addOwner(owner);
	}

	@Test
	public void testCreateCartegory()
	{
		ProductCartegoryDTO cart = new ProductCartegoryDTO("Electronics");
		ProductCartegory cartegory = ProductCartegory.builder()
				.productCartegoryName(cart.getCartegoryName())
				.build();

		cartegoryService.createProductCartegory( cartegory );
	}

	@Test
	public void testCreateEnterprise()
	{
//		OwnerDTO ownerDTO = ownerService.getEnterpriseOwnerByEmail(
//				"ndungudanny444@gmail.com"
//		);

//		Owner owner = Owner.builder()
//				.ownerName( ownerDTO.getOwnerName() )
//				.ownerEmail( ownerDTO.getOwnerEmail() )
//				.ownerPhone( ownerDTO.getOwnerPhone() )
//				.build();

		Owner owner = ownerService.getEnterpriseOwnerByEmail(
				"ndungudanny444@gmail.com"
		);

		EnterpriseDTO ent = new EnterpriseDTO(
				"Chirp",
				"Nakuru",
				"D://logos/chirp_logo.png");

		Enterprise enterprise = Enterprise.builder()
						.enterpriseName( ent.getEnterpriseName() )
						.enterpriseLocation( ent.getEnterpriseLocation() )
						.enterpriseLogoUrl( ent.getEnterpriseLogoUrl() )
						.enterpriseType(1)
						.owner( owner )
						.build();

		//ownerService.addOwner( owner );
		enterpriseService.createEnterprise(enterprise);
	}

	@Test
	public void testCreateProduct()
	{
		Enterprise entDto = enterpriseService.getEnterpriseByEnterpriseName("chirp");
		ProductCartegory cartDto = cartegoryService.getProductCartegoryByCartegoryName("Electronics");

//		Enterprise ent = Enterprise.builder()
//				.enterpriseName( entDto.getEnterpriseName() )
//				.enterpriseLocation( entDto.getEnterpriseLocation() )
//				.enterpriseLogoUrl( entDto.getEnterpriseLogoUrl() )
//				.build();
//
//		ProductCartegory cart = ProductCartegory.builder()
//				.productCartegoryName( cartDto.getProductCartegoryName() )
//				.build();

		Product product = Product.builder()
				.productName("Woofer")
				.productQuantity("15")
				.productPrice(10000)
				.cartegory(cartDto)
				.enterprise( entDto )
				.build();

		productService.addProduct( product );
	}
}
