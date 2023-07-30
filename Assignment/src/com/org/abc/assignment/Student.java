/**
 * 
 */
package com.org.abc.assignment;

/**
 * @author vijaykumbhar
 *
 */
public class Student {

	private int rollNo;
	private String name;
	private int subject1, subject2, subject3, subject4;
	private int totalMarks;
	private float percentage;
	private String grade;
	private boolean promoted;
	

	/**
	 * 
	 */
	public Student() {
		super();
	}

	/**
	 * @param rollNo
	 * @param name
	 * @param subject1
	 * @param subject2
	 * @param subject3
	 * @param subject4
	 * @param totalMarks
	 * @param percentage
	 * @param grade
	 * @param promoted
	 */
	public Student(int rollNo, String name, int subject1, int subject2, int subject3, int subject4, int totalMarks,
			float percentage, String grade, boolean promoted) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
		this.totalMarks = totalMarks;
		this.percentage = percentage;
		this.grade = grade;
		this.promoted = promoted;
	}

	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}

	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
	 * @return the subject1
	 */
	public int getSubject1() {
		return subject1;
	}

	/**
	 * @param subject1 the subject1 to set
	 */
	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}

	/**
	 * @return the subject2
	 */
	public int getSubject2() {
		return subject2;
	}

	/**
	 * @param subject2 the subject2 to set
	 */
	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}

	/**
	 * @return the subject3
	 */
	public int getSubject3() {
		return subject3;
	}

	/**
	 * @param subject3 the subject3 to set
	 */
	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}

	/**
	 * @return the subject4
	 */
	public int getSubject4() {
		return subject4;
	}

	/**
	 * @param subject4 the subject4 to set
	 */
	public void setSubject4(int subject4) {
		this.subject4 = subject4;
	}

	/**
	 * @return the totalMarks
	 */
	public int getTotalMarks() {
		return totalMarks;
	}

	/**
	 * @param totalMarks the totalMarks to set
	 */
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	/**
	 * @return the percentage
	 */
	public float getPercentage() {
		return percentage;
	}

	/**
	 * @param percentage the percentage to set
	 */
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * @return the promoted
	 */
	public boolean isPromoted() {
		return promoted;
	}

	/**
	 * @param promoted the promoted to set
	 */
	public void setPromoted(boolean promoted) {
		this.promoted = promoted;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", subject1=" + subject1 + ", subject2=" + subject2
				+ ", subject3=" + subject3 + ", subject4=" + subject4 + ", totalMarks=" + totalMarks + ", percentage="
				+ percentage + ", grade=" + grade + ", promoted=" + promoted + "]";
	}

}
