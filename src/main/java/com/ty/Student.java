package com.ty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
   private String name;
   private String gender;
   private long phno;
   private int marks;
   @ManyToOne
   @JoinColumn
   private College colleges;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public College getColleges() {
	return colleges;
}
public void setColleges(College colleges) {
	this.colleges = colleges;
}
   
   
}
