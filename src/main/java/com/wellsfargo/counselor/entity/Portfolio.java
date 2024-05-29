package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int portfolioID;

    @ManyToOne
    @JoinColumn(name = "clientID", nullable = false)
    private Client client;

    // Constructor
    public Portfolio(Client client) {
        this.client = client;
    }

    // Default constructor required by JPA
    protected Portfolio() {}

    // Getters and Setters
    public int getPortfolioID() {
        return portfolioID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
