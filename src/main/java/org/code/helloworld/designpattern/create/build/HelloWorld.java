package org.code.helloworld.designpattern.create.build;

/**
 * 
 * 描述：构建模式<br>
 * 一个复杂（包含多个部分）对象，build模式让其可以分部分构建<br>
 * 一个hello，world包含两部分<br>
 * <ol>
 * <li>hello</li>
 * <li>world</li>
 * </ol>
 * 分别构建
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-17 12:11:43
 *
 */
public class HelloWorld {

	private String hello;

	private String world;

	/**
	 * 说出
	 */
	public void speak() {
		System.out.println(think());
	}

	public String think() {
		return getHello() + ", " + getWorld() + "!";
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public String getWorld() {
		return world;
	}

	public void setWorld(String world) {
		this.world = world;
	}
}
