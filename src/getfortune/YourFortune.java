package getfortune;

import java.text.NumberFormat;
import java.util.Scanner;

public class YourFortune {
	public static void main(String[] args) {
		java.util.Scanner input = new Scanner(System.in);
		{
			System.out.println("Please enter your first name: ");
			String firstName = input.nextLine();
			System.out.println("Hello " + firstName + " let's take a stab at your fortune.");
			System.out.println("Please enter your last name: ");
			String lastName = input.nextLine();

			System.out.println("How old are you?");
			int age = input.nextInt();
			String newAge = "";
			if (age < 16) {
				System.out.println("Your future is too far away to see, try again when you add an inch or two.");
				System.exit(0);
			} else if (age >= 16 && age % 2 == 0) {
				newAge = "two decades";
			} else {
				newAge = "five years";
			}
			System.out.println("What month were you born in?");
			int month = 0;
			boolean birthMonth = false;
			while (birthMonth == false) {
				try {
					month = input.nextInt();
					birthMonth = true;
				} catch (Exception e) {
					System.out.println("Please use numbers only.");
					input.nextLine();
				}
			}
			if (month < 1 || month > 12) {
				System.out.println("Sure, and I was born on Mars in a spacesuit.");
				return;
			}
			input.nextLine();
			double bankBalance = 0.00;
			NumberFormat formatter = NumberFormat.getCurrencyInstance();
			if (month >= 1 && month < 4) {
				bankBalance = 3556457.01;
			} 
			else if (month >= 4 && month < 7) {
				bankBalance = 10003.45;
			} 
			else if (month >= 7 && month < 10) {
				bankBalance = 50.8;
			} 
			else {
				bankBalance = 0.00;
			}

			boolean helpColor = false;
			String color = "";
			while (helpColor == false) {
				System.out.println(
						"Please enter your favorite ROYGBIV color, request 'help', if you're unsure of the options: ");
				color = input.nextLine();
				if (color.equalsIgnoreCase("help")) {
					System.out.println("The colors are: Red, Orange, Yellow, Green, Blue, Indigo or Violet");
				} else {
					break;
				}
			}
			

			switch (color.toLowerCase()) {
			case "red":
				color = "Horse and carriage";
				break;
			case "orange":
				color = "Motorbike";
				break;
			case "yellow":
				color = "Mazda";
				break;
			case "green":
				color = "Helicopter";
			case "blue":
				color = "Rikshaw";
				break;
			case "indigo":
				color = "Bat Mobile";
				break;
			case "violet":
				color = "Bugatti";
				break;
			default:
				color = "Donkey";
			}
		
		
		System.out.println("How many siblings do you have?");
		int numberOfSiblings = input.nextInt();
		String vacationHome = "";
		
		if (numberOfSiblings > 3) {
			vacationHome = "Dubai";
		} 
		else {
			switch (numberOfSiblings) {
			case 0:
				vacationHome = "Kenya";
				break;
			case 1:
				vacationHome = "Brazil";
				break;
			case 2:
				vacationHome = "California";
				break;
			default:
				vacationHome = "Bermuda Triangle";
			}
		
		System.out.println(firstName + " " + lastName + " will retire in " + newAge + " with " + formatter.format(bankBalance)
						+ " in the bank, a vacation home in " + vacationHome + " and travel by " + color);

		}
	}
	}

}
