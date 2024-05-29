package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clientID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String contactInfo;

    @ManyToOne
    @JoinColumn(name = "advisorID", nullable = false)
    private FinancialAdvisor financialAdvisor;

    // Constructor
    public Client(String name, String contactInfo, FinancialAdvisor financialAdvisor) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.financialAdvisor = financialAdvisor;
    }

    // Default constructor required by JPA
    protected Client() {}

    // Getters and Setters
    public int getClientID() {
        return clientID;
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

    public FinancialAdvisor getFinancialAdvisor() {
        return financialAdvisor;
    }

    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
    }
}
