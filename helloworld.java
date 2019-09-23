package helloworld;

import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
public class helloworld
{
	public static void main(String[] args) throws InterruptedException
	{   String newline = System.lineSeparator(); System.out.println(newline + "******•••••******••••Welcome to Java Sorting applicationººººº••••••••ºººººººººº¶¶¶¶¶¶§§§§§§§§" + newline);	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the option for dataset :" + newline);
	System.out.print("1. 100		");
	System.out.print("2. 1000		");
	System.out.print("3. 10000		");
	System.out.println("4.  20000 	" + newline);


	int n = input.nextInt();
	int[] myIntArray = new int[n];
	for (int i = 0; i < myIntArray.length; i++) 
	{
		myIntArray[i] = (int) (Math.random() * (n+1));
	}
	System.out.println(Arrays.toString(myIntArray));

	long starttimeB = System.nanoTime();
	boolean Sorted = false;
	int temp;

	while(!Sorted)
	{
		Sorted = true;

		for(int i=0; i < myIntArray.length - 1; i++)
		{
			if(myIntArray[i] > myIntArray[i+1])
			{
				temp = myIntArray[i];
				myIntArray[i] = myIntArray[i+1];
				myIntArray[i+1] = temp;
				Sorted = false;
			}
		}
	}TimeUnit.SECONDS.sleep(3);
	long endtimeB = System.nanoTime();
	long timeelapsed = endtimeB - starttimeB;
	System.out.println(Arrays.toString(myIntArray));
	System.out.println("Time Elapsed in Bubble Sort Execution	"+timeelapsed+ newline);

	// Insertion Sort Logic:-	
	long starttimeI=System.nanoTime();
	for (int i = 1; i < myIntArray.length; i++) {
		int current = myIntArray[i];
		int j = i - 1;
		while(j >= 0 && current < myIntArray[j]) {
			myIntArray[j+1] = myIntArray[j];
			j--;
		}
		TimeUnit.SECONDS.sleep(3);
		myIntArray[j+1] = current;
	}long endtimeI = System.nanoTime();

	System.out.println(Arrays.toString(myIntArray));

	long timeelapsedI = endtimeI - starttimeI;
	System.out.println("Time Elapsed in Insertion Sort Execution:	"+ timeelapsedI+ newline);
	//Selection Sort logic:-

	long starttimeS = System.nanoTime();
	for (int i = 0; i < myIntArray.length; i++) {
		int min = myIntArray[i];
		int minId = i;

		for (int j = i+1; j < myIntArray.length; j++) {
			if (myIntArray[j] < min) {
				min = myIntArray[j];
				minId = j;
			}
		}
		TimeUnit.SECONDS.sleep(3);
		// swapping
		int temp1 = myIntArray[i];
		myIntArray[i] = min;
		myIntArray[minId] = temp1;

		long endtimeS = System.nanoTime();
		long timeelapsedS = endtimeS - starttimeS; System.out.println("Time Elapsed in Selection Sort Execution	" + timeelapsedS + newline);
		System.out.println(Arrays.toString(myIntArray));}
//		        //class Timeutil
//		        {

	}
    }



