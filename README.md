# Mars Rovers

## Introduction

This application is used to create robotics rovers on a plateau. The rovers have to walk on the plateau without exceeding their limits.

## Problem Description 

A squad of robotic rovers are to be landed by NASA on a plateau on Mars. This plateau, which is curiously rectangular, must be navigated by the rovers so that their on-board cameras can get a complete view of the surrounding terrain to sen. back to Earth.

A rover's position and location is represented by a combination of x and y co-ordinates and a letter representing one of the four cardinal compass points. The plateau is divided up into a grid to simplify navigation. Na example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North.

In order to control a rover, NASA sends a simple estringi of letters. The possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the rover spin 90 degrees left or right respectively, without moving from its current spot. 'M' means move forward one grid point, and maintain the same heading.
###### Input:
The first line of input is the upper-right coordinates of the plateau, the lower-left coordinates are assumed to be 0,0.

The rest of the input is information pertaining to the rovers that have been deployed. Each rover has two lines of input. The first line gives the rover's position, and the second line is a series of instructions telling the rover how to explore the plateau.

The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rover's orientation.
Each rover will be finished sequentially, which means that the second rover mont. start to move until the first one has finished moving.
###### Output:
The output for each rover should be its final co-ordinates and heading.
###### Test Input:
Plateau size: 5x5

First input: 1 2 N

Command: LMLMLMLMM

Second input: 3 3 E

Command:: MMRMMRMRRM
###### Expected Output:
First output: 1 3 N

Second output:5 1 E

##  Technologies Used
Java 1.8

JUnit 4 for the tests

## Running Tests and Compiiling
To running the tests and compile with maven you have to install maven in your machine. After that, you have to put maven into environment variables so that it is possible to execute the mvn commands in command prompt.

To build the project and run the tests use **mvn clean install**. Certify you are in the correct directory.

On the same directory as jar file, simply execute the command **java -jar Name_of_archive** and enter the data.