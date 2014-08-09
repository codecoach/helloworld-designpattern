package org.code.helloworld.designpattern.create.factory;

import junit.framework.TestCase;

/**
 * 
 * 描述：测试
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-09 17:51:52
 *
 */
public class HelloWorldFactoryTest extends TestCase {

	public void testCreate() {
//		fail("Not yet implemented");
		
		HelloWorld hellworld = HelloWorldFactory.create(ChineseHelloWorld.class);
		
		String words = hellworld.think();
		assertEquals("你好，世界！", words);
		hellworld.speak();
		
		hellworld = HelloWorldFactory.create(EnglishHelloWorld.class);
		
		words = hellworld.think();
		assertEquals("hello, world!", words);
		hellworld.speak();
		
	}

}
