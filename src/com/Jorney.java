package com;

import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;



public class Jorney {
	public Jorney() {
		
	}

	protected String source;
	protected String destination;
	protected String passengers;
	protected String dateoftravel;
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getPassengers() {
		return passengers;
	}

	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}
	

	public String getDateoftravel() {
		return dateoftravel;
	}

	public void setDateoftravel(String dateoftravel) {
		this.dateoftravel = dateoftravel;
	}

	public Jorney(String source, String destination, String passengers, String userd) {
		
		this.source = source;
		this.destination = destination;
		this.passengers = passengers;
		this.dateoftravel = userd;
		
		journeyDetails(source, destination, passengers, userd);
		NewAdminandExistingHome newAdminHome_object = new NewAdminandExistingHome();
		
		EditJourney eobj = new EditJourney(source, destination, passengers, userd);
		

	}

	
	public void journeyDetails(String source2, String destination2, String passengers2, String userd2) {
		
		  if(source2.isEmpty()) {
			  System.out.println("Travel Deatails or Empty");
			  
		  }
		  else {
		 pjourney(source2, destination2, passengers2, userd2);
		  }
		try {
			generateBills(source2, destination2, passengers2, userd2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void pjourney(String source2, String destination2, String passengers2, String userd2) {
		HashMap<String, String> planjourneydetails = new HashMap<>();
		{
			planjourneydetails.put("Source", source2);
			planjourneydetails.put("Destination", destination2);
			planjourneydetails.put("No of Passengers", passengers2);
			planjourneydetails.put("Date of Travel", userd2);
			System.out.println(planjourneydetails);
			
		}
	}
	

	/*
	 * This is method to generate the bills if Travell days are weekends(Saturday or
	 * Sunday) the price will be surged by 200+gst
	 */
	void generateBills(String s, String d, String n, String td) throws ParseException {
		/*
		 * Converting the Sting date format to Localdate format
		 */
		LocalDate date = LocalDate.parse(td, DateTimeFormatter.BASIC_ISO_DATE);

		System.out.println(date);
		int np = Integer.parseInt(n); // No of Passengers
		/**
		 * Intializing the variable fare, totalBIll,gst
		 */
		int fare = 0;
		int totalBill = 0;
		int gst = 0;

		HashMap<Integer, String> locations = new HashMap<>();
		{

			locations.put(1, "bangalore");
			locations.put(2, "hyd");
			locations.put(3, "chennai");
			locations.put(4, "mumbai");
			locations.put(5, "vizag");

		}
		/*
		 * If Travell route(Source&Destination) is Bangalore to Hyderabad or viceversa
		 */

		if (s.equalsIgnoreCase(locations.get(1)) && d.equalsIgnoreCase(locations.get(2))
				|| d.equalsIgnoreCase(locations.get(1)) && s.equalsIgnoreCase(locations.get(2))) {

			/*
			 * Intilizing the fare for route Bangalore to Hyderabad or vice versa
			 */
			fare = 650;

			/*
			 * Get the day of the week to find out wheater it is a Weekend or not Finding
			 * the day of the week that user wanted to Travel
			 */
			DayOfWeek day = date.getDayOfWeek();
			/*
			 * 
			 * It checks the User Travel date(day of the week) with saturday or sunday
			 * 
			 */
			if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
				System.out.println("Since the travel date weekend ");
				fare = fare + 200; // Fare will be surged by 200
				System.out.println("Travel route charges-\n"+fare);
				totalBill = np * fare;
				System.out.println("No of Passengers\n"+n);
				gst = totalBill / 18; // Finding the applicable gst
				System.out.println("GST 18%\n"+gst);
				totalBill = totalBill + gst; // Total bill
				System.out.println("Total Charges are:-");
				System.out.println(totalBill);

			} else { // If travel date is not weekend

				totalBill = np * fare;
				System.out.println("Travel date is not a weekend");
				System.out.println("Travel route charges-\n"+fare);
				System.out.println("No of Passengers\n"+n);
				
				gst = totalBill / 18;
				System.out.println("GST 18%\n"+gst);
				
				totalBill = totalBill + gst;
				System.out.println("Total Charges are:-");
				
				System.out.println(totalBill);
			}
		}
		  
	}
	
	
	
	

	
	@Override
	public String toString() {
		return "Jorney [source=" + source + ", destination=" + destination + ", passengers=" + passengers + "]";
	}

}
