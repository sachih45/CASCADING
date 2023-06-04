package com.ty;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class College {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
   private String name;
   private String website;
   private String loc;
   private long phno;
   @OneToMany(mappedBy = "colleges", cascade = CascadeType.ALL)
   private List<Student> students;
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
public String getWebsite() {
	return website;
}
public void setWebsite(String website) {
	this.website = website;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}
   
   
}
