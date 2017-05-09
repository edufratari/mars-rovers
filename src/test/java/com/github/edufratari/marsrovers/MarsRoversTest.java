package com.github.edufratari.marsrovers;
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

		RoboticRovers roboticRovers2 = new RoboticRovers(0, 0, "N", plateau);
		roboticRovers2.setPosition(3, 3, "E");
		roboticRovers2.command("MMRMMRMRRM");

		assertEquals("Erro", "5 1 E", roboticRovers2.getCurrentPosition());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void thirdInputTest() {

		Plateau plateau = new Plateau(5, 5);

		RoboticRovers roboticRovers1 = new RoboticRovers(0, 0, "N", plateau);
		roboticRovers1.setPosition(6, 6, "E");
		roboticRovers1.command("M");
	}
}
