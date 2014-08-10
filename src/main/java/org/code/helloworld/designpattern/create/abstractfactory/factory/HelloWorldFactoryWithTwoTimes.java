package org.code.helloworld.designpattern.create.abstractfactory.factory;

import org.code.helloworld.designpattern.create.abstractfactory.AbstractHelloWorldFactory;
import org.code.helloworld.designpattern.create.abstractfactory.HelloWorld;
import org.code.helloworld.designpattern.create.abstractfactory.helloworld.twotimes.HelloWorldInChineseWithTwoTimes;
import org.code.helloworld.designpattern.create.abstractfactory.helloworld.twotimes.HelloWorldInEnglishWithTwoTimes;
import org.code.helloworld.designpattern.create.abstractfactory.helloworld.twotimes.HelloWorldInJavaWithTwoTimes;

/**
 * 
 * 描述：说两次的
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-10 18:13:44
 *
 */
public class HelloWorldFactoryWithTwoTimes extends AbstractHelloWorldFactory {

	@Override
	public HelloWorld createHelloWorldInChinese() {
		return new HelloWorldInChineseWithTwoTimes();
	}

	@Override
	public HelloWorld createHelloWorldInEnglish() {
		return new HelloWorldInEnglishWithTwoTimes();
	}

	@Override
	public HelloWorld createHelloWorldInJava() {
		return new HelloWorldInJavaWithTwoTimes();
	}

}
