package com.tutorialspoint.jpademo;

import com.tutorialspoint.jpademo.domain.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Sergey Mikhluk.
 */
public class CreateEmployee {
    public static void main(String[] args) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = emFactory.createEntityManager();

        entityManager.getTransaction().begin();

        //if you set eId manually then you need to comment line @GeneratedValue(strategy = GenerationType.AUTO)
        Employee employee = new Employee(1201, "Gopal", 4000, "Technical manager");

        entityManager.persist(employee);
        entityManager.getTransaction().commit();
        entityManager.close();
        emFactory.close();
    }
}
