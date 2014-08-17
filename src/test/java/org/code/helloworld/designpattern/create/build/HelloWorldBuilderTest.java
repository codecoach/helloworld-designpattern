package org.code.helloworld.designpattern.create.build;

import junit.framework.TestCase;

import org.code.helloworld.designpattern.create.build.build.EnglishHelloWorldBuilder;
import org.code.helloworld.designpattern.create.build.build.JavaHelloWorldBuilder;

public class HelloWorldBuilderTest extends TestCase {

	public void testBuild() {
//		fail("Not yet implemented");
		String[] words = {"hello, world!", "hello, donya!"};
		HelloWorldBuilder[] build = {new EnglishHelloWorldBuilder(),new JavaHelloWorldBuilder ()};
		for (int i = 0; i < build.length; i++) {
			HelloWorld helloWorld = build[i].build();
			assertEquals(words[i], helloWorld.think());
			helloWorld.speak();
		}
	}

}
