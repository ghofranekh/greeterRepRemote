package edu.esprit.greeter.test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.esprit.greeder.Greeter;

public class GreeterTest {
	
	Greeter greeter ;
@Before	
	public void setUp(){
		greeter = new Greeter();
		
	}
@Test	
public void itShouldSayHelloWorld(){
	
	String result = greeter.sayHello("World");
	Assert.assertEquals("Hello World", result);

}
@Test (expected = IllegalArgumentException.class)
public void itShouldRaiseExcepion(){
	
	String param ="MAN";
	greeter.sayHello(param);
}
	
@After
public void tearDown(){
	
	greeter = null ;
}
	

}
