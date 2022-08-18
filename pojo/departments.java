/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datumredsoft.mdwexam.pojo;

/**
 *
 * @author Ingrid Castillo
 */
public class departments {
    private Integer department_id;
    private String department_name;
    private locations location_id;
    private employees manager_id;
    
    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public locations getLocation_id() {
        return location_id;
    }

    public void setLocation_id(locations location_id) {
        this.location_id = location_id;
    }

    public employees getManager_id() {
        return manager_id;
    }

    public void setManager_id(employees manager_id) {
        this.manager_id = manager_id;
    }

    
}
