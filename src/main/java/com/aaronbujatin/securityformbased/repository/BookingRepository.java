package com.aaronbujatin.securityformbased.repository;

import com.aaronbujatin.securityformbased.model.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookingRepository extends MongoRepository<Booking, String> {

    List<Booking> findByOrganizerName(String organizerName);


}
