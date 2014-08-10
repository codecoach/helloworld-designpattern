package org.code.helloworld.designpattern.create.abstractfactory.helloworld.twotimes;

import org.code.helloworld.designpattern.create.abstractfactory.helloworld.TwoTimesHelloWorld;

/**
 * 
 * 描述：英语的hello world
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-10 18:08:08
 *
 */
public class TwoTimesHelloWorldInEnglish extends TwoTimesHelloWorld {

	@Override
	public String think() {
		return "hello, world!";
	}
}
