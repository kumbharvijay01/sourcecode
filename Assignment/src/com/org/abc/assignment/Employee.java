package com.org.abc.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

//	If you haven't mentioned any access modifier in variable those variables scope will be called default
//	If you specified the access as a public these data members/properties can be acccessed from other class

	String name;
	int empId;
	String email;
	String dept;
	String address;
	String city;
	String mobileNo;
	String empStatus;
	char gender;
	float basicSalary;
	float hra;
	float da;
	float professionalTax;
	float netSalary;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}

	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * @return the empStatus
	 */
	public String getEmpStatus() {
		return empStatus;
	}

	/**
	 * @param empStatus the empStatus to set
	 */
	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}

	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}

	/**
	 * @return the basicSalary
	 */
	public float getBasicSalary() {
		return basicSalary;
	}

	/**
	 * @param basicSalary the basicSalary to set
	 */
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	/**
	 * @return the hra
	 */
	public float getHra() {
		return hra;
	}

	/**
	 * @param hra the hra to set
	 */
	public void setHra(float hra) {
		this.hra = hra;
	}

	/**
	 * @return the da
	 */
	public float getDa() {
		return da;
	}

	/**
	 * @param da the da to set
	 */
	public void setDa(float da) {
		this.da = da;
	}

	/**
	 * @return the professionalTax
	 */
	public float getProfessionalTax() {
		return professionalTax;
	}

	/**
	 * @param professionalTax the professionalTax to set
	 */
	public void setProfessionalTax(float professionalTax) {
		this.professionalTax = professionalTax;
	}

	/**
	 * @return the netSalary
	 */
	public float getNetSalary() {
		return netSalary;
	}

	/**
	 * @param netSalary the netSalary to set
	 */
	public void setNetSalary(float netSalary) {
		this.netSalary = netSalary;
	}

	public static void main(String args[]) throws FileNotFoundException {
		System.out.println("Employee Class Demo");
		Employee employee = new Employee();
		employee.setCity("Pune");

		Employee employee1 = new Employee();
		employee1.setCity("Bangalore");

		Employee employee2 = new Employee();
		employee2.setCity("Nagpur");

		Employee employee3 = new Employee();
		employee3.setCity("Nashik");

		System.out.println("Employee  City " + employee.getCity());
		System.out.println("Employee 1 City " + employee1.getCity());
		System.out.println("Employee 2 City " + employee2.getCity());
		System.out.println("Employee 3 City " + employee3.getCity());

		List<Employee> list = new ArrayList<>();
		for (int i = 1; i < 5; i++) {
			Employee employee4 = new Employee();
			employee4.setCity("ABC");
			list.add(employee4);
		}

		File file = new File("D:\\doc.csv");

		Scanner scanner = new Scanner(file);

		System.out.println("-------------------" + scanner.next());

		for (Employee employee4 : list) {
			System.out.println(employee4.getCity());

		}

	}

}
