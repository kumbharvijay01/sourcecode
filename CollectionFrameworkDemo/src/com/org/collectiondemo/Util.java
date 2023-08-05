package com.org.collectiondemo;

import java.util.UUID;

public class Util {

	public static int generateUniqueId() {
		UUID idOne = UUID.randomUUID();
		String str = "" + idOne;
		int uid = str.hashCode();
		String filterStr = "" + uid;
		str = filterStr.replaceAll("-", "");
		return Integer.parseInt(str);
	}
//	27 AADCB6018P 2ZC
	// XXX: replace with java.util.UUID

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(generateUniqueId());
		}
	}
}
