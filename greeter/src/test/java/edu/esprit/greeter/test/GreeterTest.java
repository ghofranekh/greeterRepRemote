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
public void itShouldSayHelloJAVA(){
	
	String result = greeter.sayHello("JAVA");
	Assert.assertEquals("Hello JAVA1", result);

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
