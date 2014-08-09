package org.code.helloworld.designpattern.create.singleton;

import org.code.helloworld.designpattern.create.singleton.HelloWorldApp;

import junit.framework.TestCase;

public class HelloWorldAppTest extends TestCase {

	public void testGetInstance() {
//		fail("Not yet implemented");
		HelloWorldApp app = HelloWorldApp.getInstance();
		assertEquals(app, HelloWorldApp.getInstance());
	}

	public void testHello() {
//		fail("Not yet implemented");
		HelloWorldApp app = HelloWorldApp.getInstance();
		app.hello();
	}

	public void testHelloString() {
//		fail("Not yet implemented");

		HelloWorldApp app = HelloWorldApp.getInstance();
		app.hello("big world");
	}

}
