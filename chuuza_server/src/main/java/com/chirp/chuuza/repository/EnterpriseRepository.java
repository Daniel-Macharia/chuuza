package com.chirp.chuuza.repository;

import com.chirp.chuuza.model.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EnterpriseRepository extends JpaRepository<Enterprise, Long>
{
    Enterprise getEnterpriseByEnterpriseName(String enterpriseName);
}
