package com.aaronbujatin.securityformbased.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document("vendors_test")
public class Vendor {

    @Id
    private String id;
    private String companyName;
    private String eventNameReference;
    private String email;
    private String contact;
    private VendorType vendorType;
    private String website;
    private String status;
    private PaymentStatus paymentStatus;

}
