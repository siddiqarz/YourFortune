package getfortune;

import java.text.NumberFormat;
import java.util.Scanner;

public class YourFortune {
	public static void main(String[] args) {
		java.util.Scanner input = new Scanner(System.in);
		{
			// asks for firstname
			System.out.println("Please enter your first name: ");
			String firstName = input.nextLine();

			// quit program if input is quit
			if (firstName.equalsIgnoreCase("quit")) {
				System.out.println("Nobody Likes a Quitter...");
				System.exit(0);
			}
			System.out.println("Hello " + firstName + " let's take a stab at your fortune.");

			// asks for lastname
			System.out.println("Please enter your last name: ");
			String lastName = input.nextLine();

			// quit program if input is quit
			if (lastName.equalsIgnoreCase("quit")) {
				System.out.println("Nobody Likes a Quitter...");
				System.exit(0);
			}

			// inputs age as a string
			System.out.println("How old are you?");
			String checkAge = input.nextLine();

			// Checks if used typed quit
			if (checkAge.equalsIgnoreCase("quit")) {
				System.out.println("Nobody Likes a Quitter...");
				System.exit(0);
			}

			// converts age of String to an Integer
			int age = Integer.parseInt(checkAge);

			String newAge = "";
			if (age < 16) {
				System.out.println("Your future is too far away to see, try again when you add an inch or two.");
				System.exit(0);
			} else if (age >= 16 && age % 2 == 0) {
				newAge = "two decades";
			} else {
				newAge = "five years";
			}
			int month = 0;
//			boolean birthMonth = false;
			while (true) {
				System.out.println("What month were you born in?");
				String checkMonth = input.nextLine();

				try {
					month = Integer.parseInt(checkMonth);
					if (month < 1 || month > 12) {
						System.out.println("Sure, and I was born on Mars in a spacesuit.");
						System.out.println("What month were you born in?");
						month = input.nextInt();
						break;
					} else {
						break;
					}

				} catch (Exception e) {

					if (checkMonth.equalsIgnoreCase("quit")) {
						System.out.println("Nobody likes a quitter...");
						System.exit(0);
					} else {
						System.out.println("Please use numbers only.");
					}
				}

			}
			
			double bankBalance = 0.00;
			NumberFormat formatter = NumberFormat.getCurrencyInstance();
			if (month >= 1 && month < 4) {
				bankBalance = 3556457.01;
			} else if (month >= 4 && month < 7) {
				bankBalance = 10003.45;
			} else if (month >= 7 && month < 10) {
				bankBalance = 50.8;
			} else {
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
					helpColor = true;
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
			} else
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
					vacationHome = "the Bermuda Triangle";

				}
			System.out.println(
					firstName + " " + lastName + " will retire in " + newAge + " with " + formatter.format(bankBalance)
							+ " in the bank, a vacation home in " + vacationHome + " and travel by " + color);

		}
		input.close();
	}

}
