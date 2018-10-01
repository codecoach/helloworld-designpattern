package org.code.helloworld.designpattern.struct.adapter.old;

/**
 * 
 * 描述： 原始类:只有中文操作
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-30 16:39:54
 *
 */
public class 你好世界 {

	public String 想() {
		return "你好，世界！";
	}

	public void 说() {
		System.out.println(想());
	}
}
