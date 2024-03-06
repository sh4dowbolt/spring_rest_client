package com.suraev.spring.rest;

import com.suraev.spring.rest.configuration.MyConfig;
import com.suraev.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication= context.getBean("communication", Communication.class);
        /*List<Employee> employeeList= communication.getAllEmployees();
        System.out.println(employeeList);*/

        /*Employee employee = communication.getEmployee(8);
        System.out.println(employee);*/

/*
        Employee employee = new Employee("Sveta", "Sokolova", "HR", 900);
        communication.saveEmployee(employee);
*/
     /*   Employee employee = new Employee("Sveta", "Kirkrokova", "HR", 900);
        employee.setId(12);
        communication.saveEmployee(employee);*/

        communication.deleteEmployee(12);

    }
}
