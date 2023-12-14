package com.example.rppzl.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "deposits", schema = "rppzl")
public class Deposit {
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        @Column(name = "Id", nullable = false)
        private Long id;
        @Column(name = "interest_rate")
        private double interest;
        @Column(name = "amount")
        private double amount;
        @ManyToOne(fetch = FetchType.LAZY)
        private User user;
}
