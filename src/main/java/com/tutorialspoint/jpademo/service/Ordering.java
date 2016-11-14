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
public class Ordering {
    public static void main(String[] args) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = emFactory.createEntityManager();

        //Between
        Query query = entityManager.createQuery("select e " + "from Employee e "
        + "order by e.eName DESC");

        List<Employee> list = (List<Employee>)query.getResultList();

        for (Employee e: list){
            System.out.println(e);
        }

        entityManager.close();
        emFactory.close();
    }
}
