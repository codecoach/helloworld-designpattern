package org.code.helloworld.designpattern.create.abstractfactory.helloworld.twotimes;

import org.code.helloworld.designpattern.create.abstractfactory.helloworld.HelloWorldWithTwoTimes;

/**
 * 描述：中文的hello world
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-10 18:07:57
 *
 */
public class HelloWorldInChineseWithTwoTimes extends HelloWorldWithTwoTimes {

	@Override
	public String think() {
		return "你好，世界！";
	}
}
