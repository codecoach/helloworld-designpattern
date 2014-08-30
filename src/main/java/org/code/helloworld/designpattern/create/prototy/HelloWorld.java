package org.code.helloworld.designpattern.create.prototy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 * 描述：原型模式，以对象为原型进行复制、克隆功能<br>
 * 
 * 参考：http://zz563143188.iteye.com/blog/1847029 <br>
 * 中深浅克隆的概念
 * 
 * @author yanchangyou@gmail.com
 * @date 2014-08-30 14:55:02
 *
 */
public class HelloWorld implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 122917700462730608L;

	/**
	 * 想
	 * 
	 * @return
	 */
	public String think() {
		return "hello, world!";
	}

	/**
	 * 说
	 */
	public void speak() {
		System.out.println(think());
	}

	/**
	 * 克隆，java内部机制实现克隆（浅克隆）
	 */
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 这是一只简便的实现方法，这种实现有个限制条件 ：所有引用对象实现序列号化
	 * 
	 * @return
	 */
	public Object deepClone() {
		try {

			// 写出
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			ObjectOutputStream oout = new ObjectOutputStream(bout);

			oout.writeObject(this);

			// 读入
			ByteArrayInputStream bin = new ByteArrayInputStream(
					bout.toByteArray());
			ObjectInputStream oin = new ObjectInputStream(bin);

			return oin.readObject();

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
