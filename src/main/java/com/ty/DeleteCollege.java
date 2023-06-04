package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteCollege {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sachin");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		College college=entityManager.find(College.class,  2);
		
		entityTransaction.begin();
		entityManager.remove(college);
		entityTransaction.commit();
	}

}
