package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{

    private String name;
    private String surname;


    @Override
    public void addAccount(Account account, boolean vipFlag) {
        System.out.println("New account is created");
    }

    @Override
    public boolean doWork() {

        System.out.println("Do work");
        return false;
    }

    @Override
    public String getName() {
        System.out.println("get name");
        return name;
    }

    @Override
    public void setName(String name) {
        System.out.println("set name");

        this.name = name;
    }

    @Override
    public String getSurname() {
        System.out.println("get surname");
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        System.out.println("ser surname");
        this.surname = surname;
    }


}
