package com.bit.demo.Entities;

import jakarta.persistence.*;

import java.util.Random;

@Entity
@Table(name = "account")
public class Account {
    @Id
    private String accNo;
    private Double Balance;

    @ManyToOne()
    private Transaction transaction;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @PrePersist //
    public void generateCardNumber() {
        if (this.accNo == null) {
            this.accNo = generateRandomCardNumber();
        }
    }

    private String generateRandomCardNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}
