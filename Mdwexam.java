/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.datumredsoft.mdwexam;

import java.util.List;
import com.datumredsoft.mdwexam.dto.EmpleoDTO;
import com.datumredsoft.mdwexam.pojo.employees;

/**
 *
 * @author Datumredsoft
 */
public class Mdwexam {

    public static void main(String[] args) {
      
        lis_employees();
        lis_employees_order();
    }
    
     
    private static void lis_employees() {
        EmpleoDTO empleoDTO = new EmpleoDTO();
        
        List<employees> empleados = empleoDTO.getAll();
        
        System.out.println("\nListado de los empleados: ");
        for(employees e: empleados){
            System.out.println(e.getFirst_name()+"\t "
                    +e.getLast_name() + "\t "
                    +e.getHire_date() 
            );
        }
        }
        
    private static void lis_employees_order() {
        EmpleoDTO empleoDTO = new EmpleoDTO();
        
        List<employees> empleados = empleoDTO.getvisualizar_order();
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
                  
        System.out.println("\nListado de los empleados ordenados: ");
        for(employees e: empleados){
            System.out.println(e.getFirst_name()+"\t "
                    +e.getLast_name() + "\t "
                    +e.getDepartment_id().getDepartment_name()
            );
        }
        }
    
    
}
