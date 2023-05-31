package com.springcore;

public class Student {
	private int id; 
	private String name;
	private String address;

	public Student() {
		super();
		System.out.println("default constructor trigerred");
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String address) {
		super();
		System.out.println("parameterized constructor trigerred");
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setId method trigerred");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName method trigerred");
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		System.out.println("setAddress method trigerred");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
