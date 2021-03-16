package hotel;
/* 
 * Date of last modification: 09/12/16
 * Author: Martin Robinson
 * Purpose: This class uses user input to test the hotel class. It lets the user pick the name, amount of rooms, whether these have single or double beds, and then creates the hotel and
 * 			runs the report. A tempvar is used here as it is used in validating the user's input
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelConfigure {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //new scanner for user input
		String hotelName = ""; //initialising fields
		int noofRooms = 0;
		int noofSingles = 0;
		int noofDoubles = 0;
		String tempvar = "";
		List <Room> listofRooms = new ArrayList<Room>(); //create room list
		
		System.out.println("What is the name of the hotel?");
		hotelName = s.nextLine(); //takes a hotel name
		System.out.println("The name of the hotel is \"" + hotelName + "\"");
		System.out.println("\nHow many rooms does " + hotelName + " have?");
		
		tempvar = s.next();
			
		while (!tempvar.matches("-?\\d+(\\.\\d+)?")) { //if a number is entered then set it as tempvar
			System.out.println("Please enter an integer for the number of rooms!");
			tempvar = s.next();
		}
		noofRooms = Integer.parseInt(tempvar); //turn it into an integer and store it as number of rooms
		System.out.println("\nThe number of rooms in " + hotelName + " are " + noofRooms);	
		
		for (int i = 0; i < noofRooms; i++) { //same as above but for single and double beds
			System.out.println("\nHow many single beds does room " + i + " have?");
			tempvar = s.next();
			while (!tempvar.matches("-?\\d+(\\.\\d+)?")) {
				System.out.println("\nPlease enter an integer for the number of single beds!");
				tempvar = s.next();
			}
			noofSingles = Integer.parseInt(tempvar);
			System.out.println("\nThe number of single beds in room " + i + " are " + noofSingles);
			
			System.out.println("\nHow many double beds does room " + i + " have?");
			tempvar = s.next();
			while (!tempvar.matches("-?\\d+(\\.\\d+)?")) {
				System.out.println("\nPlease enter an integer for the number of double beds!");
				tempvar = s.next();
			}
			noofDoubles = Integer.parseInt(tempvar);
			System.out.println("\nThe number of double beds in room " + i + " are " + noofDoubles + "\n");
			listofRooms.add(new Room(noofSingles, noofDoubles)); //for every iteration of the loop a new room is added
		}
	Hotel newHotel = new Hotel(hotelName, listofRooms); //create the hotel
	HotelReport.runReport(newHotel); //run the report
		
	s.close();	//close scanner
	}
}
