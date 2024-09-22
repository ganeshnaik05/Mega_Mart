package com.ganu.megamart.MegaMart.service;

import com.ganu.megamart.MegaMart.model.Account;
import com.ganu.megamart.MegaMart.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    //The new user should be able to register and data should be persisted into Account table

    public Account register(Account account) {
        if (accountRepository.existsByEmail(account.getEmail())) {
            throw new RuntimeException("Email already used.");
        }
        return accountRepository.save(account);
    }

    //For existing user username and password should be checked with account table
    public Optional<Account> login(String name, String password) {
        return accountRepository.findById(name).filter(account ->
                account.getPassword().equals(password));
    }


}
