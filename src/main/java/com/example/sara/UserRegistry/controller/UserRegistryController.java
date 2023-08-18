package com.example.sara.UserRegistry.controller;

import com.example.sara.UserRegistry.datamodel.TicketInfo;
import com.example.sara.UserRegistry.service.UserRegistryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class UserRegistryController {

    private UserRegistryService userRegistryService;

    @PostMapping("user/find/{id}")
    public ResponseEntity getSentimentAnalysis(@PathVariable("id") String id) {
        userRegistryService.findUser(id);
        return new ResponseEntity(new TicketInfo(false, null,null), HttpStatus.OK);
    }
}
