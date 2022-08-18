/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datumredsoft.mdwexam;

/**
 *
 * @author Ingrid Castillo
 */
public class caminos_posibles {
       public static void main(String[] args) {
            int iNumero = 3;
           long x =possForStep(iNumero); 
             System.out.println( " posibles caminos: " + x + " ");
    }

      public static long possForStep(int n) {
  
    long cur = n, last = 0;
    for (int i = 1; i < n; i++) {
       
        long tmp = cur;
        cur = cur + last;
        last = tmp;
    }
    return cur;
}
        
        
}
