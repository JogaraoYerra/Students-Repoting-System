package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student1 {
@Id
private Integer sid;
private String name;
private String marks;
private String subjects;
private String semester;
public Student1() {
	super();
	// TODO Auto-generated constructor stub
}
public Student1(Integer sid, String name, String marks, String subjects, String semester) {
	super();
	this.sid = sid;
	this.name = name;
	this.marks = marks;
	this.subjects = subjects;
	this.semester = semester;
}
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMarks() {
	return marks;
}
public void setMarks(String marks) {
	this.marks = marks;
}
public String getSubjects() {
	return subjects;
}
public void setSubjects(String subjects) {
	this.subjects = subjects;
}
public String getSemester() {
	return semester;
}
public void setSemester(String semester) {
	this.semester = semester;
}
}