package com.example.rppzl.repositories;

import com.example.rppzl.model.Deposit;
import com.example.rppzl.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositRepository extends JpaRepository<Deposit, Long> {
    Deposit findDepositByUser(User user);
}
