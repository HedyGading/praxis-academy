/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cublek;

/**
 *
 * @author hedygading
 */
class oo 
{ 
	// A Generic method example 
	static <T> void genericDisplay (T element) 
	{ 
		System.out.println(element.getClass().getName() + 
						" = " + element); 
	} 

	// Driver method 
	public static void main(String[] args)
	{ 
		// Calling generic method with Integer argument 
		genericDisplay(11); 

		// Calling generic method with String argument 
		genericDisplay("GeeksForGeeks"); 

		// Calling generic method with double argument 
		genericDisplay(1.0); 
	} 
}