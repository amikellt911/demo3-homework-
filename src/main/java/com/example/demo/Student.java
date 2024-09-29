package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
	String name = "zh";
	String grade = "good";
	private String information;
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
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}
	public Student(String information) {
		this.information = information;
	}
}
