package com.chirp.chuuza.model;

import jakarta.persistence.Id;

public class Buyer {
    @Id
    private Long buyerId;
    private String BuyerName;
    private String buyerPhone;
    private String buyerEmail;
}
