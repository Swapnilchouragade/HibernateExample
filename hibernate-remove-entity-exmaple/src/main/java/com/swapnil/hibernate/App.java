package com.swapnil.hibernate;

import com.swapnil.hibernate.dao.SessionDeleteExample;
import com.swapnil.hibernate.dao.SessionRemoveExample;
import com.swapnil.hibernate.dao.SessionSaveExample;
import com.swapnil.hibernate.entity.Student;

public class App {
	public static void main(String[] args) {

		// first save few records to database
		SessionSaveExample studentDao = new SessionSaveExample();
		Student s1 = new Student("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");
		Student s2 = new Student("John", "Cena", "johncena@javaguides.com");
		studentDao.saveStudent(s1);
		studentDao.saveStudent(s2);

		// delete student
		SessionDeleteExample deleteExample = new SessionDeleteExample();
		deleteExample.deleteStudent(1);

		// delete second student
		/*SessionRemoveExample persistExample = new SessionRemoveExample();
		persistExample.removeStudent(2);*/
	}
}
