package com.github.edufratari.marsrovers;

import java.util.Scanner;

public class MarsRovers {
	
	public static void main(String[] args) {
		
		Plateau plateau = new Plateau(5, 5);
		
		RoboticRovers roboticRovers1 = new RoboticRovers(0, 0, "N", plateau);
		
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("Enter the value of the  x position: ");
			int x = s.nextInt();
			System.out.println("Enter the value of the y position: ");
			int y = s.nextInt();
			System.out.println("Enter the direction in which the rover is positioned (N, S, E, W): ");
			String dir = s.next();
			System.out.println("Enter the command for the rover: ");
			String n = s.next();

			roboticRovers1.setPosition(x, y, dir);
			roboticRovers1.command(n);
			roboticRovers1.printPosition();
		}
	}
}