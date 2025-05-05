package com.chirp.chuuza.service;

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
}
