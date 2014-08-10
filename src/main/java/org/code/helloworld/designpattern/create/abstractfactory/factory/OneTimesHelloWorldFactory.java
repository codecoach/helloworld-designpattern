package org.code.helloworld.designpattern.create.abstractfactory.factory;

import org.code.helloworld.designpattern.create.abstractfactory.AbstractHelloWorldFactory;
import org.code.helloworld.designpattern.create.abstractfactory.HelloWorld;
import org.code.helloworld.designpattern.create.abstractfactory.helloworld.onetimes.OneTimesHelloWorldInChinese;
import org.code.helloworld.designpattern.create.abstractfactory.helloworld.onetimes.OneTimesHelloWorldInEnglish;
import org.code.helloworld.designpattern.create.abstractfactory.helloworld.onetimes.OneTimesHelloWorldInJava;

/**
 * 
 * 描述：
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-10 18:13:44
 *
 */
public class OneTimesHelloWorldFactory extends AbstractHelloWorldFactory {

	@Override
	public HelloWorld createHelloWorldInChinese() {
		return new OneTimesHelloWorldInChinese();
	}

	@Override
	public HelloWorld createHelloWorldInEnglish() {
		return new OneTimesHelloWorldInEnglish();
	}

	@Override
	public HelloWorld createHelloWorldInJava() {
		return new OneTimesHelloWorldInJava();
	}

}
