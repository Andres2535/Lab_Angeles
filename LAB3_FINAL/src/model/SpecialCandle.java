package model;

public class SpecialCandle {
	//Attributtes
	
	private String color;
	private String size;
	private String essence;
	private int gradeOfIlluminance;
	
	//relations
	
	//Constructor method
	
	/*
	 * This is a constructor method of SpecialCandle 
	 */
	
	public SpecialCandle(String color, String size, String essence, int gradeOfIlluminance ) {
		this.color = color;
		this.size = size;
		this.essence = essence;
		this.gradeOfIlluminance = gradeOfIlluminance;
	}
	
	//Getters and setters
	
	/*
	 * This method is to get a color of SpecialCandle's Archangels
	 * @pre: Object of Archangel != null && candle != null;
	 * @param: empty
	 * @return: a String color of SpecialCandle's Archangel
	 * @post: got a color of SpecialCandle's Archangel
	 */

	public String getColor() {
		return color;
	}
	
	/*
	 * This method is to set a color of SpecialCandle's Archangels
	 * @pre: Object of Archangel != null && candle != null;
	 * @param: String color
	 * @return: void
	 * @post: set a color of SpecialCandle's Archangel
	 */

	public void setColor(String color) {
		this.color = color;
	}
	
	/*
	 * This method is to get a size of SpecialCandle's Archangels
	 * @pre: Object of Archangel != null && candle != null;
	 * @param: empty
	 * @return: a String size of SpecialCandle's Archangel
	 * @post: got a size of SpecialCandle's Archangel
	 */

	public String getSize() {
		return size;
	}
	
	/*
	 * This method is to set a size of SpecialCandle's Archangels
	 * @pre: Object of Archangel != null && candle != null;
	 * @param: String size
	 * @return: void
	 * @post: set a size of SpecialCandle's Archangel
	 */

	public void setSize(String size) {
		this.size = size;
	}
	
	/*
	 * This method is to get a essence of SpecialCandle's Archangels
	 * @pre: Object of Archangel != null && candle != null;
	 * @param: empty
	 * @return: a String essence of SpecialCandle's Archangel
	 * @post: got a essence of SpecialCandle's Archangel
	 */

	public String getEssence() {
		return essence;
	}
	
	/*
	 * This method is to set a essence of SpecialCandle's Archangels
	 * @pre: Object of Archangel != null && candle != null;
	 * @param: String essence
	 * @return: void
	 * @post: set a essence of SpecialCandle's Archangel
	 */

	public void setEssence(String essence) {
		this.essence = essence;
	}
	
	/*
	 * This method is to get a gradeOfIlluminance of SpecialCandle's Archangels
	 * @pre: Object of Archangel != null && candle != null;
	 * @param: empty
	 * @return: a int gradeOfIlluminance of SpecialCandle's Archangel
	 * @post: got a gradeOfIlluminance of SpecialCandle's Archangel
	 */

	public int getGradeOfIlluminance() {
		return gradeOfIlluminance;
	}
	
	/*
	 * This method is to set a gradeOfIlluminance of SpecialCandle's Archangels
	 * @pre: Object of Archangel != null && candle != null;
	 * @param: int gradeOfIlluminance
	 * @return: void
	 * @post: set a gradeOfIlluminance of SpecialCandle's Archangel
	 */

	public void setGradeOfIlluminance(int gradeOfIlluminance) {
		this.gradeOfIlluminance = gradeOfIlluminance;
	}
	
	
}
