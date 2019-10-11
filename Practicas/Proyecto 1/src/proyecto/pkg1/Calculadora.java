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


public class Calculadora implements ICalculadora {

   
    public Calculadora() {
    }
    
    
    public int suma ()
    {
        int c=0;
        int a=0;
        int b=0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el primer dato:");
        a= entrada.nextInt();
        System.out.print("Ingresa el segundo dato:");
        b= entrada.nextInt();
        c=a+b;
        return c;
        
        
    }

   

    public int resta () 
    {
        Scanner entrada = new Scanner(System.in);
        int c=0;
        int a=0;
        int b=0;
        System.out.print("Ingresa el primer dato:");
        a= entrada.nextInt();
        System.out.print("Ingresa el segundo dato:");
        b= entrada.nextInt();
        c=a-b;
        return c;
        
        
    }

    
    public int multiplicacion () 
    {
        Scanner entrada = new Scanner(System.in);
        int c=0;
        int a=0;
        int b=0;
        System.out.print("Ingresa el primer dato:");
        a= entrada.nextInt();
        System.out.print("Ingresa el segundo dato:");
        b= entrada.nextInt();
        c=a*b;
        return c;
        
        
    }
    @Override
    public int division () 
    {
        Scanner entrada = new Scanner(System.in);
        int c=0;
        int a=0;
        int b=0;
        System.out.print("Ingresa el primer dato:");
        a= entrada.nextInt();
        System.out.print("Ingresa el segundo dato:");
        b= entrada.nextInt();
        c=a/b;
        return c;
        
        
    }

    
}

