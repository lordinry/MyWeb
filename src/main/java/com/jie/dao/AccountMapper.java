package com.jie.dao;

import com.jie.pojo.Account;

import java.util.List;

public interface AccountMapper {
    Account getAccountByName(String username);
    List<Account> getAccountList();
}
