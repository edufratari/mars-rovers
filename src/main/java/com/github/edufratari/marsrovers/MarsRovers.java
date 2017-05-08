package com.github.edufratari.marsrovers;

public class MarsRovers {
	
	public static void main(String[] args) {
		
		Plateau plateau = new Plateau(5, 5);
		
		RoboticRovers roboticRovers1 = new RoboticRovers(0, 0, "N", plateau);
		RoboticRovers roboticRovers2 = new RoboticRovers(0, 0, "N", plateau);
			
		roboticRovers1.setPosition(1, 2, "N");
		roboticRovers1.command("LMLMLMLMM");
		roboticRovers1.printPosition();
		
		roboticRovers2.setPosition(3, 3, "E");
		roboticRovers2.command("MMRMMRMRRM");
		roboticRovers2.printPosition();	
	}
}
