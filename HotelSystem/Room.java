package hotel;
/* 
 * Date of last modification: 09/12/16
 * Author: Martin Robinson
 * Purpose: This class is used to create a room object by uding a constructor with the amount of single and double beds inside the room.
 * 			It also includes a property to set whether the room is booked and this is automatically set to true when the room is created for testing purposes.
 */


import java.util.ArrayList;
import java.util.List;
public class Room {
	
	private List <Bed> listofBeds; //private so cannot be accessed without going through a method
	private int amountofSingles;
	private int amountofDoubles;
	private Boolean isBooked;
	
	public Room(int amountofSingles,int amountofDoubles){
		setIsBooked(true);
		listofBeds = new ArrayList<Bed>(); //creates a list of beds for every room
		setAmountofSingles(amountofSingles); //sets the amount of singles and doubles entered in constructor
		setAmountofDoubles(amountofDoubles);
		for (int i = 0; i < getAmountofSingles(); i++) {
			listofBeds.add(new Bed(1)); //add a single bed to the list
		}
		
		for (int i = 0; i < getAmountofDoubles(); i++) {
			listofBeds.add(new Bed(2)); //add a double bed to the list
		}

	}

	
	public final List<Bed> getListofBeds() {
		return listofBeds;
	}


	public final int getAmountofSingles() {
		return amountofSingles;
	}


	public final void setAmountofSingles(int amountofSingles) {
		this.amountofSingles = amountofSingles;
	}


	public final int getAmountofDoubles() {
		return amountofDoubles;
	}


	public final void setAmountofDoubles(int amountofDoubles){ //set through the parameter and is called when needed to change amountofdoubles
		this.amountofDoubles = amountofDoubles;
	}


	public Boolean getIsBooked() {
		return isBooked;
	}


	public void setIsBooked(Boolean isBooked) {
		this.isBooked = isBooked;
	}

}
