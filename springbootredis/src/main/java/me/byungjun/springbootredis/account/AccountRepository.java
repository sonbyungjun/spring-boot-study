package me.byungjun.springbootredis.account;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, String> {

}