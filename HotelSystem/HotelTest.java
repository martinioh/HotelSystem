package hotel;
/* 
 * Date of last modification: 9/12/16
 * Author: Martin Robinson
 * Purpose: This class is used for testing the program. It does this in 2 ways. 1) - Creating a room and checking its maximum occupancy and 2) - setting one of the rooms
 * 			to be empty so that it sees whether the correct diaplay of a vacancy is printed in the report class.
 */


import java.util.ArrayList;
import java.util.List;

public class HotelTest {
	public static void main(String[] args) {
		HotelTest test = new HotelTest(); //creates new object of this class
		List <Room> roomList = new ArrayList<Room>(); //creates new list for room
		
		roomList.add(new Room(5,5)); //adds rooms in the format (single,double)
		roomList.add(new Room(3,1));
		roomList.add(new Room(5,2));
		roomList.add(new Room(1,2));
		
		Hotel h = new Hotel("Test Hotel", roomList); //creates a hotel method using the name and room list
		HotelReport.runReport(h); //prints out report
		System.out.println("\nThe maximum occupancy is " + h.calcmaxOccupancy(roomList)); //check maximum occupancy - was going to put this in report class but didnt want to	
		test.addVacancy(h);	//runs method below											//have to feed in room list as a parameter of report class
	}
	
	public void addVacancy(Hotel h) {
		h.getListofRooms().get(0).setIsBooked(false); //sets one of the rooms to have a vacancy
		System.out.println("\nThe following report tests whether the system can change the vacancy status\n"); 
		HotelReport.runReport(h); //checks whether report prints this out correctly
	}
	
}
