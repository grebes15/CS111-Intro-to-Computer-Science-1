//*************************************************************************************************************************************
//Andreas Landgrebeb cs111 fall semester 2012
//
//Lab 7 Problem 4
//
//design and implement an application that rolls a apir of dice 10,000 times, counting the number of box cars, two sixes) that occur.
//*************************************************************************************************************************************

public class Roller1
{
    public static void main(String[] args)
    {
	PairOfDice pod = new PairOfDice();
	int count = 0;
	int boxCars = 0;
	int count1 = 0;
	while (count1 < 100)
	    {
		
	while (count < 10000)
	    {
		if(pod.roll()==12)
		    boxCars = boxCars + 1;
		count = count + 1;
	    }
	count1 = count1 + 1;
	    }
	System.out.println("The number of boxCars is " + boxCars);
    }
}