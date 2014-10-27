package org.code.helloworld.designpattern.struct.decorator;

/**
 * 附加行为
 * 
 * @author yanchangyou@gmail.com
 *
 */
public class HelloWorldWithLog extends HelloWorld {

	public void speak() {
		System.out.println("speak之前");
		System.out.println(think());
		System.out.println("speak之后");
	}
}
