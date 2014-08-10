package org.code.helloworld.designpattern.create.factory.helloworld;

import org.code.helloworld.designpattern.create.factory.HelloWorld;

/**
 * 
 * 描述：中文的hello world
 * 
 * @author yanchangyou@gmail.com 
 * @date 2014-08-09 17:40:36
 *
 */
public class ChineseHelloWorld extends HelloWorld {

	@Override
	public String think() {
		return "你好，世界！";
	}
}
