package org.code.helloworld.designpattern.struct.adapter.impl;

import junit.framework.TestCase;

public class 你好世界Test extends TestCase {

	public void testSpeak() {
//		fail("Not yet implemented");
		你好世界 你好世界 = new 你好世界();
		String words = 你好世界.think();
		assertEquals("你好，世界！", words);
		你好世界.speak();
	}

}
