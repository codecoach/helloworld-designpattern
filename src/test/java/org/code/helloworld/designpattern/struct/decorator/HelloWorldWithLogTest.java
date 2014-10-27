package org.code.helloworld.designpattern.struct.decorator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import junit.framework.TestCase;

public class HelloWorldWithLogTest extends TestCase {

	public void testSpeak() throws IOException {
		// fail("Not yet implemented");

		String encoding = "UTF-8";

		ByteArrayOutputStream out = new ByteArrayOutputStream();

		setSystemOutput(out, encoding);

		String words = "speak之前\r\nhello,world！\r\nspeak之后\r\n";

		HelloWorldWithLog helloWorld = new HelloWorldWithLog(new HelloWorld());

		helloWorld.speak();

		String output = new String(out.toString(encoding));

		assertEquals(words, output);
	}

	/**
	 * 将系统输出重定向到指定输出，并且原来的还照样输出<br>
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	private void setSystemOutput(ByteArrayOutputStream out, String encoding) throws UnsupportedEncodingException {

		final PrintStream systemPrintStream = System.out;

		PrintStream print = new PrintStream(out, true, encoding) {
			public void println(String s) {
				super.println(s);
				systemPrintStream.println(s);
			}
		};
		System.setOut(print);
	}

}
