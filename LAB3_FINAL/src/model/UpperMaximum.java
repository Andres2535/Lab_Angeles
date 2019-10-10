package model;

/**
 * Implements the class UpperMaximum
 * @author Andres Cruz
 * @version 1.0
 */

public class UpperMaximum {
	//Attributtes
	
	//Relations
	
	private Archangel[] archangels;
	
	//Constructor method
	
	/*
	 * This is a constructor method of UpperMaximum
	 */
	
	public UpperMaximum(int i) {
		archangels = new Archangel[i];
	}
	
	/*
	 * This method is to know how many Archangels are there
	 * @pre: archangels != null
	 * @param: empty
	 * @return: amount of type int
	 * @post: got amount
	 */
	public int amountOfArchangels() {
		int amount = 0;
		for(int i = 0; i < archangels.length; i++) {
			amount++;
		}
		return amount;
	}
	
	/*
	 * This method is a lineal search that helps to find a archangel based of name of archangel
	 * @pre: archangels != null
	 * @param: String name
	 * @return: a object of type Archangel
	 * @post: got a archangel
	 */
	public Archangel search(String name) {
		for (int i = 0; i < archangels.length; i++) {
			if(archangels[i].getName().equals(name)) {
				return archangels[i];
			}
		}
		return null;
	}
	/*
	 * This method is a lineal search that helps to find a archangel based power of archangel
	 * @pre: archangels != null
	 * @param: String power
	 * @return: a object of type Archangel
	 * @post: got a archangel
	 */
	
	public Archangel searchPower(String power) {
		for (int i = 0; i < archangels.length; i++) {
			if(archangels[i].getPower().equals(power)) {
				return archangels[i];
			}
		}
		return null;
	}
	/*
	 * This method is a lineal search that helps to find a archangel based of celebration of archangel
	 * @pre: archangels != null && celebration != null;
	 * @param: String month
	 * @return: a string with all information about Archangel
	 * @post: got a archangel
	 */
	
	public String searchCelebration(String month) {
		String b = "";
		for (int i = 0; i < archangels.length; i++) {
			if(archangels[i].getCelebration().getMonth().equals(month)) {
				b += "*Name of archangel: " + archangels[i].getName() + "\n *Day of his celebration: " + archangels[i].getCelebration().getDay() 
						+ "\n *His color is: " + archangels[i].getCandle().getColor() + "\n *His essence is: " + archangels[i].getCandle().getEssence() + "\n";
			}
		}
		
		return b;
	}
	
	/*
	 * This method is to print all object with a celebration
	 * @pre: archangels != null && celebration != null;
	 * @param: empty
	 * @return: a string with all celebrations
	 * @post: got a archangel
	 */
	
	public String allCelebration() {
		String b = "";
		for (int i = 0; i < archangels.length; i++) {
				b += archangels[i].getName() + ": " + archangels[i].getCelebration().getMonth() 
						+ " " + archangels[i].getCelebration().getDay() + "\n";
		}
		
		return b;
	}
	
	/*
	 * This method is to get a array of archangels
	 * @pre: archangels != null
	 * @param: empty
	 * @return: a array of type Archangel
	 * @post: got a array of Archangel
	 */

	public Archangel[] getArchangels() {
		return archangels;
	}
	
	/*
	 * This method is to set a array of archangels
	 * @pre: archangels != null
	 * @param: Archangel[] archangels
	 * @return: void
	 * @post: set a array of Archangel
	 */

	public void setArchangels(Archangel[] archangels) {
		this.archangels = archangels;
	}
	
	
}
