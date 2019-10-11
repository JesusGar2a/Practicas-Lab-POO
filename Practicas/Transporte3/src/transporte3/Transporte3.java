/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package transporte3;

/**
 *
 * @author Jesus
 */
public class Transporte3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Automovil volkswagen = new Automovil(1,34568); // TODO code application logic here
       Automovil audi = new Automovil(20,98765);
       
        System.out.println(volkswagen.EncenderMotor(1));
        System.out.println(volkswagen.Manejo());
        System.out.println(volkswagen.SistemaElectrico());
        System.out.println(volkswagen.SistemaFrenos());
        System.out.println(volkswagen.Apagar());
        
        System.out.println(audi.EncenderMotor(20));
        System.out.println(audi.Manejo());
        System.out.println(audi.SistemaElectrico());
        System.out.println(audi.SistemaFrenos());
        System.out.println(audi.Apagar());
       
       //debe de decir auto xxxx(matricula) enncedio 
      
       //agregar otra a fimra a autibmoavuil 
       //salida debe de tener 6 mensajes cada uno?
       //imprimir todos los mensajes
      
       
       
    }
    
}
