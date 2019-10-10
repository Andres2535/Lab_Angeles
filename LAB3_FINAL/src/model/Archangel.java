package model;

import java.awt.Image;

public class Archangel {
	
	//Attributtes
	
	private String name;
	private Image photo;
	private String prayer;
	private String power;
	
	//Relations
	
	private Celebration celebration;
	private SpecialCandle candle;
	
	//Constructor Method
	
	/*
	 * This is a constructor method of Archangels
	 */
	
	public Archangel (String name, String prayer, String power, Celebration celebration, SpecialCandle candle) {
		this.name = name;
		this.photo = null;
		this.prayer = prayer;
		this.power = power;
		this.celebration = celebration;
		this.candle = candle;
		
	}
	
	//Getters and setters method
	
	/*
	 * This method is to get a power of archangels
	 * @pre: Object of Archangel != null;
	 * @param: empty
	 * @return: a power of Archangel
	 * @post: got a power of Archangel
	 */

	public String getPower() {
		return power;
	}
	
	/*
	 * This method is to set a power of archangels
	 * @pre: Object of Archangel != null;
	 * @param: String power
	 * @return: void
	 * @post: set a power of Archangel
	 */

	public void setPower(String power) {
		this.power = power;
	}
	
	/*
	 * This method is to get a celebration of archangels
	 * @pre: Object of Archangel != null && celebration != null;
	 * @param: empty
	 * @return: a celebration of Archangel
	 * @post: got a celebration of Archangel
	 */

	public Celebration getCelebration() {
		return celebration;
	}
	
	/*
	 * This method is to set a celebration of archangels
	 * @pre: Object of Archangel != null && celebration != null;
	 * @param: Celebration celebration
	 * @return: void
	 * @post: set a celebration of Archangel
	 */

	public void setCelebration(Celebration celebration) {
		this.celebration = celebration;
	}
	
	/*
	 * This method is to get a candle of archangels
	 * @pre: Object of Archangel != null && candle != null;
	 * @param: empty
	 * @return: a candle of Archangel
	 * @post: got a candle of Archangel
	 */

	public SpecialCandle getCandle() {
		return candle;
	}
	
	/*
	 * This method is to set a candle of archangels
	 * @pre: Object of Archangel != null && candle != null;
	 * @param: SpecialCandle candle
	 * @return: void
	 * @post: set a candle of Archangel
	 */

	public void setCandle(SpecialCandle candle) {
		this.candle = candle;
	}
	
	/*
	 * This method is to get a name of archangels
	 * @pre: Object of Archangel != null;
	 * @param: empty
	 * @return: a name of Archangel
	 * @post: got a name of Archangel
	 */

	public String getName() {
		return name;
	}
	
	/*
	 * This method is to set a name of archangels
	 * @pre: Object of Archangel != null;
	 * @param: String name
	 * @return: void
	 * @post: set a name of Archangel
	 */

	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * This method is to get a photo of archangels
	 * @pre: Object of Archangel != null;
	 * @param: empty
	 * @return: a photo of Archangel
	 * @post: got a photo of Archangel
	 */

	public Image getPhoto() {
		return photo;
	}
	
	/*
	 * This method is to set a photo of archangels
	 * @pre: Object of Archangel != null;
	 * @param: Image photo
	 * @return: void
	 * @post: set a photo of Archangel
	 */

	public void setPhoto(Image photo) {
		this.photo = photo;
	}
	
	/*
	 * This method is to get a prayer of archangels
	 * @pre: Object of Archangel != null;
	 * @param: empty
	 * @return: a prayer of Archangel
	 * @post: got a prayer of Archangel
	 */

	public String getPrayer() {
		return prayer;
	}
	
	/*
	 * This method is to set a prayer of archangels
	 * @pre: Object of Archangel != null;
	 * @param: String prayer
	 * @return: void
	 * @post: set a prayer of Archangel
	 */

	public void setPrayer(String prayer) {
		this.prayer = prayer;
	}
	
	

}
