package com.employee.EmployeeProject;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    private int empid;
    private String empname;
    private String empdep;
    private int empsal;

    private LocalDate joiningDate;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpdep() {
        return empdep;
    }

    public void setEmpdep(String empdep) {
        this.empdep = empdep;
    }

    public int getEmpsal() {
        return empsal;
    }

    public void setEmpsal(int empsal) {
        this.empsal = empsal;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "Employee [empid=" + empid +
                ", empname=" + empname +
                ", empdep=" + empdep +
                ", empsal=" + empsal +
                ", joiningDate=" + joiningDate + "]";
    }
}