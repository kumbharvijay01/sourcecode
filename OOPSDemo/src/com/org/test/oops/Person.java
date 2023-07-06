package com.org.test.oops;

public class Person {
	private int id;
	private String name;

	public Person() {

	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.getClass());
		System.out.println(person.toString());
		System.out.println(person.hashCode());
		System.out.println(person.equals(person));
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
