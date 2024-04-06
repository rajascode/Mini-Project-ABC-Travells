package com;

import java.util.Scanner;

public class NewAdminRegistration {
	void NewRegistration() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter firstname");
		String fName = sc.next();

		System.out.println("lastname");
		String lName = sc.next();

			
		
				
		System.out.println("mobilenumber");
			String mNumber = sc.next();
				
			int num = Integer.parseInt(mNumber);
			Integer numb = num;
			System.out.println();

			if (numb.SIZE != 10) {
				System.out.println("not a valid mobile number");

			}
			
		
			else {

		

			System.out.println("emailid");
			String email = sc.next();

			
			System.out.println("gender");
			String gen = sc.next();
			
			
			System.out.println("password");
			String pwd = sc.next();
			
			if(pwd.length()<8) {
				System.out.println("password is too short");
			}

			else {
			System.out.println("confirm password");
			String pwd1 = sc.next();
			if (pwd1.equals(pwd)) {
				UserDetails userDetailsobject = new UserDetails(fName, lName, mNumber, email, gen, pwd);

				NewAdminandExistingHome newAdminHome_object = new NewAdminandExistingHome();

			} else {
				System.out.println("enter correct password");
			}

			}
			}
			 
		
	}
}

