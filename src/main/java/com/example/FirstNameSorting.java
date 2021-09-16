package com.example;

import java.util.Comparator;
import java.util.stream.Collector;

public class FirstNameSorting implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
    
}
