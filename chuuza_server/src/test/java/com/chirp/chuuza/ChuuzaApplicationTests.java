package com.chirp.chuuza;

import DTO.OwnerDTO;
import model.Owner;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import repository.OwnerRepository;
import service.OwnerService;

@SpringBootTest
class ChuuzaApplicationTests {

	@Autowired
	private OwnerRepository ownerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateOwner()
	{
		OwnerDTO ownerDTO = new OwnerDTO("Daniel",
				"0712696965",
				"ndungudanny444@gmail.com");

		Owner owner = new Owner();//Owner.Builder
//				.ownerName( ownerDTO.getOwnerName() )
//				.ownerEmail( ownerDTO.getOwnerEmail() )
//				.ownerPhone( ownerDTO.getOwnerPhone() )
//				.build();

		ownerRepository.save( owner );
	}

}
