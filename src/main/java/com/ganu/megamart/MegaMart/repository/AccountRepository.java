package com.ganu.megamart.MegaMart.repository;

import com.ganu.megamart.MegaMart.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,String> {
    boolean existsByEmail(String email);
}
