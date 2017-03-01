package com.example;

/**
 * 
 * @author vaibhavgoyal
 *
 */
public class Greeter {

/**
* 
* @author vaibhavgoyal
*
*/
	public Greeter() {

	}

/**
* 
* @author vaibhavgoyal
*
*/
	public final String greet(final String someone) {
		return String.format("Hello, %s!", someone);
	}
}
