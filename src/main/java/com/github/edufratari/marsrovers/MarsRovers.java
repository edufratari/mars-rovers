package com.github.edufratari.marsrovers;

import java.util.Scanner;

public class MarsRovers {
	
	public static void main(String[] args) {

		Plateau plateau = new Plateau(5, 5);

		RoboticRovers roboticRovers1 = new RoboticRovers(0, 0, "N", plateau);
		RoboticRovers roboticRovers2 = new RoboticRovers(0, 0, "N", plateau);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the value of the  xPosition, yPosition and direction of rover 1: ");
		String line = scanner.nextLine();
		String[] parts = line.split(" ");
		int x = Integer.parseInt(parts[0]);
		int y = Integer.parseInt(parts[1]);
		String n = parts[2];
		System.out.println("Enter the command for the rover 1: ");
		String c = scanner.nextLine();
		
		roboticRovers1.setPosition(x, y, n);
		roboticRovers1.command(c);
		roboticRovers1.printPosition();

		
		//Scanner s1 = new Scanner(System.in);

		System.out.println("Enter the value of the  xPosition, yPosition and direction of rover 2: ");
		String line1 = scanner.nextLine();
		String[] parts1 = line1.split(" ");
		int x1 = Integer.parseInt(parts1[0]);
		int y1 = Integer.parseInt(parts1[1]);
		String n1 = parts1[2];
		System.out.println("Enter the command for the rover 2: ");
		String c1 = scanner.next();
		
		roboticRovers2.setPosition(x1, y1, n1);
		roboticRovers2.command(c1);
		roboticRovers2.printPosition();
	}
}