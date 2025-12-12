package ppractise;

import java.util.Scanner;

public class weekDay {

	public static void main(String[] args) {

		System.out.print("Enter weekday : ");
		Scanner scn = new Scanner(System.in);
		String weekDay = scn.nextLine();

		switch (weekDay) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			System.out.println(weekDay + " is weekday ");
			break;

		case "Saturday":
		case "Sunday":
			System.out.println(weekDay + " is weekend");

			default :
				System.out.println("Enter value is not matched ");
		}

	}
}