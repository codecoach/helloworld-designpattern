package org.code.helloworld.designpattern.create.abstractfactory.helloworld.onetimes;

import org.code.helloworld.designpattern.create.abstractfactory.helloworld.OneTimesHelloWorld;


/**
 * 描述：中文的hello world
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-10 18:07:57
 *
 */
public class OneTimesHelloWorldInChinese extends OneTimesHelloWorld {

	@Override
	public String think() {
		return "你好，世界！";
	}
}
