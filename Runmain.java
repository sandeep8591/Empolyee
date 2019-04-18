package com.eg.emp.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Iterator;

import com.cg.emp.entity.Employee;
import com.cg.emp.exception.EmployeeException;
import com.cg.emp.service.EmployeeService;
import com.cg.emp.service.EmployeeServiceImpl;

public class Runmain {
	static Scanner sc=null;
	static EmployeeService empservice=null;
public static void main(String[] args) throws EmployeeException {
	sc=new Scanner(System.in);
	empservice=new EmployeeServiceImpl();
	int choice=0;
	while(true){
		System.out.println("What do u want to do?");
		System.out.println("1:Add Emp\t2:Fetch all emp\n");
		System.out.println("3:Delete Emp\t4:Search Empbyid\n");
		System.out.println("5:Search Emp by Name\t6:Update Emp\n");
		choice=sc.nextInt();
		switch(choice){
		case 1:
			addEmployee();
			break;
		case 2:
			fetchAllEmp();
			break;
		case 3:
			deleteEmp();
			break;
		case 4:
			getEmpById();
			break;
		case 5:
			searchEmpByName();
			break;
		case 6:
			updateEmp();
			break;
		case 7:
			default:
		}
	}
}
private static void fetchAllEmp(){
	HashMap<Integer, Employee> e=empservice.fetchAllEmp();
	 for(Entry<Integer, Employee> m:e.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      } 
}
	private static void getEmpById(){
		System.out.println("Enter EmpId:");
		int eid=sc.nextInt();
		Employee emp=empservice.getEmpById(eid);
		System.out.println(emp);
	}
	private static void updateEmp() throws EmployeeException{
		System.out.println("Enter EmpId:");
		int eid=sc.nextInt();
		System.out.println("Enter EmpName:");
		String ename=sc.next();
		System.out.println("Enter EmpSal:");
		Float esal=sc.nextFloat();
		Employee emp1=empservice.updateEmp(eid, ename, esal);
		empservice.addEmployee(emp1);
		System.out.println("updated successfully"+emp1);
		
	}
	public static void searchEmpByName(){
		System.out.println("Enter the empname:");
		String ename=sc.next();
		ArrayList<Employee> emp=empservice.searchEmpByName(ename);
		Iterator<Employee> i = emp.iterator();
        while (i.hasNext()) {
            System.out.println(i.next()); 
		}
		}
	private static void deleteEmp(){
		System.out.println("Enter EmpId to delete:");
		int edel=sc.nextInt();
		int emp=empservice.deleteEmp(edel);
		System.out.println("deleted empid is:"+emp);
	}
private static void addEmployee() {
	while(true){
		System.out.println("Enter Emp id:");
		String eid=sc.next();
		try{
			if(EmployeeService.validateEmpId(eid)){
			while(true){
				System.out.println("Enter Employee Name:");
				String ename=sc.next();
				try{
					if(EmployeeService.validateEmpName(ename)){
						while(true){
							System.out.println("Enter the Employee Salary:");
							String esal=sc.next();
							
							Employee emp=new Employee(Integer.parseInt(eid),ename,Float.parseFloat(esal),LocalDate.now());
							int empid=empservice.addEmployee(emp);
							System.out.println("Employee Added:" +empid);	
						}
					
					}
				}
		catch(Exception e){
		}
	
			}
		}
		}
		catch(Exception r){
	
	}
	}
	

}
}
