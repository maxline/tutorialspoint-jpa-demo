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
public class BetweenAndLikeFunctions {
    public static void main(String[] args) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = emFactory.createEntityManager();

        //Between
        Query query = entityManager.createQuery("select e " + "from Employee e "
                + "where e.salary " + "between 100 and 5000");

        List<Employee> list = (List<Employee>) query.getResultList();

        for (Employee e : list) {
            System.out.println(e);
        }

        //Like
        Query query1 = entityManager.createQuery("select e " + "from Employee e "
                + "where e.eName like 'I%'");

        List<Employee> list1 = (List<Employee>) query1.getResultList();

        for(Employee e: list1){
            System.out.println(e);
        }

    }
}
