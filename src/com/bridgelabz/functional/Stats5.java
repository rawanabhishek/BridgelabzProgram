<<<<<<< HEAD
/******************************************************************************
 
 *  Purpose: To print five random no and print there max ,min , average
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
=======
>>>>>>> a2b5793104545089a76d3dc86b053ff6497548a2
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Stats5 {

	public static void main(String[] args) {
		
		     Utility utility= new Utility();
             int range= 5 ;
             double value1=Math.random();
             double value2=Math.random();
             double value3=Math.random();
             double value4=Math.random();
             double value5=Math.random();
             
             System.out.println("Random Value  1 is "+value1);
             System.out.println("Random Value  2 is "+value2);
             System.out.println("Random Value  3 is "+value3);
             System.out.println("Random Value  4 is "+value4);
             System.out.println("Random Value  5 is "+value5);
             
             System.out.println();
             System.out.println(utility.Random(value1, value2, value3, value4, value5));
             
             
	}

}
