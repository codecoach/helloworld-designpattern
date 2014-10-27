package org.code.helloworld.designpattern.struct.decorator;

/**
 * 附加行为
 * 
 * @author yanchangyou@gmail.com
 *
 */
public class HelloWorldWithLog extends HelloWorld {

	private HelloWorld helloWorld;

	public HelloWorldWithLog(HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
	}

	/**
	 * 在说之前和之后附加行为：这和aop很类似
	 */
	@Override
	public void speak() {

		System.out.println("speak之前");

		helloWorld.speak();

		System.out.println("speak之后");

	}

	@Override
	public String think() {
		return helloWorld.think();
	}
}
