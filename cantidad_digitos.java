/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datumredsoft.mdwexam;

/**
 *
 * @author Ingrid Castillo
 */
public class cantidad_digitos {
    
        public static void main(String[] args) {
            int iNumero = 123458;
            int c = cantidad(iNumero); 
             System.out.println(iNumero + " tiene " + c + " dígitos");
           
            
    }

         public static Integer cantidad(int Numero){
           int iNumero = Numero;
            String x = Integer.toString(iNumero);
            int cantidad_cont= x.length();
           return cantidad_cont;
        }
    
}
