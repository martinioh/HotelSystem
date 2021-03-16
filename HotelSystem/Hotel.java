package hotel;
/* 
 * Date of last modification: 09/12/16
 * Author: Martin Robinson
 * Purpose: The purpose of this class is to create a hotel using the Room and Bed classes. This includes methods called hasVacancy and calcmaxOccupancy, which check whether there are
 * 			any vacancies in the whole hotel and the maximum amount of occupants. These are then accessed by the Hotel Report, Test and Configure classes.
 */
import java.util.List;

public class Hotel {

	private String hotelName;
	private List<Room> listofRooms;

	public Hotel(String hotelName, List<Room> listofRooms){ //constructor which needs the hotel name and the list of rooms which are declared in hoteltest class.
		setHotelName(hotelName); //using a setter instead of a public variable
		this.listofRooms = listofRooms;
	}

	public int calcmaxOccupancy(List<Room> listofRooms){
		int sum = 0; //initialises variable
		for (int  i = 0; i< getListofRooms().size(); i++){ //for every room
			sum+= getListofRooms().get(i).getAmountofSingles() + (2 * getListofRooms().get(i).getAmountofDoubles()); //add 1 for every single and 2 for every double
		}
		
		return sum; //return this
	}
	
	
	public String getHotelName() {
		return hotelName;
	}


	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}


	public final List<Room> getListofRooms() {
		return listofRooms;
	}


	public Boolean hasVacancies() {
		
		for (int  i = 0; i< getListofRooms().size(); i++){ //if any rooms have a free slot in then set this to true
			for (int j = 0; j < getListofRooms().get(j).getAmountofSingles(); j++) {
				if (getListofRooms().get(j).getIsBooked() == false){
					return true;
				}	
			}
			
			for (int k = 0; k < getListofRooms().get(k).getAmountofDoubles(); k++) {
				if (getListofRooms().get(k).getIsBooked() == false){
					return true;
				}	
			}
		}
		
		return false; //else return false
	}
	
}
