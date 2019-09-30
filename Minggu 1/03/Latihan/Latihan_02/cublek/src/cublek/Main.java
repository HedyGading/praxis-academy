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
    // A Simple Java program to show multiple 
// type parameters in Java Generics 

// We use < > to specify Parameter type 
class n<T, U> 
{ 
	T obj1; // An object of type T 
	U obj2; // An object of type U 

	// constructor 
	n(T obj1, U obj2) 
	{ 
		this.obj1 = obj1; 
		this.obj2 = obj2; 
	} 

	// To print objects of T and U 
	public void print() 
	{ 
		System.out.println(obj1); 
		System.out.println(obj2); 
	} 
} 

// Driver class to test above 
class m 
{ 
	public static void main (String[] args)
	{ 
		n <String, Integer> obj = 
			new n<String, Integer>("GfG", 15); 

		obj.print(); 
	} 
}