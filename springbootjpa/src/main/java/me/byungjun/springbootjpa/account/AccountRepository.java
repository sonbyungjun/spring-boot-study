package me.byungjun.springbootjpa.account;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

//  @Query(nativeQuery = true, value = "select * from account where username = '{0}'")
  Optional<Account> findByUsername(String username);
}
