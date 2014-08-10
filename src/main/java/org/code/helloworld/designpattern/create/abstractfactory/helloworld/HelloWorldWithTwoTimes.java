package org.code.helloworld.designpattern.create.abstractfactory.helloworld;

import org.code.helloworld.designpattern.create.abstractfactory.HelloWorld;

/**
 * 
 * 描述：说两次的
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-10 18:10:59
 *
 */
public abstract class HelloWorldWithTwoTimes extends HelloWorld {

	@Override
	public void speak() {
		super.speak();
		super.speak();
	}
}
