package org.code.helloworld.designpattern.create.factory;

/**
 * 
 * 描述：hello world 抽象类<br>
 * 子类实现具体操作
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-09 17:40:07
 *
 */
public abstract class HelloWorld {

	/**
	 * 想好要说的话
	 * 
	 * @return
	 */
	public abstract String think();

	/**
	 * 说出想好的话
	 */
	public void speak() {
		System.out.println(think());
	};

}
