package ua.logos;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//import java.math.BigDecimal;
//import ua.logos.entity.Course;
//import ua.logos.entity.Teacher;
//import ua.logos.entity.TeacherDetails;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("logos");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		
//		Teacher teacher = new Teacher();
//		teacher.setAge(34);
		
//		TeacherDetails details = TeacherDetails.builder()
//				.hobbies("play games, programming")
//				.description("some description...")
//				.build();
//		em.persist(details);
		
//		Teacher teacher = 
//				Teacher.builder()
//					.email("john2@gmail.com")
//					.firstName("John")
//					.lastName("Doe")
//					.age(54)
//				.build();
//		
//		teacher.setTeacherDetails(TeacherDetails.builder()
//				.hobbies("play games, programming")
//				.description("some description...")
//				.build());
//		em.persist(teacher);	
//		System.out.println(teacher);
//		
//		Teacher teacher2 = 
//					em.createQuery("SELECT t FROM Teacher t WHERE t.id = :id", Teacher.class)
//					.setParameter("id", 1L).getSingleResult();
//		
//		System.out.println(teacher2);
//		
//		for (int i = 0; i < 20; i++) {
//			Course course = Course.builder()
//					.title("Course_title#" + i)
//					.description("Course Description")
//					.price(new BigDecimal(i * 10 + ".00"))
//					.teacher(teacher2)
//					.build();
//			em.persist(course);
//		}
		
//		Teacher teacher = 
//				em.createQuery(
//				"SELECT t FROM Teacher t JOIN FETCH t.teacherDetails td WHERE t.id = :id", Teacher.class)
//				.setParameter("id", 1L).getSingleResult();
//		System.out.println(teacher);
//		System.out.println(teacher.getTeacherDetails());
//		
//		Teacher teacher = 
//				em.createQuery(
//				"SELECT t FROM Teacher t JOIN FETCH t.courses c WHERE t.id = :id", Teacher.class)
//				.setParameter("id", 1L).getSingleResult();
//		System.out.println(teacher);
//		System.out.println(teacher.getCourses());
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();
	}
}
