package edu.esprit.greeder;

public class Greeter {
	
	public String sayHello(String name){
		
		if(name.equals("MAN"))
		    throw new IllegalArgumentException()	;
		
		return "Hello " +name;
	}

}
