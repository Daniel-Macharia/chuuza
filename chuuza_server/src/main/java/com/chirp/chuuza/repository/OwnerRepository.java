package com.chirp.chuuza.repository;

import com.chirp.chuuza.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long>
{

    Owner getOwnerByOwnerEmail(String email);
}
