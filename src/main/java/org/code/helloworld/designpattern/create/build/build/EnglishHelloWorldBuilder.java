package org.code.helloworld.designpattern.create.build.build;

import org.code.helloworld.designpattern.create.build.HelloWorld;
import org.code.helloworld.designpattern.create.build.HelloWorldBuilder;

/**
 * 
 * 描述：英语构建
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-17 12:25:29
 *
 */
public class EnglishHelloWorldBuilder extends HelloWorldBuilder {

	@Override
	public void buildHello(HelloWorld helloWorld) {
		helloWorld.setHello("hello");
	}

	@Override
	public void buildWorld(HelloWorld helloWorld) {
		helloWorld.setWorld("world");
	}
}
