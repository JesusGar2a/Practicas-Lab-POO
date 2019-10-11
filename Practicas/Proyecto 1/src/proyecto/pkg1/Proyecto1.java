/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

import java.util.Scanner;

/**
 *
 * @author FCFM
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in);
       Calculadora calc = new Calculadora();
       
        System.out.println(calc.suma()); 
        System.out.println(calc.resta()); 
        System.out.println(calc.multiplicacion()); 
        System.out.println(calc.division()); 
        
    
    }

    
       
}

