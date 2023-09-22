package com.aaronbujatin.securityformbased.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/test")
@CrossOrigin("http://localhost:8100")
public class TestController {

    @GetMapping()
    public String login(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        return "Username " + username +" was" +" logged in successfully ";
    }

    @GetMapping("/user")
    @PreAuthorize("hasAuthority('USER')")
    public String user(){
        return "This is user role endpoint";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String admin(){
        return "This is admin role endpoint";
    }
}
