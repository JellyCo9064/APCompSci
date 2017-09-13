/*
 * Author: Connor Aksama
 * Project Name: 3_3RomaNum
 * File Name: main.java
 * Purpose: Conditional Exec.
 * Pseudocode: Check for each barrier value, add to string, subtract from total.
 * Maintenance Log: 9/13 Done.
 */

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);

		System.out.println("Enter number to convert: ");
		int input = console.nextInt();
		String output = "";

		if (input < 4000) {
			while (input >= 1000) {
				output += "M";
				input -= 1000;
			}
			if (input >= 900) {
				output += "CM";
				input -= 900;
			}
			if (input >= 500) {
				output += "D";
				input -= 500;
			}
			if (input >= 400) {
				output += "CD";
				input -= 400;
			}
			while (input >= 100) {
				output += "C";
				input -= 100;
			}
			if (input >= 90) {
				output += "XC";
				input -= 90;
			}
			if (input >= 50) {
				output += "L";
				input -= 50;
			}
			while (input >= 10) {
				output += "X";
				input -= 10;
			}
			if (input == 9) {
				output += "IX";
				input -= 9;
			}
			if (input >= 5) {
				output += "V";
				input -= 5;
			}
			if (input == 4) {
				output += "IV";
				input -= 4;
			}
			while (input > 0) {
				output += "I";
				input -= 1;
			}

			System.out.println(output);
		}
		else{
			System.out.println("TOO MUCH");
		}
		console.close();
	}

}
