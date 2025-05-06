package com.chirp.chuuza.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "enterprise_owner")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long ownerId;
    @Column(nullable = false)
    private String ownerName;
    @Column(nullable = false, unique = true)
    private String ownerPhone;
    @Column( nullable = false, unique = true)
    private String ownerEmail;

    @OneToMany(mappedBy = "owner")
    private List<Enterprise> enterprises;

}
