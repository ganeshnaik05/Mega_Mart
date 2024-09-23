package com.ganu.megamart.MegaMart.service;

import com.ganu.megamart.MegaMart.model.Account;
import com.ganu.megamart.MegaMart.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.regex.Pattern;

public class AccountService {

    private static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)" +
            "(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+" +
            "\\.[a-zA-Z]{2,}$";

    @Autowired
    private AccountRepository accountRepository;

    //The new user should be able to register and data should be persisted into Account table

    public Account register(Account account) {
//        if (accountRepository.existsByEmail(account.getEmail())) {
//            throw new RuntimeException("Email already used.");
//        }
//        return accountRepository.save(account);
        validateAccount(account);
        return accountRepository.save(account);

    }

    private void validateAccount(Account account) {
        if (account.getName() == null || account.getEmail() == null || account.getPassword() == null) {
            throw new RuntimeException("All fields are mandatory");
        }
        if (accountRepository.existsByEmail(account.getEmail())) {
            throw new RuntimeException("Email is already in use");
        }
        if (!Pattern.matches(EMAIL_REGEX, account.getEmail())) {
            throw new RuntimeException("Invalid email format");
        }
        if (!Pattern.matches(PASSWORD_REGEX, account.getPassword())) {
            throw new RuntimeException("Password must contain at least an uppercase, a lowercase character, a number, and a special character");
        }
        if (!account.getPassword().equals(account.getConfirmPassword())) {
            throw new RuntimeException("Password and Confirm Password do not match");
        }
    }

    //For existing user username and password should be checked with account table
    public Optional<Account> login(String name, String password) {
        return accountRepository.findById(name).filter(account ->
                account.getPassword().equals(password));
    }


}
