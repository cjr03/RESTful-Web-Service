package com.example.restservice;
import java.util.ArrayList;
import java.util.List;


public class Employees {
  
    private List<Employee> employeeList = new ArrayList<>();
  
    public List<Employee> getEmployeeList() {
        return employeeList;
    }
  
    public void setEmployeeList(List<Employee> employees) {
        this.employeeList = employees;
    }
}
