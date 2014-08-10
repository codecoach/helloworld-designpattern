package org.code.helloworld.designpattern.create.factory;

import junit.framework.TestCase;

import org.code.helloworld.designpattern.create.factory.helloworld.ChineseHelloWorld;
import org.code.helloworld.designpattern.create.factory.helloworld.EnglishHelloWorld;
import org.code.helloworld.designpattern.create.factory.helloworld.JavaHelloWorld;

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
		
		//汉语
		String words = hellworld.think();
		assertEquals("你好，世界！", words);
		hellworld.speak();
		
		//英语
		hellworld = HelloWorldFactory.create(EnglishHelloWorld.class);
		
		words = hellworld.think();
		assertEquals("hello, world!", words);
		hellworld.speak();
		
		//java语
		hellworld = HelloWorldFactory.create(JavaHelloWorld.class);
		
		words = hellworld.think();
		assertEquals("hello, donya!", words);
		hellworld.speak();
		
	}

}
