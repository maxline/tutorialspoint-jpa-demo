package com.tutorialspoint.jpademo.service;

import com.tutorialspoint.jpademo.domain.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * @author Sergey Mikhluk.
 */
public class NamedQueries {
    public static void main(String[] args) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = emFactory.createEntityManager();
        Query query = entityManager.createNamedQuery("find employee by id");

        query.setParameter("id", 1);
        List<Employee> list = query.getResultList();

        for (Employee e : list){
            System.out.println(e);
        }

        entityManager.close();
        emFactory.close();
    }
}
