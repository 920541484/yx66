package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

public interface IAccountService {
    //查询所有用户
    public List<Account> findAll();

    //添加用户
    public void saveAccount(Account account);
}
