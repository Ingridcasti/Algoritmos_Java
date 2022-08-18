/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datumredsoft.mdwexam;

/**
 *
 * @author Ingrid Castillo
 */
public class conexion {
private  static String SERVER;
    private  static String USERNAME;
    private  static String PASSWORD;
    
    static{
        SERVER="jdbc:oracle:thin:@20.231.97.205:1521:dbexample";
        USERNAME="HR5";
        PASSWORD="hrpass";        
    }
    
    public static String getSERVER() {
        return SERVER;
    }

    public static void setSERVER(String SERVER) {
        conexion.SERVER = SERVER;
    }

    public static String getUSERNAME() {
        return USERNAME;
    }

    public static void setUSERNAME(String USERNAME) {
        conexion.USERNAME = USERNAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static void setPASSWORD(String PASSWORD) {
        conexion.PASSWORD = PASSWORD;
    }
   

    
}
