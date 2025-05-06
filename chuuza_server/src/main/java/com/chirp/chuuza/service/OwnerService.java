package com.chirp.chuuza.service;

import com.chirp.chuuza.DTO.OwnerDTO;
import com.chirp.chuuza.model.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chirp.chuuza.repository.OwnerRepository;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    public int addOwner(Owner owner)
    {
        ownerRepository.save( owner );

        return 1;
    }

    public Owner getEnterpriseOwnerByEmail(String email)
    {
        return ownerRepository.getOwnerByOwnerEmail(email);
    }

    public OwnerDTO getEnterpriseOwnerDataByEmail(String email)
    {
        Owner owner = ownerRepository.getOwnerByOwnerEmail(email);

        OwnerDTO ownerDto = null;

        if( owner != null )
        {
            ownerDto = new OwnerDTO(
                    owner.getOwnerName(),
                    owner.getOwnerPhone(),
                    owner.getOwnerEmail()
            );
        }

        return ownerDto;
    }
}
