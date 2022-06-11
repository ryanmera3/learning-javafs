package net.ryanm.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.ryanm.springboot.entity.Account;
import net.ryanm.springboot.repository.AccountRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8081")
public class AccountController {

  @Autowired
  private AccountRepository accountRepository;

  @PostMapping("/add")
  public @ResponseBody String addNewAccount(@RequestParam Integer id, @RequestParam String name, @RequestParam String picture, @RequestParam String email) {
    Account a = new Account();
    a.setId(id);
    a.setName(name);
    a.setPicture(picture);
    a.setEmail(email);
    accountRepository.save(a);
    return "Saved";
  }
  @GetMapping("/accounts")
  public @ResponseBody Iterable<Account> getAllAccounts(){
    return accountRepository.findAll();
  }


}