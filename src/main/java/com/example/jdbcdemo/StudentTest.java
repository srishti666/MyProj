package com.example.jdbcdemo;

import java.util.PreparedStatement;
import java.netjstech.entities.Student;

public class StudentTest {

	public static void main(String[] args) {

		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();

		Student student = new Student();
		student.setStudnetName("Rakhi");
		// Insert
		em.persist(student);

		// Select with where
		Student student = em.find(Student.class, 2);
		System.out.println("Id: " + student.getStudentId() + "Name " + student.getStudnetName9);
		student.setStudentName("Test User");
		em.persist(student);
		em.getTransaction().commit();
		em.getTransaction().begin();
		student.setStudentName("TempName");

		JPAUtil.cleanup();

	}
}
