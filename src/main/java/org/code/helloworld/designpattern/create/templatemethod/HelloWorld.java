package org.code.helloworld.designpattern.create.templatemethod;

/**
 * 
 * 描述：模板方法<br>
 * 核心：父类定义好:主线流程(模板)，子类实现流程环节过程(填充具体内容) 
 * (共性中处理，个性单独对待)
 * @author yanchangyou@gmail.com
 * @date 2014-08-16 21:43:10
 *
 */
public abstract class HelloWorld {

	/**
	 * 想：子类扩展想的内容
	 * @return
	 */
	public abstract String think();
	
	/**
	 * 说出想好的：控制台输出想好的内容
	 */
	public void speak() {
		System.out.println(think());
	}
}
