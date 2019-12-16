package com.userFront.domain;

import java.util.List;

public class User {

    private Long userId;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    
    private PrimaryAccount primaryAccount;
    
    private SavingsAccount savingsAccount;
    
    private List<Appointment> appointmentList;
    
    private List<Recipient> recipientList;

}
