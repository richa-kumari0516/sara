package com.example.sara.UserRegistry.datamodel;

public class TicketInfo {

    public TicketInfo(boolean isUserAuthenticated, String troubleTicketId, String status) {
        this.isUserAuthenticated = isUserAuthenticated;
        this.troubleTicketId = troubleTicketId;
        this.status = status;
    }

    private boolean isUserAuthenticated;
    private String troubleTicketId;
    private String status;
}
