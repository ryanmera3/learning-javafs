package net.ryanm.springboot.repository;
import net.ryanm.springboot.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
  
}
