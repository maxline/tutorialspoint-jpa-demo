package com.tutorialspoint.jpademo;

import com.tutorialspoint.jpademo.domain.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Sergey Mikhluk.
 */
public class UpdateEmployee {
    public static void main(String[] args) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = emFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Employee employee = entityManager.find(Employee.class, 1201);

        //before update
        System.out.println(employee);
        employee.setSalary(4500);
        entityManager.getTransaction().commit();

        //after update
        System.out.println(employee);
        entityManager.close();
        emFactory.close();
    }
}
