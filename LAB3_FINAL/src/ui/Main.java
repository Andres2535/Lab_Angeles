package ui;

import java.util.Scanner;
import model.*;

public class Main {
	
	public Main() {
		this.number = 0;
		control = new UpperMaximum(0);
	}
	
	//Attributtes
	
	private Scanner entrie;
	private Scanner entrie2;
	private Scanner entrie1;
	private int number;
	
	//Relations
	private UpperMaximum control;

	public static void main(String[] args) {
		Main program = new Main();
		program.start();

	}
	
	/*
	 * This method is to get a number of Main
	 * @pre: Main != null;
	 * @param: empty
	 * @return: a int number of Main
	 * @post: got a number of Main
	 */
	
	public int getNumber() {
		return number;
	}
	
	/*
	 * This method is to set a number of Main
	 * @pre: Main != null;
	 * @param: int number
	 * @return: void
	 * @post: set a number of Main
	 */

	public void setNumber(int number) {
		this.number = number;
	}
	
	/*
	 * This method is to initialize the relations
	 * @pre: Main != null;
	 * @param: empty
	 * @return: void
	 * @post: initialize the relations
	 */

	public void start() {
		entrie1 = new Scanner(System.in);
		System.out.println("Before to start, please give me a number of Archangel's"
				+ "that do you like create");
		int count = entrie1.nextInt();
		setNumber(count);
		control = new UpperMaximum(number);
		
		menu();
		
		
	}
	
	/*
	 * This method is to print a menu
	 * @pre: Main != null;
	 * @param: empty
	 * @return: void
	 * @post: print menu
	 */
	
	public void menu() {
		entrie = new Scanner(System.in);
		entrie2 = new Scanner(System.in);
		System.out.println("         ****************");
		System.out.println("\t ¡WELCOME TO HEAVEN!");
		System.out.println("         ****************");
		System.out.println("-¿What would you like to do??");
		System.out.println("");
		System.out.println("*****************");
		System.out.println("[1]. Enter a new Archangel");
		System.out.println("[2]. How many Archangels are there?");
		System.out.println("[3]. Information about archangel by name");
		System.out.println("[4]. Information about archangel by power");
		System.out.println("[5]. Information about archangel´s celebration by month that is celebrate");
		System.out.println("[6]. Information about all archangel's celebrate");
		System.out.println("");
		System.out.println("*****************");
		System.out.println("[0]. Exit");
		System.out.println("");

		int option = entrie.nextInt();
		if(option == 1) {
			if(number == 0) {
				System.out.println("You cant create more Archangels");
				menu();
			}
			number--;
			option1();
			
		}else if(option == 2) {
			option2();
		}else if(option == 3) {
			option3();
		}else if(option == 4) {
			option4();
		}else if(option == 5) {
			option5();
		}else if(option == 6) {
			option6();
		}else if(option == 0) {
			
		}else {
			System.out.println("Ingrese una opcion correcta");
			menu();
		}
	}
	
	/*
	 * This method is when the user select a option1 (create a new archangel)
	 * @pre: Main != null;
	 * @param: empty
	 * @return: void
	 * @post: new archangel
	 */
	
	public void option1() {
		System.out.println("*Enter a name of Archangel: (Remember that the name has the prefix 'el' at the end");
		String name = entrie2.nextLine();
		int length = name.length();
		if(name.charAt(length-1) == 'l' && name.charAt(length-2) == 'e') {
			System.out.println("*******************************");
			System.out.println("*Enter a prayer of Archangel:");
			String prayer = entrie2.nextLine();
			System.out.println("*******************************");
			System.out.println("*Enter a power of Archangel:");
			String power = entrie2.nextLine();
			System.out.println("*******************************");
			System.out.println("*Enter a date of Archangel's Celebration:");
			System.out.println("\t-What is the month (Letters)");
			String month = entrie2.nextLine();
			System.out.println("*******************************");
			System.out.println("\t-What is the day? (Numbers)");
			int day = entrie.nextInt();
			System.out.println("*******************************");
			System.out.println("*Enter a special candle of Archangel:");
			System.out.println("\t-What is the color: ");
			String color = entrie2.nextLine();
			System.out.println("*******************************");
			System.out.println("\t-What is the size: (Letters)");
			String size = entrie2.nextLine();
			System.out.println("*******************************");
			System.out.println("\t -What is the essence:");
			String essence = entrie2.nextLine();
			System.out.println("*******************************");
			System.out.println("\t -What is the grade of illuminance: (Numbers)");
			int grade = entrie.nextInt();
			System.out.println("*******************************");
			
			SpecialCandle currentS = new SpecialCandle(color, size, essence, grade);
			Celebration currentC = new Celebration(month, day);
			Archangel currentA = new Archangel(name,prayer,power,currentC,currentS);
			
			control.getArchangels()[getNumber()] = currentA;
			
			System.out.println("¡Successful archangel registration!");
			
			System.out.println("*******************************");
			System.out.println("\n");
			
			menu();
		}else {
			System.out.println("The name should end with 'el'");
			option1();
		}
		
		
		
		
	}
	
	/*
	 * This method is when the user select a option2 (amount of archangel)
	 * @pre: Main != null;
	 * @param: empty
	 * @return: void
	 * @post: amount of archangels
	 */
	
	public void option2() {
		System.out.println("-There are " + control.amountOfArchangels() + " Archangel's");
		System.out.println("*******************************");
		System.out.println("\n");
		menu();
	}
	
	/*
	 * This method is when the user select a option3 (search a archangel based his name)
	 * @pre: Main != null;
	 * @param: empty
	 * @return: void
	 * @post: print a archangel's information
	 */
	
	public void option3() {
		System.out.println("What is the name of the Archangel?");
		String name = entrie2.nextLine();
		System.out.println("*******************************");
		Archangel current = control.search(name);
		if(current == null) {
			System.out.println("The archangel doesnt exit");
			System.out.println("*******************************");
			System.out.println("\n");
			menu();
		}else {
			System.out.println("***************************************************");
			System.out.println("*The name of archangel is: " + current.getName());
			System.out.println("*The photo of archangel is: " + current.getPhoto());
			System.out.println("*The prayer of archangel is: " + current.getPrayer());
			System.out.println("*The power of archangel is: " + current.getPower());
			System.out.println("*The celebration date of that archangel is: " + current.getCelebration().getMonth() + " " + current.getCelebration().getDay()+ "th");
			System.out.println("*The special candle of archangel is: ");
			System.out.println("*Color: " + current.getCandle().getColor());
			System.out.println("*Size: " + current.getCandle().getSize());
			System.out.println("*Essence: " + current.getCandle().getEssence());
			System.out.println("*Grade of illuminance: " + current.getCandle().getGradeOfIlluminance());
			System.out.println("***************************************************");
			System.out.println("\n");
			menu();
		}
	}
	
	/*
	 * This method is when the user select a option4 (search archangels based his power)
	 * @pre: Main != null;
	 * @param: empty
	 * @return: void
	 * @post: print Archangel´s information
	 */
	
	public void option4() {
		System.out.println("What is the power of the Archangel?");
		String power = entrie2.nextLine();
		System.out.println("*******************************");
		Archangel current = control.searchPower(power);
		if(current == null) {
			System.out.println("The archangel doesnt exit");
			System.out.println("*******************************");
			System.out.println("\n");
			menu();
		}else {
			System.out.println("***************************************************");
			System.out.println("*The name of archangel is: " + current.getName());
			System.out.println("*The photo of archangel is: " + current.getPhoto());
			System.out.println("*The prayer of archangel is: " + current.getPrayer());
			System.out.println("*The power of archangel is: " + current.getPower());
			System.out.println("*The celebration date of that archangel is: " + current.getCelebration().getMonth() + " " + current.getCelebration().getDay()+ "th");
			System.out.println("*The special candle of archangel is: ");
			System.out.println("*Color: " + current.getCandle().getColor());
			System.out.println("*Size: " + current.getCandle().getSize());
			System.out.println("*Essence: " + current.getCandle().getEssence());
			System.out.println("*Grade of illuminance: " + current.getCandle().getGradeOfIlluminance());
			System.out.println("***************************************************");
			System.out.println("\n");
			menu();
	}

	}
	/*
	 * This method is when the user select a option5 (search a Archangel based his celebration)
	 * @pre: Main != null;
	 * @param: empty
	 * @return: void
	 * @post: print Archangel's information
	 */
	
	public void option5() {
		System.out.println("What month is celebrate");
		String month = entrie2.nextLine();
		System.out.println("*******************************");
		System.out.println(control.searchCelebration(month));
		System.out.println("*******************************");
		System.out.println("\n");
		menu();
	}
	
	/*
	 * This method is when the user select a option6 (print all celebration)
	 * @pre: Main != null;
	 * @param: empty
	 * @return: void
	 * @post: print all Celebrations of archangels
	 */
	
	public void option6() {
		System.out.println(control.allCelebration());
		System.out.println("*******************************");
		System.out.println("\n");
		menu();
	}
	
	
}
