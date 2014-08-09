package org.code.helloworld.designpattern.create.singleton;

/**
 * 
 * 描述：单例<br>
 * 使用静态方法实现
 * 
 * 《设计模式之禅》helloworld练手
 * 
 * @author yanchangyou
 * @date 2014年8月9日 下午12:18:50
 *
 */
public class HelloWorldApp {

	private static HelloWorldApp app = new HelloWorldApp();

	private HelloWorldApp() {
	}

	public static HelloWorldApp getInstance() {
		return app;
	}

	public void hello() {
		hello("world");
	}

	public void hello(String who) {
		System.out.println("hello, " + who + "!");
	}
}
