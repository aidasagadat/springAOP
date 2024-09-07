package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;

public interface AccountDAO {

    void addAccount(Account account, boolean vipFlag);

    boolean doWork();

    void setName(String name);

    String getName();

    void setSurname(String surname);

    String getSurname();


}
