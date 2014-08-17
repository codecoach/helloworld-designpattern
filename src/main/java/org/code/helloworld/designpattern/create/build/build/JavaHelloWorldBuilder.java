package org.code.helloworld.designpattern.create.build.build;

import org.code.helloworld.designpattern.create.build.HelloWorld;
import org.code.helloworld.designpattern.create.build.HelloWorldBuilder;

/**
 * 
 * 描述：java构建
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-17 13:21:25
 *
 */
public class JavaHelloWorldBuilder extends HelloWorldBuilder {

	@Override
	public void buildHello(HelloWorld helloWorld) {
		helloWorld.setHello("hello");
	}

	@Override
	public void buildWorld(HelloWorld helloWorld) {
		helloWorld.setWorld("donya");
	}
}
