package org.code.helloworld.designpattern.create.factory;

/**
 * 
 * 描述：hello world 工厂类
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-09 17:35:09
 *
 */
public class HelloWorldFactory<T> {

	/**
	 * 工厂方法创建
	 * @param clazz
	 * @return
	 */
	public static <T extends HelloWorld> T create(Class<T> clazz) {
		
		try {
			return clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("创建错误", e);
		}
	}
}
