package org.code.helloworld.designpattern.create.abstractfactory.factory;

import junit.framework.TestCase;

import org.code.helloworld.designpattern.create.abstractfactory.HelloWorld;

public class OneTimesHelloWorldFactoryTest extends TestCase {

	/**
	 * 整体测试
	 */
	public void testCreateHelloWorld() {
		// fail("Not yet implemented");
		String words[] = {"你好，世界！","hello, world!", "hello, donya!"};
		OneTimesHelloWorldFactory factory = new OneTimesHelloWorldFactory();
		HelloWorld[] helloWorlds = { factory.createHelloWorldInChinese(),
				factory.createHelloWorldInEnglish(),
				factory.createHelloWorldInJava() };
		for (int i = 0; i < helloWorlds.length; i++) {
			assertEquals(words[i], helloWorlds[i].think());
			helloWorlds[i].speak();
		}
	}

}
