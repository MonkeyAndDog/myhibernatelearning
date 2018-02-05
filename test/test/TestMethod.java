package test;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import com.mrhu.hibernate.model.Course;
import com.mrhu.hibernate.model.Student;
import com.mrhu.hibernate.model.StudentPK;
import com.mrhu.hibernate.model.Teacher;
import com.mrhu.hibernate.model.TeacherPK;
import com.mrhu.hibernate.util.MySession;

public class TestMethod {

	@Test
	public void testDelete() {
		Teacher t = new Teacher();
		TeacherPK pk = new TeacherPK();
		pk.setId(11);
		pk.setName("jjj");
		t.setPk(pk);
		
		SessionFactory sessionFactory = MySession.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.delete(t);
		session.getTransaction().commit();
	}
	
	@Test
	public void testLoad() {
		Teacher t;
		TeacherPK pk = new TeacherPK();
		pk.setId(11);
		pk.setName("jjj");
		
		
		Student s;
		StudentPK pk2 = new StudentPK();
		pk2.setId(1);
		pk2.setName("jjj");
		
		Course c;
		
		SessionFactory sessionFactory = MySession.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
//		t = (Teacher)session.load(Teacher.class, pk);
//		s = (Student)session.load(Student.class, pk2);
		c = (Course)session.load(Course.class, 1);
//		System.out.println(s.getAge());
		System.out.println(c.getName());
		session.getTransaction().commit();
	}

}
