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
public class job_history {
    private employees employee_id;
    private Date start_date;
    private Date end_date;
    private jobs job_id;
    private departments department_id;
    
    public employees getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(employees employee_id) {
        this.employee_id = employee_id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public jobs getJob_id() {
        return job_id;
    }

    public void setJob_id(jobs job_id) {
        this.job_id = job_id;
    }

    public departments getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(departments department_id) {
        this.department_id = department_id;
    }

    
    
    
}
