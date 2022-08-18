/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datumredsoft.mdwexam.pojo;
/**
 *
 * @author Ingrid Castillo
 */
public class countries {
    private Integer country_id;
    private String country_name;
    private regions region_id;
    
    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public regions getRegion_id() {
        return region_id;
    }

    public void setRegion_id(regions region_id) {
        this.region_id = region_id;
    }

 
}
