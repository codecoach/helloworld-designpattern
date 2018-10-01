package org.code.helloworld.designpattern.struct.adapter.ext;

import junit.framework.TestCase;

public class ChineseHelloWorldTest extends TestCase {

	public void test() {
//		fail("Not yet implemented");
		ChineseHelloWorld helloWorld = new ChineseHelloWorld();
		String words = helloWorld.think();
		assertEquals("hello, world!", words);
		helloWorld.speak();
	}

}
