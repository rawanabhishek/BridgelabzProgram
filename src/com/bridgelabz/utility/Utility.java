/******************************************************************************
 
 *  Purpose: logic to add two integers 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.utility;


/**
 * @author user
 *
 */
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
	
/****************************************************************************************************/
	
	 /**
     * @param a Take  input value a from user
     * @param b Take  input value b from user
     * @param c Take input value c from user
     * @return
     */
	public int OperationOne(int a , int b ,int c) {
		int Operation1 = (a+b*c);
		
		
		return Operation1 ;
	}
/****************************************************************************************************/
	 
	
	/**
     * @param a Take  input value a from user
     * @param b Take  input value b from user
     * @param c Take input value c from user
     * @return
     */
	
	public int OperationTwo(int a ,int b ,int c ) {
		
		int Operation2 =(a*b+c);
		
		
		return Operation2 ;
	}
	
/****************************************************************************************************/
	 
	/**
     * @param a Take  input value a from user
     * @param b Take  input value b from user
     * @param c Take input value c from user
     * @return
     */
	
    public int OperationThree(int a, int b ,int c ) {
		
		
		int Operation3 =(a%b+c);
		
		return Operation3 ;
	}
  /****************************************************************************************************/
    
    
    /**
     * @param a Take  input value a from user
     * @param b Take  input value b from user
     * @param c Take input value c from user
     * @return
     */
    public int OperationFour(int a, int b ,int c ) {
		
		
		int Operation4 =(a%b+c);
		
		return Operation4 ;
	}
    
/******************************************************************************
    
     *  Purpose: To take 3 values from user and perform set of opertions on them to
     *           understand there presedence
   
     * @param a Take  input value a from user
     * @param b Take  input value b from user
     * @param c Take input value c from user
     * @return
     */
    public double OperationOneDouble(double a , double b ,double c) {
		double Operation1 = (a+b*c);
		
		
		return Operation1 ;
	}
/**************************************************************************************************** 
 
     * @param a Take  input value a from user
     * @param b Take  input value b from user
     * @param c Take input value c from user
     * @return
     */
	
	public double OperationTwoDouble(double a ,double b ,double c ) {
		
		double Operation2 =(a*b+c);
		
		
		return Operation2 ;
	}
/****************************************************************************************************
	
	 
     * @param a Take  input value a from user
     * @param b Take  input value b from user
     * @param c Take input value c from user
     * @return
     */
	
    public double OperationThreeDouble(double a, double b ,double c ) {
		
		
		double Operation3 =(a%b+c);
		
		return Operation3 ;
	}
/****************************************************************************************************
    
    
     * @param a Take  input value a from user
     * @param b Take  input value b from user
     * @param c Take input value c from user
     * @return 
     */
    public double OperationFourDouble(double a, double b ,double c ) {
		
		
		double Operation4 =(a%b+c);
		
		return Operation4 ;
	}
    
/******************************************************************************

     *  Purpose: to Check the given year is a leap year or not
     /**
     * @param year  take input from user to check the leap year
     * @return      return weather the given year is a leap year or not
     */
    public String Leapyear(int year) {
    	 if(year%4==0 && year%100!=0) {
    		 return year + " is a leap year" ;
    	 }
    	 else if(year%4==0 && year%400==0) {
    		 return year + " is  a leap year" ;
    	 }
    	 else {
    		 return year + " is not a leap year";
    	 }
     }
     
   /******************************************************************************

      *  Purpose: to Check the date lies between March 20 to June 20 
 
     
     /**
     * @param month take input from user to check the range of month
     * @param date  take input from user to check the range of date
     * @return return the true if the value falls in the given range and return
     *          false if the value not falls in the given range 
     */
    public String SpringSeason(int month , int date ) {
    	 if((month==3 && date<=31 && date>=20) || (month==4 && date<=30) ||(month==5 && date<=31) || (month==6 && date<=20) ) {
    		 return "true" ;
    		 
    	 }
    	 else {
    		 return "False";
    	 }
     }
     

 /********************************************************************************
    Purpose: to find the root of the quadratic equation 

     * @param a taking value of a from user
     * @param b taking value of b from user
     * @param c taking value of c from user
     * @return
     */
    public String Quadratic(double a ,double b, double c ) {
    	 double delta = (b*b-(4*a*c));
    	 
    	 double root1= (-b+Math.sqrt(delta)/(2*a));
    	 double root2= (-b-Math.sqrt(delta)/(2*a));
    	 
    	 return "Root   is  : "+root1+ " and  "+ root2 ;
    	 
     }
    
    /******************************************************************************

     *  Purpose: to find the euclidean distance
     * @param x  to take the value of x from the user
     * @param y  to take the value of y from the user
     * @return   return the value of distance 
     */
    public Double Distance(double x , double y ) {
    	double distance = Math.sqrt(x*x+y*y);
    	
    	return  distance;
    }
    
/********************************************************************************************************

     Purpose: to print sum of two random integers between 1 and 6 
    
     * @return  return sum of two random number between 1 to 6
     */
    public int random() {
    	int side = 6;
    	int a = 1 + (int)(Math.random()*side);
    	int b = 1 + (int)(Math.random()*side);
    	int sum = a+b;
    	return sum;
    	
    }
    
/********************************************************************************************************

    Purpose: to find the windchill temperature in farenheit
   
    * @return  return wind chill temperature 
    */
    
    public String wind(double temperature , double  windspeed) {
    	
            double windchill =35.74 +0.6215*temperature +(0.4275*temperature - 35.75)*Math.pow(windspeed, 0.16);
    		return "the wind Chill in Fahrenheit is : "+windchill;
    	
    	
    }
 /********************************************************************************************************

    Purpose: to find the windchill temperature in farenheit
   
    * @return  return wind chill temperature 
    */
    public String tempconversion(double temperature ,int choice ) {
    	if(choice ==1) {
    		double CelsiustoFehranheit = (temperature*9/5)+32 ;
    		return "The Temperature Converted in Celsius to Fehranheit is  :"+CelsiustoFehranheit ;
    	}
    	else if (choice ==2) {
    		double FehranheitToCelsius =(temperature-32)*5/9 ;
    		return "The temperature Converted In Fehranheit to Celsius is :"+FehranheitToCelsius ;
    	}
		return null;
    
    	
    }
    
    /********************************************************************************************************

    Purpose: to find Min , Max And Average of random 5 Values
   
    * @return  return Min , Max and Average
    */
    
    public String Random(double value1 ,double value2 ,double value3 ,double value4 ,double value5) {
    	double RandomMin =Math.min(value1, Math.min(value2, Math.min(value3, Math.min(value4, value5))));
    	double RandomMax =Math.max(value1, Math.max(value2, Math.max(value3, Math.max(value4, value5))));
    	double RandomAverage=(value1+value2+value3+value4+value5)/5;
    	
    	return "Random Minimum is : "+RandomMin+" Random Max is : "+RandomMax+" Random average is : "+RandomAverage ;
    	
    }
    
}


