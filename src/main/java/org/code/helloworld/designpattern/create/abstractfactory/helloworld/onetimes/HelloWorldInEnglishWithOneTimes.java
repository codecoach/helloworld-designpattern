package org.code.helloworld.designpattern.create.abstractfactory.helloworld.onetimes;

import org.code.helloworld.designpattern.create.abstractfactory.helloworld.HelloWorldWithOneTimes;


/**
 * 
 * 描述：英语的hello world
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-10 18:08:08
 *
 */
public class HelloWorldInEnglishWithOneTimes extends HelloWorldWithOneTimes {

	@Override
	public String think() {
		return "hello, world!";
	}
}
