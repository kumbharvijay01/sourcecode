package com.org.test.oops;

public class StringBuilderDemo {

	public static void main(String[] args) {
//		String name = "ABC";
//		String name1 = new String();
//		name1 = "ABC";
//		System.out.println(name);
//		System.out.println(name1);

		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
			System.out.println("Value of " + i + " arr[" + i + "]");
		}

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("<html>");
		stringBuilder.append("<body>");
		for (int i : arr) {
			stringBuilder.append("<h1>Hello World" + arr[i] + "<br></h1>");
		}

		stringBuilder.append("</body>");
		stringBuilder.append("</html>");
		System.out.println(stringBuilder.reverse());

//		System.out.println(stringBuilder);

		StringBuffer stringBuffer = new StringBuffer();

		stringBuffer.append("abc");
		stringBuffer.append("abc");
		stringBuffer.append("abc");
		stringBuffer.append("abc");
		stringBuffer.append("abc");
		System.out.println(stringBuffer);
	}
}
