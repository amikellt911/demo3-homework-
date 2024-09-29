package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
	String name = "llt";
	String grade = "third";
	private String info;
	public Student() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String information) {
		this.info = information;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}
	public Student(String information) {
		this.info = information;
	}
}
