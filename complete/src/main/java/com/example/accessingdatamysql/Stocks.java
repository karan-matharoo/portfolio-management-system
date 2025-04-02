package com.example.accessingdatamysql;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Stocks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Integer purchasePrice;

    @Column(nullable = false)
    private Integer currentPrice;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column
    private Date sellDate;

    @Column
    private String creationDate;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setCurrentPrice(Integer currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setSellDate(Date sellDate) {
        this.sellDate = sellDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getId() {
        return id;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public Integer getCurrentPrice() {
        return currentPrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public Date getSellDate() {
        return sellDate;
    }

    public String getCreationDate() {
        return creationDate;
    }

}
