package com.example.sara.UserRegistry.service;

import com.example.sara.UserRegistry.datamodel.TicketInfo;
import org.springframework.stereotype.Service;

@Service
public class UserRegistryServiceImpl implements UserRegistryService {


    @Override
    public TicketInfo findUser(String userId) {
        //find user
        if(true){
            return raiseTicket(userId);
        }
        return new TicketInfo(false, null, null);
    }

    @Override
    public TicketInfo raiseTicket(String userId) {
        //Raise a ticket in system
        return new TicketInfo(true, "1234", "Success");
    }
}
