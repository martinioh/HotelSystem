package hotel;
/* 
 * Date of last modification: 09/12/16
 * Author: Martin Robinson
 * Purpose: This class prints out the info about the rooms, including the amount of single and double beds, and also whether the hotel has any vacancies.
*/
public class HotelReport {
	public static void runReport(Hotel h) {
		System.out.println("HOTEL INFORMATION");
		System.out.println("*****************************************");
		System.out.println("\nThe name of the Hotel is " + "\"" + h.getHotelName() + "\" and has " + h.getListofRooms().size() + " rooms."); //uses methods from hotel class
		for (int i =0; i < h.getListofRooms().size(); i++){
			System.out.println("\nRoom " + i + " has " + h.getListofRooms().get(i).getAmountofSingles()  //uses method from room class
					+ " single beds and " + h.getListofRooms().get(i).getAmountofDoubles() + " double beds.");
		}
		
		
		System.out.println("\nDoes this hotel have any vacancies? " + h.hasVacancies()); //returns whether any vacancies
		
	}
}
