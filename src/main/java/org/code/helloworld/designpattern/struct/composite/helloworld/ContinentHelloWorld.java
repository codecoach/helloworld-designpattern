package org.code.helloworld.designpattern.struct.composite.helloworld;

import java.util.ArrayList;
import java.util.List;

import org.code.helloworld.designpattern.struct.composite.HelloWorld;

/**
 * 区域
 * 
 * @author yanchangyou@gmail.com
 *
 */
public class ContinentHelloWorld extends HelloWorld {

	private List<CountryHelloWorld> helloWorlds = new ArrayList<CountryHelloWorld>();

	/**
	 * 添加
	 * 
	 * @param helloWorld
	 */
	public void addCountryHelloWorld(CountryHelloWorld helloWorld) {
		helloWorlds.add(helloWorld);
	}

	/**
	 * 移除
	 * 
	 * @param helloWorld
	 */
	public void removeCountryHelloWorld(CountryHelloWorld helloWorld) {
		helloWorlds.remove(helloWorld);
	}

	@Override
	public String think() {
		StringBuffer buf = new StringBuffer();
		for (CountryHelloWorld helloWorld : helloWorlds) {
			buf.append(helloWorld.think()).append("\r\n");
		}
		return buf.toString();
	}

}
