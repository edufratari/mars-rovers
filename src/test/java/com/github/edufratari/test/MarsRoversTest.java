package com.github.edufratari.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.edufratari.marsrovers.Plateau;
import com.github.edufratari.marsrovers.RoboticRovers;

public class MarsRoversTest {
	
	@Test
	public void firstInputTest(){
		
		Plateau plateau = new Plateau(5, 5);
		
		RoboticRovers roboticRovers1 = new RoboticRovers(0, 0, "N", plateau);
		roboticRovers1.setPosition(1, 2, "N");
		roboticRovers1.command("LMLMLMLMM");
		
		assertEquals("Erro", "1 3 N", roboticRovers1.getCurrentPosition());
	}
	
	@Test
	public void secondInputTest() {

		Plateau plateau = new Plateau(5, 5);

		RoboticRovers roboticRovers1 = new RoboticRovers(0, 0, "N", plateau);
		roboticRovers1.setPosition(3, 3, "E");
		roboticRovers1.command("MMRMMRMRRM");

		assertEquals("Erro", "5 1 E", roboticRovers1.getCurrentPosition());
	}
}
