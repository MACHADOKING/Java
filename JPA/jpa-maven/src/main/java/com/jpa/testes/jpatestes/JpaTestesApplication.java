package com.jpa.testes.jpatestes;

import com.jpa.testes.jpatestes.domain.entities.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class JpaTestesApplication {

	public static void main(String[] args) {

		SpringApplication.run(JpaTestesApplication.class, args);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-testes");
		EntityManager em = emf.createEntityManager();

		Person p = em.find(Person.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();

		System.out.println("Pronto!");
		em.close();
		emf.close();
	}

}
