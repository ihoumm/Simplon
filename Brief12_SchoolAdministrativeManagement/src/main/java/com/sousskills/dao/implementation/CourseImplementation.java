package com.sousskills.dao.implementation;

import java.util.List;
import org.hibernate.Transaction;
import org.hibernate.Session;
import com.sousskills.dao.DaoManagement;
import com.sousskills.hibernate.Hibernate;
import com.sousskills.model.Course;

public class CourseImplementation implements DaoManagement<Course> {

	@Override
	public void create(Course course) {
		Transaction transaction = null;
		try (Session session = Hibernate.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the course object
			session.save(course);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {

				transaction.rollback();

			}
			e.printStackTrace();
		}
	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Course course) {
		Transaction transaction = null;
		try (Session session = Hibernate.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(course);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {

				transaction.rollback();
			}
		}
	}

	@Override
	public void delete(int id) {
		Transaction transaction = null;
		try (Session session = Hibernate.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			Course course = session.get(Course.class, id);
			if (course != null) {
				session.delete(course);
				transaction.commit();
			}
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

}
