package org.code.helloworld.designpattern.create.abstractfactory;

/**
 * 
 * 描述：hello world 抽象工厂类
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-09 17:35:09
 *
 */
public abstract class AbstractHelloWorldFactory {

	/**
	 * 创建中文的
	 * 
	 * @return
	 */
	public abstract HelloWorld createHelloWorldInChinese();

	/**
	 * 创建英文的
	 * 
	 * @return
	 */
	public abstract HelloWorld createHelloWorldInEnglish();

	/**
	 * 创建java的
	 * 
	 * @return
	 */
	public abstract HelloWorld createHelloWorldInJava();
}
