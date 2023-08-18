package com.example.sara.UserRegistry.service;

import com.example.sara.UserRegistry.datamodel.TicketInfo;
import org.springframework.stereotype.Service;

@Service
public interface UserRegistryService {

    public TicketInfo findUser(String userId);

    public TicketInfo raiseTicket(String userId);
}
