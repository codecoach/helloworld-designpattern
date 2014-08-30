package org.code.helloworld.designpattern.struct.adapter.impl;

import org.code.helloworld.designpattern.struct.adapter.HelleWorld;

/**
 * 
 * 描述： 适配器（实现接口） <br>
 * 中文的适配成了英文的（语法层面）
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-30 16:39:54
 *	
 */
public class 你好世界 implements HelleWorld {

	public String 想() {
		return "你好，世界！";
	}

	public void 说() {
		System.out.println(想());
	}

	public String think() {
		return 想();
	}

	public void speak() {
		说();
	}
}
