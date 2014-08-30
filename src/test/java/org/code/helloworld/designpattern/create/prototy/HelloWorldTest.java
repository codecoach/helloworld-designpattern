package org.code.helloworld.designpattern.create.prototy;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {

	public void testClone() {
//		fail("Not yet implemented");
		HelloWorld helloWorld = new HelloWorld();
		String words = helloWorld.think();
		assertEquals("hello, world!", words);
		helloWorld.speak();
		HelloWorld helloWorldCloned = (HelloWorld) helloWorld.clone();

		String wordsCloned = helloWorldCloned.think();
		assertEquals("hello, world!", wordsCloned);
		helloWorldCloned.speak();
	}
	
	public void testDeepClone() {
//		fail("Not yet implemented");
		HelloWorld helloWorld = new HelloWorld();
		String words = helloWorld.think();
		assertEquals("hello, world!", words);
		helloWorld.speak();
		HelloWorld helloWorldCloned = (HelloWorld) helloWorld.deepClone();

		String wordsCloned = helloWorldCloned.think();
		assertEquals("hello, world!", wordsCloned);
		helloWorldCloned.speak();
	}

}
