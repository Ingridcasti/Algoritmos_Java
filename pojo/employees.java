/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datumredsoft.mdwexam.pojo;
import java.sql.Date;
/**
 *
 * @author Ingrid Castillo
 */
public class employees {
     private Integer employee_id;
     private String first_name;
     private String last_name;
     private String email;
     private Integer phone_number;
     private Date hire_date;
     private jobs job_id;
     private Integer salary;
     private Float Commission_pct;
     private Integer manager_id;
     private departments department_id;
     
    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Integer phone_number) {
        this.phone_number = phone_number;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public jobs getJob_id() {
        return job_id;
    }

    public void setJob_id(jobs job_id) {
        this.job_id = job_id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Float getCommission_pct() {
        return Commission_pct;
    }

    public void setCommission_pct(Float Commission_pct) {
        this.Commission_pct = Commission_pct;
    }

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
    }

    public departments getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(departments department_id) {
        this.department_id = department_id;
    }
  
      
}
