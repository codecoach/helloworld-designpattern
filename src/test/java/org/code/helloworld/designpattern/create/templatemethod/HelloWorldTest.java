package org.code.helloworld.designpattern.create.templatemethod;

import org.code.helloworld.designpattern.create.templatemethod.helloworld.HelloWorldInChinese;
import org.code.helloworld.designpattern.create.templatemethod.helloworld.HelloWorldInEnglish;
import org.code.helloworld.designpattern.create.templatemethod.helloworld.HelloWorldInJava;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {

	public void test() {
//		fail("Not yet implemented");
		String[] words = {"你好，世界！","hello, world!", "hello, donya!"};
		HelloWorld[] helloworlds = {new HelloWorldInChinese(),new HelloWorldInEnglish(),new HelloWorldInJava()};
		for (int i = 0; i < helloworlds.length; i++) {
			assertEquals(words[i], helloworlds[i].think());
			helloworlds[i].speak();
		}
	}

}
