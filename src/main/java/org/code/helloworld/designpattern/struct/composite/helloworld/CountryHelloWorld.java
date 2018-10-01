package org.code.helloworld.designpattern.struct.composite.helloworld;

import org.code.helloworld.designpattern.struct.composite.HelloWorld;

/**
 * 国家
 * 
 * @author yanchangyou@gmail.com
 *
 */
public class CountryHelloWorld extends HelloWorld {

	private String words;

	public CountryHelloWorld(String words) {
		this.setWords(words);
	}

	@Override
	public String think() {
		return words;
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

}
