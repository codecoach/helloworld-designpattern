package org.code.helloworld.designpattern.struct.decorator;

/**
 * 附加行为
 * 
 * @author yanchangyou@gmail.com
 *
 */
public class HelloWorldWithLog {

	private HelloWorld helloWorld;

	public HelloWorldWithLog() {
		helloWorld = new HelloWorld();
	}

	/**
	 * 在说之前和之后附加行为：这和aop很类似
	 */
	public void speak() {

		System.out.println("speak之前");

		helloWorld.speak();

		System.out.println("speak之后");

	}
}
