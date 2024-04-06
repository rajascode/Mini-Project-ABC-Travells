package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class PlanJourney  {
	
		PlanJourney()  {

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Available routes are:-");
			System.out.println("Hyderabad to Bangalore vice versa");
			

		/*	HashMap<String, String> availableRoutes = new HashMap<>();
			{

				availableRoutes.put("hyd", "bangalore");
				availableRoutes.put("bangalore", "hyd");
				availableRoutes.put("hyd", "chennai");
				availableRoutes.put("hyd", "mumbai");
				availableRoutes.put("vizag", "hyd");

				System.out.println(availableRoutes);
			}*/

			System.out.println("1.Enter source");
			String source = sc.next();
			
			System.out.println("1.Enter destination");
			String destination = sc.next();
			System.out.println("Choose your Travel date yyyymmdd");
			String userd = sc.next();
			/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
			// Date date = null;
			try {
				Date date = sdf.parse(userd);
			} catch (ParseException e) {
				System.out.println("enter valid date");
				System.exit(0);
			}
			*/
			
			LocalDate currentDate = LocalDate.now();
			LocalDate date = LocalDate.parse(userd, DateTimeFormatter.BASIC_ISO_DATE);
			
			if (date.isAfter(currentDate)||date.equals(currentDate)) {
			try {
			//LocalDate date = LocalDate.parse(userd, DateTimeFormatter.BASIC_ISO_DATE);
			System.out.println(date);
			
		
			}
			catch(Exception e){
				System.out.println("please enter the correct date");
				System.exit(0);
				
			}
			System.out.println("1.Enter no of passeners");
			String passengers = sc.next();

			Jorney jorney_object = new Jorney(source, destination, passengers, userd);

		}else {
			System.out.println("Please Enter the valid date");
		}
		}

	}


