package com.chirp.chuuza.service;

import com.chirp.chuuza.DTO.EnterpriseDTO;
import com.chirp.chuuza.model.Enterprise;
import com.chirp.chuuza.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseService {

    @Autowired
    private EnterpriseRepository enterpriseRepository;

    public void createEnterprise(Enterprise enterprise)
    {
        enterpriseRepository.save(enterprise);
    }

    public Enterprise getEnterpriseByEnterpriseName(String enterpriseName)
    {
        return enterpriseRepository.getEnterpriseByEnterpriseName( enterpriseName );
    }

    public EnterpriseDTO getEnterpriseDataByEnterpriseName( String enterpriseName )
    {
        Enterprise ent = enterpriseRepository.getEnterpriseByEnterpriseName( enterpriseName );

        EnterpriseDTO entDto;

        if( ent == null ) {
            entDto = null;
        }
        else
        {
            entDto = new EnterpriseDTO(
                    ent.getEnterpriseName(),
                    ent.getEnterpriseLocation(),
                    ent.getEnterpriseLogoUrl()
            );
        }

        return entDto;
    }
}
