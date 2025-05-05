package com.chirp.chuuza.DTO;

public class OwnerDTO {
    private String ownerName;
    private String ownerPhone;
    private String ownerEmail;

    public OwnerDTO(String ownerName, String ownerPhone, String ownerEmail) {
        this.ownerName = ownerName;
        this.ownerPhone = ownerPhone;
        this.ownerEmail = ownerEmail;
    }

//    public void setOwnerName(String ownerName) {
//        this.ownerName = ownerName;
//    }
//
//    public void setOwnerPhone(String ownerPhone) {
//        this.ownerPhone = ownerPhone;
//    }
//
//    public void setOwnerEmail(String ownerEmail) {
//        this.ownerEmail = ownerEmail;
//    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }
}
