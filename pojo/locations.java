/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datumredsoft.mdwexam.pojo;

/**
 *
 * @author Ingrid Castillo
 */
public class locations {
    private Integer location_id;
    private String Street_adress;
    private Integer postal_code;
    private String City;
    private String state_province;
    private countries contry_id;
    
    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }

    public String getStreet_adress() {
        return Street_adress;
    }

    public void setStreet_adress(String Street_adress) {
        this.Street_adress = Street_adress;
    }

    public Integer getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(Integer postal_code) {
        this.postal_code = postal_code;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState_province() {
        return state_province;
    }

    public void setState_province(String state_province) {
        this.state_province = state_province;
    }

    public countries getContry_id() {
        return contry_id;
    }

    public void setContry_id(countries contry_id) {
        this.contry_id = contry_id;
    }

    
}
