package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int advisorID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String contactInfo;

    // Constructor
    public FinancialAdvisor(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Default constructor required by JPA
    protected FinancialAdvisor() {}

    // Getters and Setters
    public int getAdvisorID() {
        return advisorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}

