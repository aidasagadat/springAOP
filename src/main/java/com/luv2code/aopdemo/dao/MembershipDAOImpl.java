package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO{
    @Override
    public void addAccount() {
        System.out.println("New account is created for a MEMBER");
    }

    @Override
    public void goToSleep() {
        System.out.println("Go to sleep");
    }
}
