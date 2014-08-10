package org.code.helloworld.designpattern.create.abstractfactory.factory;

import org.code.helloworld.designpattern.create.abstractfactory.AbstractHelloWorldFactory;
import org.code.helloworld.designpattern.create.abstractfactory.HelloWorld;
import org.code.helloworld.designpattern.create.abstractfactory.helloworld.onetimes.HelloWorldInChineseWithOneTimes;
import org.code.helloworld.designpattern.create.abstractfactory.helloworld.onetimes.HelloWorldInEnglishWithOneTimes;
import org.code.helloworld.designpattern.create.abstractfactory.helloworld.onetimes.HelloWorldInJavaWithOneTimes;

/**
 * 
 * 描述：说一次的
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-10 18:13:44
 *
 */
public class HelloWorldFactoryWithOneTimes extends AbstractHelloWorldFactory {

	@Override
	public HelloWorld createHelloWorldInChinese() {
		return new HelloWorldInChineseWithOneTimes();
	}

	@Override
	public HelloWorld createHelloWorldInEnglish() {
		return new HelloWorldInEnglishWithOneTimes();
	}

	@Override
	public HelloWorld createHelloWorldInJava() {
		return new HelloWorldInJavaWithOneTimes();
	}

}
