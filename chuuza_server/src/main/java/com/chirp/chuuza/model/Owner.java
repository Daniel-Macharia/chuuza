package com.chirp.chuuza.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "enterprise_owner")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ownerId;
    private String ownerName;
    private String ownerPhone;
    private String ownerEmail;



}
