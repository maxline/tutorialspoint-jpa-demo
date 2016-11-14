package com.tutorialspoint.jpademo.service;

import com.tutorialspoint.jpademo.domain.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Sergey Mikhluk.
 */
public class DeleteEmployee {
    public static void main(String[] args) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = emFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Employee employee = entityManager.find(Employee.class, 1201);
        entityManager.remove(employee);
        entityManager.getTransaction().commit();
        entityManager.close();
        emFactory.close();
    }
}
