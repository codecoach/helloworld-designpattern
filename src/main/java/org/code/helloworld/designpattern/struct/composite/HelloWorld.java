package org.code.helloworld.designpattern.struct.composite;

/**
 * 组合模式：实现类似文件夹+文件的树结构模式，对文件夹和文件有相同的操作：增删改<br>
 * 使用hello world模拟：区域（文件夹），国家（文件）的输出
 * 
 * @author yanchangyou@gmail.com
 *
 */
public abstract class HelloWorld {
	/**
	 * 想
	 * 
	 * @return
	 */
	public abstract String think();

	/**
	 * 说
	 */
	public void speak() {
		System.out.println(think());
	}
}
