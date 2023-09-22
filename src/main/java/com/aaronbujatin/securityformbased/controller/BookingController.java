package com.aaronbujatin.securityformbased.controller;

import com.aaronbujatin.securityformbased.model.Booking;
import com.aaronbujatin.securityformbased.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/bookings")
@CrossOrigin("localhost:8100")
public class BookingController {

    private final BookingService bookingService;

    @PostMapping
    public ResponseEntity<Booking> save(@RequestBody Booking booking){
        return new ResponseEntity<>(bookingService.save(booking), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Booking> getBookingById(@PathVariable("id") String id){
        return new ResponseEntity<>(bookingService.getBookingById(id), HttpStatus.OK);
    }



}
