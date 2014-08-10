package org.code.helloworld.designpattern.create.factory.helloworld;

import org.code.helloworld.designpattern.create.factory.HelloWorld;

/**
 * 
 * 描述：英语的hello world
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-09 17:40:53
 *
 */
public class EnglishHelloWorld extends HelloWorld {

	@Override
	public String think() {
		return "hello, world!";
	}
}
