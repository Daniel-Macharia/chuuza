package com.chirp.chuuza.DTO;

import jakarta.persistence.Column;

public class EnterpriseDTO {
    private String enterpriseName;
    private enum enterpriseType{SHOP,ORGANISATION};
    private String enterpriseLocation;
    private String enterpriseLogoUrl;

    public EnterpriseDTO(String enterpriseName, String enterpriseLocation, String enterpriseLogoUrl) {
        this.enterpriseName = enterpriseName;
        this.enterpriseLocation = enterpriseLocation;
        this.enterpriseLogoUrl = enterpriseLogoUrl;
    }

//    public void setEnterpriseName(String enterpriseName) {
//        this.enterpriseName = enterpriseName;
//    }
//
//    public void setEnterpriseLocation(String enterpriseLocation) {
//        this.enterpriseLocation = enterpriseLocation;
//    }
//
//    public void setEnterpriseLogoUrl(String enterpriseLogoUrl) {
//        this.enterpriseLogoUrl = enterpriseLogoUrl;
//    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public String getEnterpriseLocation() {
        return enterpriseLocation;
    }

    public String getEnterpriseLogoUrl() {
        return enterpriseLogoUrl;
    }
}
