package com.candidjava.spring.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.candidjava.spring.bean.Employee;


@Service
public class EmployeeServiceImp implements EmployeeService {

	private static List<Employee> employees;

	static {
		employees = dummyEmployees();
	}
	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return employees;
	}
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		for (Employee employee : employees) {
			if (employee.getId() == id) {
				return employee;
			}
		}
		return null;
	}

	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employees.add(employee);
	}
	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		Iterator<Employee> it = employees.iterator();
		while (it.hasNext()) {
			Employee employee = (Employee) it.next();
			if (employee.getId() == id) {
				it.remove();
			}
		}
	}

	public void updatePartially(Employee currentEmployee, int id) {
		for (Employee employee : employees) {
			if (employee.getId() == id) {
				if (currentEmployee.getCountry() != null) {
					employee.setId(id);
					employee.setCountry(currentEmployee.getCountry());
				}
				employee.setName(employee.getName());
				update(employee);
			}
		}

	}

	public void update(Employee employee) {
		// TODO Auto-generated method stub
		int index = employees.indexOf(employee);
		employees.set(index, employee);
	}

	private static List<Employee> dummyEmployees() {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(14221, "John", "INDIA",12000));
		employees.add(new Employee(14222, "Ben", "UK",15000));
		employees.add(new Employee(14223, "Andrew", "INDIA",18000));
		employees.add(new Employee(14224, "Samuael", "USA",10000));
		return employees;
	}

	

	

}
