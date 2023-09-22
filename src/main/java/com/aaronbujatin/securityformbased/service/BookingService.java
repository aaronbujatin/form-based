package com.aaronbujatin.securityformbased.service;

import com.aaronbujatin.securityformbased.model.Booking;
import com.aaronbujatin.securityformbased.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BookingService {

    private final BookingRepository bookingRepository;


    public Booking save(Booking booking){
        return bookingRepository.save(booking);
    }

    public Booking getBookingById(String id){
        return bookingRepository.findById(id).get();
    }

    


}
