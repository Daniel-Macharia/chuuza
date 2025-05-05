package service;

import DTO.OwnerDTO;
import model.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import repository.OwnerRepository;

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
