package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee e1 = new Employee((1), "afirstName", "blastName", 23);
        Employee e2 = new Employee((2), "cfirstName", "dlastName", 32);
        Employee e3 = new Employee((3), "efirstName", "flastName", 24);
        Employee e4 = new Employee((4), "gfirstName", "hlastName", 40);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(e3);
        employees.add(e1);
        employees.add(e4);
        employees.add(e2);

        //Unsorted employee list 
        System.out.println(employees);

        //Default sorting by employee id using compareTo(t o) method
        Collections.sort(employees);
        System.out.println("Using Comparable interface method compareTo(t o)" +employees);

        //Sorting by employee first Name using Comparator interface
        Collections.sort(employees , new FirstNameSorting());
        System.out.println("Using Comparator interface method compareTo()" +employees);
        
        //Sorting by employee last Name using Comparator interface
        Collections.sort(employees , new LastNameSorting());
        System.out.println("Using Comparator interface method compareTo()" +employees);
        
        //Sorting by employee age Name using Comparator interface
        Collections.sort(employees , new AgeSorting());
        System.out.println("Using Comparator interface method compareTo()" +employees);
    
    }
}
