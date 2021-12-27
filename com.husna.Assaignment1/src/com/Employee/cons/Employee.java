package com.Employee.cons;

public class Employee {
	String empName;
	int empId;
	int empAg;
	String empdesgn;
	String empLocation;
	int empExpInYrs;
	public Employee(String empName) {
		super();
		this.empName = empName;
    		
	}
	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}
	
	public Employee(String empName, int empId, int empAg) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAg = empAg;
	}
	public Employee(String empName, int empId, String empdesgn) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empdesgn = empdesgn;
	}
	public Employee(String empName, int empId, int empAg, String empdesgn) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAg = empAg;
		this.empdesgn = empdesgn;
	}
	public Employee(String empName,String empLocation, int empId, int empAg) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAg = empAg;
		this.empLocation = empLocation;
	}
	public Employee(String empName, int empId, int empAg, int empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAg = empAg;
		this.empExpInYrs = empExpInYrs;
	}
	public Employee(String empName, int empId, String empdesgn, int empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empdesgn = empdesgn;
		this.empExpInYrs = empExpInYrs;
	}
	public Employee(String empName, int empId, String empdesgn, String empLocation, int empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empdesgn = empdesgn;
		this.empLocation = empLocation;
		this.empExpInYrs = empExpInYrs;
	}
	public Employee(String empName, int empId, int empAg, String empdesgn, String empLocation, int empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAg = empAg;
		this.empdesgn = empdesgn;
		this.empLocation = empLocation;
		this.empExpInYrs = empExpInYrs;
	}
}
