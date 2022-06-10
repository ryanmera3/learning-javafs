package net.ryanm.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.ryanm.springboot.entity.Account;
import net.ryanm.springboot.repository.AccountRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8081")
public class AccountController {

  @Autowired
  private AccountRepository accountRepository;

  @GetMapping("/accounts")
  public List<Account> fetchAccounts(){
    return accountRepository.findAll();
  }
}