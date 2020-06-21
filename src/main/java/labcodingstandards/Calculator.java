// Copyright (C) 2020
// All rights reserved

package labcodingstandards;

import java.util.Scanner;


/**
 * @author Neythan.León
 *
 */
public class Calculator {	
	/**
	 * Initialize the program Calculator.
	 *
	 * Precondition: 'args' should contain at least one element, the user's name.
	 *
	 * @param  args            the command-line arguments.
	 * 
	 */
	//CHECKSTYLE:OFF
	public static void main(String[] args)
	//CHECKSTYLE:ON
	
	{
		Scanner reader = new Scanner(System.in);
		
        System.out.print("1. +\n2. -\n3. *\n4. /\nEnter an operator: ");
        
        char operator = reader.nextLine().charAt(0);
        double first;
        double second;
        String input;
        
        while (true) {
        	System.out.print("Enter first number: ");
        	input = reader.nextLine();
        	
            try {
            	first=Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }
        
        while (true) {
        	System.out.print("Enter second number: ");
        	input = reader.nextLine();
        	
            try {
            	second=Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }

        Calculator cal=new Calculator();
        String result=cal.operation(first, second, operator);

        System.out.printf(result);
		reader.close();
	}
	
	/**
	 * Extracts the user's name from the input arguments.
	 *
	 * Precondition: 'args' should contain at least one element, the user's name.
	 *
	 * @return                 the result operation.
	 * @param first            the first number to operate.
	 * @param second           the second number to operate.
	 * @param operator         the indicator of the operation to be carried out.
	 * @switch Allow me to select the operation with I wish works.
	 */
	private String operation(double first, double second, char operator) {
		
		double result = 0;
		switch(operator)
        {
            case '1':
                result=first+second;
                break;
            case '2':
                result=first-second;
                break;
            case '3':
                result=first*second;
                break;
            case '4':
                result =first/second;
                break;
            default:
            	return "Error! operator is not correct";
        }
		return "The result is: "+result;
	}
}
