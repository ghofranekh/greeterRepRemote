package edu.esprit.greeder;

public class Greeter {
	
	 public String var1;
	 public String var2;
	 public String var3;
	 public String var4;

	/**
	 * 
	 * 	sayHello method
	 * 
	 * @param name
	 * @return "Hello" +name
	 */
	
	public String sayHello(String name){
		
		if(name.equals("MAN"))
		    throw new IllegalArgumentException()	;
		
		return "Hello " +name;
	}

}
