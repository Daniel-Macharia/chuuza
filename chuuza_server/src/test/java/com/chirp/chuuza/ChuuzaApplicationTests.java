package com.chirp.chuuza;

import com.chirp.chuuza.DTO.OwnerDTO;
import com.chirp.chuuza.model.Owner;
import com.chirp.chuuza.service.OwnerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.chirp.chuuza.repository.OwnerRepository;

@SpringBootTest
class ChuuzaApplicationTests {

	@Autowired
	private OwnerService ownerService;

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

		ownerService.addOwner(owner);
		//ownerRepository.save( owner );
	}

}
