package com.org.test;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringBufDemo {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
//		System.out.println(buffer.toString());
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Today's date: " + sdf.format(cal.getTime()));
		Format f = new SimpleDateFormat("EEE");
		String str = f.format(new Date());
		buffer.append(str);
		System.out.println("Final String : " + buffer.toString());
	}
}
