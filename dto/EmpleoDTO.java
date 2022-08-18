/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datumredsoft.mdwexam.dto;
import com.datumredsoft.mdwexam.conexion;
import com.datumredsoft.mdwexam.pojo.employees;
import com.datumredsoft.mdwexam.pojo.departments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ingrid Castillo
 */
public class EmpleoDTO {
     /* /Cliente/Listar Lista los clientes y los filtra*/
    public List<employees> getAll(){
        List<employees> empleado = new ArrayList<>();
        
        try {

            Connection conn = DriverManager.getConnection(conexion.getSERVER(),
                    conexion.getUSERNAME(), conexion.getPASSWORD());

            String sql ="SELECT FIRST_NAME, LAST_NAME, HIRE_DATE\n" +
                        "FROM EMPLOYEES\n" +
                        "ORDER BY LAST_NAME";

            PreparedStatement statement = conn.prepareStatement(sql);
            
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                employees empleados = new employees();
                
                empleados.setFirst_name(rs.getString("FIRST_NAME"));
                empleados.setLast_name(rs.getString("LAST_NAME"));
                empleados.setHire_date(rs.getDate("HIRE_DATE"));
               
                empleado.add(empleados);
            }

            rs.close();
            statement.close();
            conn.close();

            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return empleado;
    }
    
    
    
     public List<employees> getvisualizar_order(){
        List<employees> empleado = new ArrayList<>();
        
        try {

             Connection conn = DriverManager.getConnection(conexion.getSERVER(),
                    conexion.getUSERNAME(), conexion.getPASSWORD());

            String sql ="SELECT EMPLOYEES.FIRST_NAME \"First\",\n" +
                        "EMPLOYEES.LAST_NAME \"Last\",\n" +
                        "DEPARTMENTS.DEPARTMENT_NAME \"Dept. Name\"\n" +
                        "FROM EMPLOYEES, DEPARTMENTS\n" +
                        "WHERE EMPLOYEES.DEPARTMENT_ID = DEPARTMENTS.DEPARTMENT_ID\n" +
                        "ORDER BY DEPARTMENTS.DEPARTMENT_NAME, EMPLOYEES.LAST_NAME";

            PreparedStatement statement = conn.prepareStatement(sql);
            
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                employees empleados = new employees();
                empleados.setFirst_name(rs.getString("First"));
                empleados.setLast_name(rs.getString("Last"));
              
                departments depart = new departments();
                depart.setDepartment_name(rs.getString("Dept. Name"));
              
                empleados.setDepartment_id(depart);

                empleado.add(empleados);
            }

            rs.close();
            statement.close();
            conn.close();

            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return empleado;
    }
}
    