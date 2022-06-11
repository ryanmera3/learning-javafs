package net.ryanm.springboot.repository;
import net.ryanm.springboot.entity.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {

}
