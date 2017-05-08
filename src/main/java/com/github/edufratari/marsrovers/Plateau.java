package com.github.edufratari.marsrovers;

public class Plateau {
	
	private int xPosition;
	private int yPosition;

	public Plateau(int xPosition, int yPosition){
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}
	
	public Plateau(){
		this(5, 5);
	}
	
	public int getxPosition() {
		return xPosition;
	}
	
	public int getyPosition() {
		return yPosition;
	}
}
