package com.cg.emp.util;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;

import com.cg.emp.entity.Employee;

public class CollectionUtil {
private static HashMap<Integer,Employee> empmap=new HashMap<>();
private static ArrayList<Employee> empset=new ArrayList<Employee>();
static{
	empset.add(new Employee(1001,"Rkreddy",45000.0f,LocalDate.of(2019,Month.JANUARY,8)));
	empset.add(new Employee(1002,"sri",44000.0f,LocalDate.of(2019,Month.FEBRUARY,9)));
	empset.add(new Employee(1003,"vijay",43000.0f,LocalDate.of(2019,Month.MARCH,10)));
	empset.add(new Employee(1004,"uday",42000.0f,LocalDate.of(2019,Month.APRIL,11)));
	empset.add(new Employee(1005,"russelmama",41000.0f,LocalDate.of(2019,Month.MAY,12)));
	
	empmap.put(1001,new Employee(1001,"Rkreddy",45000.0f,LocalDate.of(2019,Month.JANUARY,8)));;
	empmap.put(1002,new Employee(1002,"sri",44000.0f,LocalDate.of(2019,Month.FEBRUARY,9)));
	empmap.put(1003,new Employee(1003,"vijay",43000.0f,LocalDate.of(2019,Month.MARCH,10)));
	empmap.put(1004,new Employee(1004,"uday",42000.0f,LocalDate.of(2019,Month.APRIL,11)));
	empmap.put(1005,new Employee(1005,"russelmama",41000.0f,LocalDate.of(2019,Month.MAY,12)));
}
	public static int addEmp(Employee emp){
		empmap.put(null, emp);
		return emp.getEmpid();
	}	
	public static HashMap<Integer, Employee> fetchAllEmp(){
		return empmap;
	}
	public static Employee getEmpById(int empId){
		Employee emp=empmap.get(empId);
		return emp;
	}
	
public static ArrayList<Employee> searchEmpByName(String empName) {
	Collections.sort(empset,Employee.getCompByName());
	return empset;
}
public static int deleteEmp(int empId){
	empmap.remove(empId);
	for(Entry<Integer, Employee> m:empmap.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      } 
	return empId;
	
}
public static Employee updateEmp(int empId, String newName, float newSal) {
	// TODO Auto-generated method stub
	Employee emp=empmap.put(empId,new Employee(empId, newName,newSal, null));
	return emp;
}
}
