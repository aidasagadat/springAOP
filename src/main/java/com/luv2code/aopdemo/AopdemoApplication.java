package com.luv2code.aopdemo;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class AopdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO accountDAO, MembershipDAO membershipDAO){
		return runner -> {

			Account account = new Account();

			accountDAO.addAccount(account, true);
			System.out.println("_____________________________________________");
			membershipDAO.addAccount();
			System.out.println("_____________________________________________");
			accountDAO.doWork();
			System.out.println("_____________________________________________");
			membershipDAO.goToSleep();

			System.out.println("_____________________________________________");
			System.out.println("_____________________________________________");
			System.out.println("_____________________________________________");

			accountDAO.getName();
			accountDAO.getSurname();


		};
	}




}
