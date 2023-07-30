/**
 * 
 */
package com.org.collectiondemo.assignment;

/**
 * 
 */
public class Employee {
	private int empId;
	private String name;
	private int basicSalary;
	private float hra;//cal
	private float lta;
	private int mealPass;
	private float pf;//cal
	private int pt;
	private float grossSalary;//cal
	private float netSalary;//cal

	/**
	 * 
	 */
	public Employee() {
		super();
	}

	/**
	 * @param empId
	 * @param name
	 * @param basicSalary
	 * @param hra
	 * @param lta
	 * @param mealPass
	 * @param pf
	 * @param pt
	 * @param grossSalary
	 * @param netSalary
	 */
	public Employee(int empId, String name, int basicSalary, float hra, float lta, int mealPass, float pf, int pt,
			float grossSalary, float netSalary) {
		super();
		this.empId = empId;
		this.name = name;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.lta = lta;
		this.mealPass = mealPass;
		this.pf = pf;
		this.pt = pt;
		this.grossSalary = grossSalary;
		this.netSalary = netSalary;
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
	 * @return the basicSalary
	 */
	public int getBasicSalary() {
		return basicSalary;
	}

	/**
	 * @param basicSalary the basicSalary to set
	 */
	public void setBasicSalary(int basicSalary) {
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
	 * @return the lta
	 */
	public float getLta() {
		return lta;
	}

	/**
	 * @param lta the lta to set
	 */
	public void setLta(float lta) {
		this.lta = lta;
	}

	/**
	 * @return the mealPass
	 */
	public int getMealPass() {
		return mealPass;
	}

	/**
	 * @param mealPass the mealPass to set
	 */
	public void setMealPass(int mealPass) {
		this.mealPass = mealPass;
	}

	/**
	 * @return the pf
	 */
	public float getPf() {
		return pf;
	}

	/**
	 * @param pf the pf to set
	 */
	public void setPf(float pf) {
		this.pf = pf;
	}

	/**
	 * @return the pt
	 */
	public int getPt() {
		return pt;
	}

	/**
	 * @param pt the pt to set
	 */
	public void setPt(int pt) {
		this.pt = pt;
	}

	/**
	 * @return the grossSalary
	 */
	public float getGrossSalary() {
		return grossSalary;
	}

	/**
	 * @param grossSalary the grossSalary to set
	 */
	public void setGrossSalary(float grossSalary) {
		this.grossSalary = grossSalary;
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

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", basicSalary=" + basicSalary + ", hra=" + hra
				+ ", lta=" + lta + ", mealPass=" + mealPass + ", pf=" + pf + ", pt=" + pt + ", grossSalary="
				+ grossSalary + ", netSalary=" + netSalary + "]";
	}
	
	

}
