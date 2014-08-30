package org.code.helloworld.designpattern.struct.adapter.wrap;

import junit.framework.TestCase;

public class I18nHelloWorldTest extends TestCase {

	public void testSpeak() {
//		fail("Not yet implemented");
		I18nHelloWorld helloWorld = new I18nHelloWorld();
		String words = helloWorld.think();
		assertEquals("你好，世界！", words);
		helloWorld.speak();
	}

}
