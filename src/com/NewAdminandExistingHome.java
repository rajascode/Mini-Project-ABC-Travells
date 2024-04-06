package com;

import java.text.ParseException;
import java.util.Scanner;

public class NewAdminandExistingHome {
	
	public NewAdminandExistingHome()  {
		
		System.out.println("please enter your choice");
		System.out.println("1.plan new journey");
		System.out.println("2.edit journey");
		System.out.println("3.Exit");
		
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		switch (n) {
		
		case 1:
			System.out.println("plan new jorney");
			PlanJourney planjourneyobject = new PlanJourney();
			//System.exit(0);
			
			
			
			break;
		case 2:
			System.out.println("edit journey");
			
			EditJourney editJourney_object = new EditJourney( );
			//EditJourney eobj = new EditJourney(source, destination, passengers, userd);
			
			
			break;
		case 3:
			System.exit(0);
		}
		
	}
	
	

}

