package com.github.edufratari.marsrovers;

public class RoboticRovers {

	private String direction;
	private Plateau plateau;

	private int xPosition = 0;
	private int yPosition = 0;

	public RoboticRovers(int xPosition, int yPosition, String direction, Plateau plateau) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.direction = direction;
		this.plateau = plateau;
	}

	public RoboticRovers() {
		this(0, 0, "N", null);
	}

	public void setPosition(int xPosition, int yPosition, String direction) {
		if (xPosition <= this.plateau.getxPosition() && yPosition <= this.plateau.getyPosition() ) {
			this.xPosition = xPosition;
			this.yPosition = yPosition;
			this.direction = direction;
		} else
			throw new IllegalArgumentException("Out of Plateau!");
	}

	public void printPosition() {
		System.out.println(xPosition + " " + yPosition + " " + direction);
	}
	
	public String getCurrentPosition(){
		return xPosition + " " + yPosition + " " + direction;
	}

	public void move() {
		switch (direction) {
		case "N":
			yPosition++;
			break;
		case "S":
			yPosition--;
			break;
		case "E":
			xPosition++;
			break;
		case "W":
			xPosition--;
			break;
		}
	}

	public void turnLeft() {
		switch (direction) {
		case "N":
			direction = "W";
			break;
		case "S":
			direction = "E";
			break;
		case "E":
			direction = "N";
			break;
		case "W":
			direction = "S";
			break;
		}
	}

	public void turnRight() {
		switch (direction) {
		case "N":
			direction = "E";
			break;
		case "S":
			direction = "W";
			break;
		case "E":
			direction = "S";
			break;
		case "W":
			direction = "N";
			break;
		}
	}

	public void command(String instruction) {
		for (int i = 0; i < instruction.length(); i++) {
			char cmd = instruction.charAt(i);
			switch (cmd) {
			case 'M':
				move();
				break;
			case 'L':
				turnLeft();
				break;
			case 'R':
				turnRight();
				break;
			default:
				break;
			}

		}
	}
}
