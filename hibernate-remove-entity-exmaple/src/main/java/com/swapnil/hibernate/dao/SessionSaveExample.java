package com.swapnil.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.swapnil.hibernate.entity.Student;
import com.swapnil.hibernate.util.HibernateUtil;

public class SessionSaveExample {
	public void saveStudent(Student student) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(student);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}
