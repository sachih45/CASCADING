package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestCollege {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sachin");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		College college=new College();
		college.setName("DVS COMPSITE");
		college.setWebsite("www.dvs.com");
		college.setLoc("SHIVAMOGGA");
		college.setPhno(7892349028l);
		
		College college1=new College();
		college1.setName("CAMBRIDGE INSTITUTE");
		college1.setWebsite("www.cambridge.com");
		college1.setLoc("BENGALURU");
		college1.setPhno(7892879028l);
		
		Student student=new Student();
		student.setName("SACHIN");
		student.setGender("male");
		student.setPhno(9876543210l);
		student.setMarks(535);
		
		Student student1=new Student();
		student1.setName("RAMESH");
		student1.setGender("male");
		student1.setPhno(9876549810l);
		student1.setMarks(280);
		
		Student student2=new Student();
		student2.setName("VAISHU");
		student2.setGender("FEmale");
		student2.setPhno(9872143210l);
		student2.setMarks(120);
		
		Student student3=new Student();
		student3.setName("SANGBULLA");
		student3.setGender("male");
		student3.setPhno(9876543110l);
		student3.setMarks(625);
		
		List<Student> list=new ArrayList<Student>();
		list.add(student);
		list.add(student1);
		
		List<Student> list1=new ArrayList<Student>();
		list1.add(student2);
		list1.add(student3);
		
		student.setColleges(college);
		student1.setColleges(college1);
		student2.setColleges(college);
		student3.setColleges(college1);
		
		college.setStudents(list);
		college1.setStudents(list1);
		
		entityTransaction.begin();
		entityManager.persist(college);
		entityManager.persist(college1);
		entityTransaction.commit();
		
		
	}

}
