package com.saraya.employees.interfaces;

import com.saraya.employees.model.Department;
import com.saraya.employees.model.Employee;

import java.util.List;

public interface IEmployee {
    Employee create(Employee o);

    List<Employee> getAll();

    Employee getById(long id);

    Employee update(long id, Employee o);

    void delete(Employee o);

    Employee update(long id, Object o);

    void delete(Object o);
}
