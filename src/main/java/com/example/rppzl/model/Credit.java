package com.example.rppzl.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "credits", schema = "rppzl")
public class Credit {
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
