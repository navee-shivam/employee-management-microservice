package com.employee.system.Entity;

public class Department {
	private int id;
	private String department;
	private int port;

	public Department(int id, String department, int port) {
		super();
		this.id = id;
		this.department = department;
		this.port = port;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
