package org.code.helloworld.designpattern.create.abstractfactory.helloworld.twotimes;

import org.code.helloworld.designpattern.create.abstractfactory.helloworld.HelloWorldWithTwoTimes;

/**
 * 
 * 描述：英语的hello world
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-10 18:08:08
 *
 */
public class HelloWorldInEnglishWithTwoTimes extends HelloWorldWithTwoTimes {

	@Override
	public String think() {
		return "hello, world!";
	}
}
