package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Home {
	
	Home() throws Exception {
	

		File file = new File("C:\\Users\\RAJASHEKHAR\\Desktop\\hi.txt");     //reading input from file
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null) {
			System.out.println(st);
		}

		System.out.println("\n");
		System.out.println("please enter your choice 1 or 2\n");
		
		System.out.println("1.New Admin Registration");
		System.out.println("2.Existing user login");

		int n;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("New Admin Registration");
			NewAdminRegistration newAdminobject = new NewAdminRegistration();
			newAdminobject.NewRegistration();
			//NewAdminandExistingHome newAdminHome_object = new NewAdminandExistingHome();
			
			
			break;
		case  2:
			System.out.println("Existing user login");
			
			ExistingUser existingUserObject = new ExistingUser();
			
			
			break;


		default:
			System.out.println("please enter the correct input");
			break;
		}
	}
}
