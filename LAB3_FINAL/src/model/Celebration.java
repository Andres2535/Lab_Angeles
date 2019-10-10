package model;

public class Celebration {
	//Attributtes
	
	private int day;
	private String month;
	
	//relations
	
	//Constructor method
	/*
	 * This is a constructor method of Celebration
	 */
	
	public Celebration(String month, int day) {
		this.month = month;
		this.day = day;
	}
	
	//Getters and setter method
	
	/*
	 * This method is to get a day of Celebration's Archangels
	 * @pre: Object of Archangel != null && celebration != null;
	 * @param: empty
	 * @return: a int day of Celebration's Archangel
	 * @post: got a day of Celebration's Archangel
	 */

	public int getDay() {
		return day;
	}
	
	/*
	 * This method is to set a day of Celebration's Archangels
	 * @pre: Object of Archangel != null && celebration != null;
	 * @param: int day
	 * @return: void
	 * @post: set a day of Celebration's Archangel
	 */

	public void setDay(int day) {
		this.day = day;
	}
	
	/*
	 * This method is to get a month of Celebration's Archangels
	 * @pre: Object of Archangel != null && celebration != null;
	 * @param: empty
	 * @return: a String month of Celebration's Archangel
	 * @post: got a month of Celebration's Archangel
	 */

	public String getMonth() {
		return month;
	}
	
	/*
	 * This method is to set a month of Celebration's Archangels
	 * @pre: Object of Archangel != null && celebration != null;
	 * @param: String month
	 * @return: void
	 * @post: set a month of Celebration's Archangel
	 */
	

	public void setMonth(String month) {
		this.month = month;
	}
	
	
	
	
}
