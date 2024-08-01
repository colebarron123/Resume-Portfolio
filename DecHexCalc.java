package Lab_7;

import java.util.Scanner;

/*Cole Barron
 * This program is an old assignment of mine from 2021 and it showcases the use interfaces, implementation, 
 * and the extension of classes to build a calculator.
 */

//CalcOps Interface with hex to decimal conversion method

interface CalcOps {
	public int hexToDec(String hex);
}

//Calc class that implements CalcOps that has the 4 basic math functions and the implemented interface

class Calc implements CalcOps{
	public int Add(int num1, int num2) {
		return num1 + num2;
	}
	public int Subtract(int num1, int num2) {
		return num1 - num2;
	}
	public int Multiply(int num1, int num2) {
		return num1 * num2;
	}
	public int Divide(int num1, int num2) {
		return num1 / num2;
	}
	public int hexToDec(String hex) {
		return Integer.parseInt(hex, 16);
	}
}

//HexCalculator class that extends Calc to compute the hex base computations

class HexCalculator extends Calc{
	public String Add(String hex1, String hex2) {
		return Integer.toHexString(super.Add(super.hexToDec(hex1), super.hexToDec(hex2)));
	}
	public String Subtract(String hex1, String hex2) {
		return Integer.toHexString(super.Subtract(super.hexToDec(hex1), super.hexToDec(hex2)));
	}
	public String Multiply(String hex1, String hex2) {
		return Integer.toHexString(super.Multiply(super.hexToDec(hex1), super.hexToDec(hex2)));
	}
	public String Divide(String hex1, String hex2) {
		String divisor = Integer.toHexString(super.Divide(super.hexToDec(hex1), super.hexToDec(hex2)));
		String remainder = Integer.toHexString(super.Subtract(super.hexToDec(hex1),(super.Multiply(super.hexToDec(hex2), super.hexToDec(divisor)))));
		return divisor + " with remainder " + remainder;
	}
}

//Main class

public class DecHexCalc {
	public static void main(String args[]) {
		int answer, num1, num2;												//initializing variables
		int userIn = 0;
		String hex1, hex2;
		boolean green = true;
		Scanner scan = new Scanner(System.in);								//initializing Scanner object and the two calculator objects
		Calc obj1 = new Calc();
		HexCalculator obj2 = new HexCalculator();
		while((userIn <= 0) || (userIn >= 3)) {								//while loop prompting the user for a valid input
			System.out.println("Would you like to do calculations with decimal or hexadecimal numb"
			+ "ers? (1 for Decimal and 2 for Hexadecimal)");
			userIn = scan.nextInt();
			if((userIn <= 0) || (userIn >= 3)) {
				System.out.println("Try Again!");
			}
		}
		if(userIn == 1) {													//if statement for decimal based computations
			while(green == true) {											//while loop to continue prompting the user until they enter 0 to quit
				answer = Menu();
				switch(answer) {											//switch statement handling the user choosing from the 4 basic math functions
				case 0:														//case 0: loop ends
					System.out.println("You have chosen to exit.");
					green = false;
					break;
				case 1:														//case 1: decimal addition
					System.out.println("Please enter the first number: ");
					num1 = scan.nextInt();
					System.out.println("Please enter the second number: ");
					num2 = scan.nextInt();
					System.out.println(obj1.Add(num1, num2));
					break;
				case 2:														//case 2: decimal subtraction
					System.out.println("Please enter the first number: ");
					num1 = scan.nextInt();
					System.out.println("Please enter the second number: ");
					num2 = scan.nextInt();
					System.out.println(obj1.Subtract(num1, num2));
					break;
				case 3:														//case 3: decimal multiplication
					System.out.println("Please enter the first number: ");
					num1 = scan.nextInt();
					System.out.println("Please enter the second number: ");
					num2 = scan.nextInt();
					System.out.println(obj1.Multiply(num1, num2));
					break;
				case 4:														//case 4: decimal division
					System.out.println("Please enter the first number: ");
					num1 = scan.nextInt();
					System.out.println("Please enter the second number: ");
					num2 = scan.nextInt();
					System.out.println(obj1.Divide(num1, num2));
					break;
				}															//END switch
			}																//END while
		}																	//END if
		if(userIn == 2) {													//if statement for hexadecimal based computations
			while(green == true) {											//while loop to continue prompting the user until they enter 0 to quit
				answer = Menu();
				switch(answer) {											//switch statement handling the user choosing from the 4 basic math functions
				case 0:														//case 0: loop ends
					System.out.println("You have chosen to exit.");
					green = false;
					break;
				case 1:														//case 1: hex addition
					System.out.println("Please enter the first number: ");
					hex1 = scan.next();
					System.out.println("Please enter the second number: ");
					hex2 = scan.next();
					System.out.println(obj2.Add(hex1, hex2));
					break;
				case 2:														//case 2: hex subtraction
					System.out.println("Please enter the first number: ");
					hex1 = scan.next();
					System.out.println("Please enter the second number: ");
					hex2 = scan.next();
					System.out.println(obj2.Subtract(hex1, hex2));
					break;
				case 3:														//case 3: hex multiplication
					System.out.println("Please enter the first number: ");
					hex1 = scan.next();
					System.out.println("Please enter the second number: ");
					hex2 = scan.next();
					System.out.println(obj2.Multiply(hex1, hex2));
					break;
				case 4:														//case 4: hex division
					System.out.println("Please enter the first number: ");
					hex1 = scan.next();
					System.out.println("Please enter the second number: ");
					hex2 = scan.next();
					System.out.println(obj2.Divide(hex1, hex2));
					break;
				}															//END switch
			}																//END while
		}																	//END if
	}																		//END main
	public static int Menu() {												//menu method for printing the menu and accepting the user input
		int answer;
		Scanner scan = new Scanner(System.in);
		System.out.println("---MENU--- ");
		System.out.println("0 - Exit");
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		System.out.println("Please choose an option: ");
		answer = scan.nextInt();
		return answer;
	}
}

