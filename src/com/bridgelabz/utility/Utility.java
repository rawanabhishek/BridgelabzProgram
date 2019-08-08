/******************************************************************************
 
 *  Purpose: logic to add two integers 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.utility;


public class Utility {
	
	/**
	 * @param firstNumber  take frist input from user
	 * @param secondNumber  take second input from user
	 * @return result       print sum of first and second integer
	 */
	public int SumOf2Numbers(int firstNumber ,int secondNumber) {
		int result = firstNumber+secondNumber;
		
		return result ;
	}
	
	public int OperationOne(int a , int b ,int c) {
		int Operation1 = (a+b*c);
		
		
		return Operation1 ;
	}
	
	public int OperationTwo(int a ,int b ,int c ) {
		
		int Operation2 =(a*b+c);
		
		
		return Operation2 ;
	}
	
    public int OperationThree(int a, int b ,int c ) {
		
		
		int Operation3 =(a%b+c);
		
		return Operation3 ;
	}
    public int OperationFour(int a, int b ,int c ) {
		
		
		int Operation4 =(a%b+c);
		
		return Operation4 ;
	}

}
