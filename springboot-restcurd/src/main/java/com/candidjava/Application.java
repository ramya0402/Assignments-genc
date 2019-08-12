package com.candidjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.candidjava.spring.bean.Employee;
import com.candidjava.spring.service.EmployeeService;
import com.candidjava.spring.service.EmployeeServiceImp;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		Employee emp1=new Employee();
		EmployeeService employeeservice=new EmployeeServiceImp();
		double max=0;
		for(Employee emp:employeeservice.getEmployee())
		{
			if(max<emp.getSalary())
			{
				max=emp.getSalary();
				emp1=emp;
		}
		
	}
		System.out.println(emp1);

}
}
