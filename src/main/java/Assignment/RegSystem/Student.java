package Assignment.RegSystem;

import java.util.ArrayList;

import org.joda.time.LocalDate;

public class Student {
	// contain information such as (Name, Age, DOB, ID, username etc)
	private String name;
	private int age;
	private LocalDate dOB;
	private String iD;
	private String username;
	private Programme course;
	
	public Student(String nm, int age1, LocalDate dOB1, String iD1) {

		this.name = nm;
		this.age = age1;
		this.dOB = dOB1;
		this.iD = iD1;
	}

	public Student(String nm, int age1, LocalDate dOB1, String iD1, String userNme) {

		this.name = nm;
		this.age = age1;
		this.dOB = dOB1;
		this.iD = iD1;
		this.username = userNme;

	}
	

	public void setName(String nm) {
		name = nm;
	}

	public void setAge(int age1) {
		age = age1;
	}

	public void setdOB(LocalDate dOB1) {
		dOB = dOB1;
	}

	public void setiD(String iD1) {
		iD = iD1;
	}

	public void setUsername(String userNme) {
		username = userNme;
	}

	public String getName() {
		return name;

	}

	public int getAge() {
		return age;
	}

	public LocalDate getdOB() {
		return dOB;
	}

	public String getiD() {
		return iD;

	}
	
	public Programme getCourse() {
		return this.course;
	}
	
	public void register(Programme course) {
		this.course = course;
	}

	// b. A specific method (getUsername) will generate the student’s username by concatenating their Name and Age
	public String getUsername() {
		String usernameEdit = this.name.toLowerCase();
		usernameEdit = usernameEdit.replaceAll("\\s", "");
		int ageEdit = getAge();
		// String ageEditString = String.valueOf(ageEdit);
		username = usernameEdit + ageEdit;
		return username;

	}

	public String toString() {

		String sentence = "Student Name: " + getName() + "\nStudent Age: " + getAge() + "\nStudent DOB: " + getdOB()
				+ "\nStudent ID: " + getiD() + "\nStudent Username: " + getUsername() + "\n";

		return sentence;

	}

	public static void main(String[] args) {
		LocalDate dateB = new LocalDate(1995, 06, 15);
		// Student student = new Student("Aimee Smith", 22, dateB,"I337965", null);
		// System.out.println(student);
	}
}
