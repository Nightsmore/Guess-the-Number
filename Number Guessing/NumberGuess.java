/* Importing the input/output class library,
and utilities. 
I've chosen to import the entirety of them
because performance won't be an issue for a program  this small.
*/ 

import java.io. *;
import java.util.*;

public class NumberGuess {

	public static void main(String[] args) 
	{

        //declaring integers.
		int randNum, guessNum, attemptNum;

        //generating a random number. 
		randNum = new Random().nextInt(10) + 1;
		System.out.println("I am thinking of a number from 1 to 10");
		System.out.println("You have 3 attempts to guess what it is.");
        
        //loops a total of 3 times, unless guessed correctly.
        for ( attemptNum = 0; attemptNum <= 2; ) 
        {
        	System.out.println("What's your guess?");
        	Scanner scan = new Scanner(System.in);
        	//Gets user input
        	//prints message and breaks if guessed correctely.
        	try 
        	{
        		guessNum = scan.nextInt();
        		System.out.println("You guessed " + guessNum); 
        		attemptNum++;  
        		if ( guessNum == randNum )
        		{
        			System.out.println("You guessed it!");
        			
        			try 
        			{
        				
        				System.in.read();
        				break; 
        			}
        			catch(Exception e)
        			{
        				System.out.println(e);
        			}
        		}

        	}
        	catch(Exception e)
        	{
        		System.out.println(e); 
        	}
        }
    }
} 
