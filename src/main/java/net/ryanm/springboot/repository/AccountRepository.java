package net.ryanm.springboot.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.ryanm.springboot.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
  List<Account> findByName(String name);
}