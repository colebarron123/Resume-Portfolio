package cs3305;

/**Cole Barron
 * This is a program I made in the Fall of 2022. It is a US capitals game!
 * You will be prompted with 5 questions each asking for the captial of a state.
 * At the end, it give you your score!
 */

import java.util.Scanner;													//Importing Scanner and random
import java.util.Random;

public class Capitals {														//Class Start
	
	static String[][] capstate = {{"Alabama", "Montgomery"},				//Static list with states and capitals
			 {"Alaska", "Juneau"},
			 {"Arizona", "Phoenix"},
			 {"Arkansas", "Little Rock"},
			 {"California", "Sacramento"},
			 {"Colorado", "Denver"},
			 {"Connecticut", "Hartford"},
			 {"Delaware", "Dover"},
			 {"Florida", "Tallahassee"},
			 {"Georgia", "Atlanta"},
			 {"Hawaii", "Honolulu"},
			 {"Idaho", "Boise"},
			 {"Illinois", "Springfield"},
			 {"Maryland", "Annapolis"},
			 {"Minnesota", "Saint Paul"},
			 {"Iowa", "Des Moines"},
			 {"Maine", "Augusta"},
			 {"Kentucky", "Frankfort"},
			 {"Indiana", "Indianapolis"},
			 {"Kansas", "Topeka"},
			 {"Louisiana", "Baton Rouge"},
			 {"Oregon", "Salem"},
			 {"Oklahoma", "Oklahoma City"},
			 {"Ohio", "Columbus"},
			 {"North Carolina", "Raleigh"},
			 {"North Dakota", "Bismark"},
			 {"New York", "Albany"},
			 {"New Mexico", "Santa Fe"},
			 {"New Jersey", "Trenton"},
			 {"New Hampshire", "Concord"},
			 {"Nevada", "Carson City"},
			 {"Nebraska", "Lincoln"},
			 {"Montana", "Helena"},
			 {"Missouri", "Jefferson City"},
			 {"Mississippi", "Jackson"},
			 {"Massachusettes", "Boston"},
			 {"Michigan", "Lansing"},
			 {"Pennslyvania", "Harrisburg"},
			 {"Rhode Island", "Providence"},
			 {"South Carolina", "Columbia"},
			 {"South Dakota", "Pierre"},
			 {"Tennessee", "Nashville"},
			 {"Texas", "Austin"},
			 {"Utah", "Salt Lake City"},
			 {"Vermont", "Montpelier"},
			 {"Virginia", "Richmond"},
			 {"Washington", "Olympia"},
			 {"West Virginia", "Charleston"},
			 {"Wisconsin", "Madison"},
			 {"Wyoming", "Cheyenne"}};
	
	public static void main(String args[]) {									//Main Start
		
		Scanner scan = new Scanner(System.in);									//Scanner created
		Random rand = new Random();												//Random created
		int count = 0;															//count initialized
		int randomstate = 0;													//randomstate initialized
		int score = 0;															//score initialized
		String UserIn;															//UserIn initialized
		while (count < 5) {														//While Start while count is less than 5
			randomstate = rand.nextInt(50);										//get random number
			System.out.println("What is the capital of: " + capstate[randomstate][0]);			//Prompting user with random capital
			UserIn = scan.nextLine();															//collecting user input
			if(UserIn.toLowerCase().equals(capstate[randomstate][1].toLowerCase())) {			//if start when user is correct
				System.out.println("Correct, You get a point!!");								//printing correct statement
				score++;																		//score up 1
				System.out.println("You now have " + score + " points!!\n");					//Printing score
			} else {																			//if End else Start
				System.out.println("Wrong, no points for you\n");								//printing wrong statement
			}																					//else End
			count++;																			//count up 1		
		}																		//while end
		if(score <=2) {															//if start when score is at or below 2
			System.out.println("You got " + score + ", better luck next time");		//Printing appropriate statement
		} else if(score >=3) {													//if end else if start when score is at or above 3
			System.out.println("You got " + score + ", nice job!!");			//printing appropriate statement
		}																		//if end
		
	}																			//Main End
	
}																				//Class End
