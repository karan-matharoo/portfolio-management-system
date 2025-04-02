package com.example.accessingdatamysql;

import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String portfolioName;

    @Column(nullable = false)
    private String portfolioDescription;

    @Column(nullable = false)
    private Integer investedValue;

    @Column(nullable = false)
    private Integer currentValue;

    @Column(nullable = false)
    private String creationDate;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioDescription(String portfolioDescription) {
        this.portfolioDescription = portfolioDescription;
    }

    public String getPortfolioDescription() {
        return portfolioDescription;
    }

    public void setInvestedValue(Integer investedValue) {
        this.investedValue = investedValue;
    }

    public Integer getInvestedValue() {
        return investedValue;
    }

    public void setCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
    }

    public Integer getCurrentValue() {
        return currentValue;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreationDate() {
        return creationDate;
    }
}
