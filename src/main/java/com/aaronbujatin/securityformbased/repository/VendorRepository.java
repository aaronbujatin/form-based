package com.aaronbujatin.securityformbased.repository;

import com.aaronbujatin.securityformbased.model.Vendor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VendorRepository extends MongoRepository<Vendor, String> {



}
