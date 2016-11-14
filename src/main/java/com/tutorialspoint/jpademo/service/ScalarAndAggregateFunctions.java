package com.tutorialspoint.jpademo.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * @author Sergey Mikhluk.
 */
public class ScalarAndAggregateFunctions {
    public static void main(String[] args) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = emFactory.createEntityManager();

        //Scalar function
        Query query = entityManager.createQuery("Select UPPER(e.eName) from Employee e");
        List<String> list = query.getResultList();

        for(String e:list){
            System.out.println("Employee NAME :" + e);
        }

        //Aggregate function
        Query query1 = entityManager.createQuery("Select MAX(e.salary) from Employee e");
        Double result = (Double) query1.getSingleResult();
        System.out.println("Max Employee Salary :" + result);

        entityManager.close();
        emFactory.close();
    }
}
