package org.code.helloworld.designpattern.struct.adapter.ext;

import org.code.helloworld.designpattern.struct.adapter.impl.你好世界;

/**
 * 
 * 描述：对某个方法的适当修改 <br>
 * 中文的适配成了英文的（语法层面和内容层面）
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-30 16:39:54
 *
 */
public class ChineseHelloWorld extends 你好世界 {

	public String 想() {
		return "hello, world!";
	}
}
