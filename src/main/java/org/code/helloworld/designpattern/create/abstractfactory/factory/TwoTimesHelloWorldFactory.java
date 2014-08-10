package org.code.helloworld.designpattern.create.abstractfactory.factory;

import org.code.helloworld.designpattern.create.abstractfactory.AbstractHelloWorldFactory;
import org.code.helloworld.designpattern.create.abstractfactory.HelloWorld;
import org.code.helloworld.designpattern.create.abstractfactory.helloworld.twotimes.TwoTimesHelloWorldInChinese;
import org.code.helloworld.designpattern.create.abstractfactory.helloworld.twotimes.TwoTimesHelloWorldInEnglish;
import org.code.helloworld.designpattern.create.abstractfactory.helloworld.twotimes.TwoTimesHelloWorldInJava;

/**
 * 
 * 描述：说两次的
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-10 18:13:44
 *
 */
public class TwoTimesHelloWorldFactory extends AbstractHelloWorldFactory {

	@Override
	public HelloWorld createHelloWorldInChinese() {
		return new TwoTimesHelloWorldInChinese();
	}

	@Override
	public HelloWorld createHelloWorldInEnglish() {
		return new TwoTimesHelloWorldInEnglish();
	}

	@Override
	public HelloWorld createHelloWorldInJava() {
		return new TwoTimesHelloWorldInJava();
	}

}
