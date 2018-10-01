package org.code.helloworld.designpattern.struct.composite;

import org.code.helloworld.designpattern.struct.composite.helloworld.ContinentHelloWorld;
import org.code.helloworld.designpattern.struct.composite.helloworld.CountryHelloWorld;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {

	public void test() {
		
		String words = "你好，世界！\r\n안녕하세요, 세계!\r\n";
		String chineseWords = "你好，世界！";
		CountryHelloWorld chinese = new CountryHelloWorld("你好，世界！");
		
		assertEquals(chineseWords, chinese.think());
		
		CountryHelloWorld korea = new CountryHelloWorld("안녕하세요, 세계!");
		ContinentHelloWorld cotinentHelloWorld = new ContinentHelloWorld();
		cotinentHelloWorld.addCountryHelloWorld(chinese);
		cotinentHelloWorld.addCountryHelloWorld(korea);
		
		String output = cotinentHelloWorld.think();
		
		assertEquals(words, output);
		
		cotinentHelloWorld.speak();
	}

}
