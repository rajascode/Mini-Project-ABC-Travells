package com;

import java.util.HashMap;
import java.util.Scanner;

public class ExistingUser {
	
	Scanner sc = new Scanner(System.in);

	public ExistingUser() {

		HashMap<Integer, String> ul = new HashMap<>();
		{
			ul.put(1, "raj");
			ul.put(2, "pwd");

		}

		System.out.println("uname");
		String uname = sc.next();
		System.out.println("password");
		String pwd = sc.next();

		if (ul.get(1).contentEquals(uname) && ul.get(2).contentEquals(pwd)) {
			System.out.println("welcome" + "  " + ul.get(1));
			NewAdminandExistingHome newAdminHome_object1 = new NewAdminandExistingHome();

		} else {
			System.out.println("please provide valid details");
		}
	}

}
