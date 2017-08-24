/**
 * File Name: FunApp.java<br>
 * KHIN, EI EI<br>
 * Created: Aug 23, 2017
 */
package com.sqa.eiei;

import com.sqa.eiei.helpers.*;

public class FunApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = AppBasics.greetUserAndGetName("Java Fundamentals");
		checkGradeValue();
		checkMonth();
		checkNumberAgainst10();
		AppBasics.farewellUser(name);
	}

	private static void checkGradeValue() {
		System.out.println("Check the grade value");
		double gradeValue = AppBasics.requestDouble("Can i get your grade value");
		if (gradeValue >= 90) {
			System.out.print("You got an A");
		} else if (gradeValue >= 70) {
			System.out.print("You got an B");
		} else if (gradeValue >= 50) {
			System.out.println("You got an C");
		} else {
			System.out.println("You got an F");
		}
	}

	private static void checkMonth() {
		// int num = 0;
		// JOptionPane.showInputDialog(null, "Enter the month!", "Month 1-12",
		// JOptionPane.INFORMATION_MESSAGE);
		System.out.println("Check the numer with Swith");
		int userMonth = AppBasics.requestInt("Can i get a month number");
		switch (userMonth) {
		case 1:
			System.out.println("The month is January");
			break;
		case 2:
			System.out.println("The month is February");
			break;
		case 3:
			System.out.println("The month is March");
			break;
		case 4:
			System.out.println("The month is April");
			break;
		case 5:
			System.out.println("The month is May");
			break;
		case 6:
			System.out.println("The month is June");
			break;
		case 7:
			System.out.println("The month is July");
			break;
		case 8:
			System.out.println("The month is August");
			break;
		case 9:
			System.out.println("The month is September");
			break;
		case 10:
			System.out.println("The month is October");
			break;
		case 11:
			System.out.println("The month is November");
			break;
		case 12:
			System.out.println("The month is December");
			break;
		default:
			System.out.println("The number is invalid");
		}
	}

	private static void checkNumberAgainst10() {
		System.out.println("Check Number Against 10");
		int username = AppBasics.requestInt("Can I get a number to check against 10?");
		if (username > 10) {
			System.out.println("Number is greater than 10 [" + username + "]");
		} else if (username < 10) {
			System.out.println("Number is less than 10 [" + username + "]");
		} else {
			System.out.println("Number is equal to 10");
		}
	}
}
