package org.code.helloworld.designpattern.create.build;

/**
 * 描述：构建hello world<br>
 * 分两部分构建
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-17 12:20:56
 *
 */
public abstract class HelloWorldBuilder {
	/**
	 * 构建一个hello world
	 * @return
	 */
	public HelloWorld build() {
		HelloWorld helloWorld = new HelloWorld();
		buildHello(helloWorld);
		buildWorld(helloWorld);
		return helloWorld;
	}

	/**
	 * 构建hello
	 * @param helloWorld
	 */
	
	/**
	 * 构建world
	 * @param helloWorld
	 */
	public abstract void buildHello(HelloWorld helloWorld);

	public abstract void buildWorld(HelloWorld helloWorld);

}
