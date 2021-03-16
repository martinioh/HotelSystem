package hotel;

/* 
 * Date of last modification: 09/12/16
 * Author: Martin Robinson
 * Purpose: This class uses a constructor to assign a bed size to the object created by using the numbers 1 for a single or 2 for a double.
 */
public class Bed {

	private String bedName;

	public Bed(int bedSize) {
		if (bedSize == 1) { // if the bedsize is 1 then set name to single
			setBedName("Single");
		} else if (bedSize == 2) { // else set to double
			setBedName("Double");
		} else {
			setBedName(null);
		}
	}

	public String getBedName() { // simple getters and setters
		return bedName;
	}

	public void setBedName(String bedName) {
		this.bedName = bedName;
	}

}
