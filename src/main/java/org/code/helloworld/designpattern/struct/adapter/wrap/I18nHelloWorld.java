package org.code.helloworld.designpattern.struct.adapter.wrap;

import org.code.helloworld.designpattern.struct.adapter.HelleWorld;
import org.code.helloworld.designpattern.struct.adapter.old.你好世界;

/**
 * 
 * 描述： 国际化helloworld适配器（包装） <br>
 * 中文的包装成了英文的（语法层面）
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-30 16:39:54
 *
 */
public class I18nHelloWorld implements HelleWorld {

	private 你好世界 你好世界 = new 你好世界();

	public String think() {
		return 你好世界.想();
	}

	public void speak() {
		你好世界.说();
	}
}
