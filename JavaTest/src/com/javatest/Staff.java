package com.javatest;

public class Staff extends User {

	public static int salary;

	public Staff() {

	}

	public Staff(String id, String pw, String name, int salary) {
		super(id, pw, name);
		Staff.salary = salary;
	}

	public static int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		Staff.salary = salary;
	}

	@Override
	public void showInfo() {
		System.out.println("Staff:" + toString() + ", Salary: " + Staff.salary);

	}

}
