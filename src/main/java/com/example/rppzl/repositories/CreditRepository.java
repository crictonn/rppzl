package com.example.rppzl.repositories;

import com.example.rppzl.model.Credit;
import com.example.rppzl.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditRepository extends JpaRepository<Credit, Long> {
    Credit findCreditByUser(User user);
}
