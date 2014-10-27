package org.code.helloworld.designpattern.struct.decorator;

/**
 * 装饰模式<br>
 * 在已有类基础上添加行为
 * 
 * @author yanchangyou@gmail.com
 *
 */
public class HelloWorld {

	public String think() {
		return "hello,world！";
	}

	public void speak() {
		System.out.println(think());
	}
}
