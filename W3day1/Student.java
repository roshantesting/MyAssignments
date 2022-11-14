package org.student ;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
	
		System.out.println("Student Name is Roshan");

	}

	public void studentDept() {
		
		System.out.println("Student Dept is CSE");
	}
	
	
	public void studentID() {

		System.out.println("Student is AN5875");

	}
	
	public static void main(String[] args) {
		
		Student obj=new Student();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.deptName();
		obj.studentDept();
		obj.studentID();
		obj.studentName();
		
	}
}
