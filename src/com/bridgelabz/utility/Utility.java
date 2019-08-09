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
     *
     *  @author  Abhishek Rawat
     *  @version 1.0
     *  @since   08-08-2019
     *
 ******************************************************************************/
    
    /**
     * @param a Take  input value a from user
     * @param b Take  input value b from user
     * @param c Take input value c from user
     * @return
     */
    public double OperationOneDouble(double a , double b ,double c) {
		double Operation1 = (a+b*c);
		
		
		return Operation1 ;
	}
/****************************************************************************************************/  
    /**
     * @param a Take  input value a from user
     * @param b Take  input value b from user
     * @param c Take input value c from user
     * @return
     */
	
	public double OperationTwoDouble(double a ,double b ,double c ) {
		
		double Operation2 =(a*b+c);
		
		
		return Operation2 ;
	}
/****************************************************************************************************/
	
	 /**
     * @param a Take  input value a from user
     * @param b Take  input value b from user
     * @param c Take input value c from user
     * @return
     */
	
    public double OperationThreeDouble(double a, double b ,double c ) {
		
		
		double Operation3 =(a%b+c);
		
		return Operation3 ;
	}
/****************************************************************************************************/
    
    /**
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
     *
     *  @author  Abhishek Rawat
     *  @version 1.0
     *  @since   08-08-2019
     *
******************************************************************************/

     
     
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
      *
      *  @author  Abhishek Rawat
      *  @version 1.0
      *  @since   09-08-2019
      *
      ******************************************************************************/
     public String SpringSeason(int month , int date ) {
    	 if((month==3 && date<=31 && date>=20) || (month==4 && date<=30) ||(month==5 && date<=31) || (month==6 && date<=20) ) {
    		 return "true" ;
    		 
    	 }
    	 else {
    		 return "False";
    	 }
     }
     
/******************************************************************************

      *  Purpose: to find the root of the quadratic equation
      *
      *  @author  Abhishek Rawat
      *  @version 1.0
      *  @since   09-08-2019
      *******************************************************************************/

     
     /**
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
     *
     *  @author  Abhishek Rawat
     *  @version 1.0
     *  @since   09-08-2019
     *******************************************************************************/

    
    public Double Distance(double x , double y ) {
    	double distance = Math.sqrt(x*x+y*y);
    	
    	return  distance;
    }
}


