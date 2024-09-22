package com.ganu.megamart.MegaMart.controller;

import com.ganu.megamart.MegaMart.model.Account;
import com.ganu.megamart.MegaMart.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/register")
    public String register(@RequestBody Account account) {
        accountService.register(account);
        return "Registration Successful";
    }

    @PostMapping("/login")
    public String login(@RequestBody Account account) {
        if (accountService.login(account.getName(), account.getPassword()).isPresent()) {
            return "Login Successful";
        }
        return "Invalid Credentials";
    }

}
