package com.sousskills.model;

import org.hibernate.Session;

import com.sousskills.hibernate.Hibernate;

public class MainTest {

	public static void main(String[] args) {
		Session session = Hibernate.getSessionFactory().openSession();
		session.beginTransaction();
		session.close();
	}

}
