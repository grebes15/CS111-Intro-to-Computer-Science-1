//***********************************************************************************************************************
//Andreas Landgrebe cs11 fall semester 2012
//
//Lab 4 Problem 1
//
//read an application that reads the (x,y) coordiantes for two points. Then print out the distance between the two points
//***********************************************************************************************************************

import java.util.Scanner;
public class Problem1 {

    public static void main (String[] args)
    {
	int x1, x2, y1, y2;//these are the points that will be in the distance formula
	Scanner input = new Scanner (System.in);
	
	System.out.println("enter first number x1");
	x1 =  input.nextInt();
	
	System.out.println("enter second number x2");
	x2 =  input.nextInt();

	System.out.println("enter third number y1");
	y1 =  input.nextInt();

	System.out.println("enter four number y2");
	y2 = input.nextInt();

	double distance;//this is the distance that will be calculated
	distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));//this find the distance between the two points

	System.out.println("the distance between the two points" + distance);
    }
}
	
	

	