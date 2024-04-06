package com;

import java.time.LocalDate;
import java.util.Scanner;

public class EditJourney extends Jorney {

	private String source;
	private String destination;
	private String passengers;
	private String dateoftravel;

	Scanner sc = new Scanner(System.in);

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		super.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		super.destination = destination;
	}

	public String getPassengers() {
		return passengers;
	}

	public void setPassengers(String passengers) {
		super.passengers = passengers;
	}

	public String getDateoftravel() {
		return dateoftravel;
	}

	public void setDateoftravel(String dateoftravel) {
		super.dateoftravel = dateoftravel;
	}

	public EditJourney() {
		try {
			EditJourney eobj = new EditJourney(source, destination, passengers, dateoftravel);

		} catch (Exception e) {

			System.out.println("null valuess");
		} finally {

		}

	}

	public EditJourney(String s, String d, String p, String date) {
		/*
		 * super.source= s; super.destination=d;
		 * 
		 * super.dateoftravel=date; super.passengers=p;
		 */
		
		if(s==null) {
		//	System.out.println("No Travel Details");
			
			//NewAdminandExistingHome newAdminHome_object = new NewAdminandExistingHome();
			
			
		}
	else {

		System.out.println("Your Previous Travell Details are:-");
		journeyDetails(s, d, p, date);

		System.out.println("update date-Please enter date in yyyymmdd");
		date = sc.next();

		System.out.println("Your Updated Details :-");
		journeyDetails(s, d, p, date);
		NewAdminandExistingHome newAdminHome_object = new NewAdminandExistingHome();

		}
	}

	public String toString() {
		return "EditJourney [source=" + source + ", destination=" + destination + ", passengers=" + passengers
				+ ", dateoftravel=" + dateoftravel + "]";
	}

}
