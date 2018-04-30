package aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import domain.Person;

public class Aplication {
	
	// ESTA INFORMAÇÃO ESTÁ EM META-INF/persistence.xml NA TAG <persistence-unit></persistence-unit>
	final static String PERSISTENCE_UNIT_NAME = "simple-jpa";

	public static void main(String[] args) {
		long millis = System.currentTimeMillis();
		
		// ID NULL PARA O JPA COLOCAR O ID.
		final Person p1 = new Person(null, "Gabriel_1", "gabriel1@gmail.com");
		final Person p2 = new Person(null, "Gabriel_2", "gabriel2@gmail.com");
		final Person p3 = new Person(null, "Gabriel_3", "gabriel3@gmail.com");

		final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		final EntityManager entityManager = entityManagerFactory.createEntityManager();
		final EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		
		entityTransaction.commit();

		System.out.println(entityManager.find(Person.class, 2));
		
		entityTransaction.begin();
		
		entityManager.remove(entityManager.find(Person.class, 3));
		
		entityTransaction.commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		System.out.print(System.currentTimeMillis() - millis);
	}

}
