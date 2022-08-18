/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datumredsoft.mdwexam.pojo;

/**
 *
 * @author Ingrid Castillo
 */
public class jobs {
    private Integer job_id;
    private String job_title;
    private Float min_salary;
    private Float max_salary;

    public Float getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(Float min_salary) {
        this.min_salary = min_salary;
    }

    public Float getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(Float max_salary) {
        this.max_salary = max_salary;
    }

    
    public Integer getJob_id() {
        return job_id;
    }

    public void setJob_id(Integer job_id) {
        this.job_id = job_id;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }


}
