package com.it.prague.employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
@NamedQueries({
    @NamedQuery(name="empAllRecords", query="SELECT emp FROM Employee emp"),
    @NamedQuery(name="empGetRecords", query="SELECT emp FROM Employee emp"),
    @NamedQuery(name="empDeleteRecords", query="DELETE FROM Employee emp WHERE emp.id= :id")
})
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name = "empName")
    private String empName;
    
    @Column(name = "empSalary")
    private int empSalary;
    
    // Default constructor
    public Employee() {
        super();
    }

    public Employee(String empName, int empSalary) {
        super();
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", empName=" + empName + ", empSalary=" + empSalary + "]";
    }
}
