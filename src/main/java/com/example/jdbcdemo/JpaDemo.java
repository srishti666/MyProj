package com.example.jdbcdemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class JpaDemo {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction transaction = null;
		
		try {
			em.getTransaction().begin();
			
			Address address = new Address();
			address.setStreet("Newtown");
			address.setCity
		}
	}

}
