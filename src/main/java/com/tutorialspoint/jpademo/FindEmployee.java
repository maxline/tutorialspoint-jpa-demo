package com.tutorialspoint.jpademo;

import com.tutorialspoint.jpademo.domain.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Sergey Mikhluk.
 */
public class FindEmployee {
    public static void main(String[] args) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = emFactory.createEntityManager();

        Employee employee = entityManager.find(Employee.class, 1201);
        System.out.println(employee);
    }
}
