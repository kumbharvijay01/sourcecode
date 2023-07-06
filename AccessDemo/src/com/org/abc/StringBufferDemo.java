/**
 * 
 */
package com.org.abc;

/**
 * 
 */
public class StringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer stringBuffer = new StringBuffer();
		StringBuffer stringBuffer1 = new StringBuffer();

		stringBuffer.append(false);
		stringBuffer.append('A');
		stringBuffer.append("Test");
		stringBuffer1.append(":: StringBuffer2 Example");
		stringBuffer.append(stringBuffer1);
		System.out.println(stringBuffer);
		StringBuffer buffer = new StringBuffer();
		buffer.append("ABC");

		System.out.println(buffer.reverse());
		System.out.println(buffer.delete(1, 2));

	}

}
