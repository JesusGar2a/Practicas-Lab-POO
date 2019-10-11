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
public class Automovil extends ATransporte3 implements Itransporte3
{
    private int combustible;
    private int placas;
    
    public Automovil (int combustible, int placas){ //variabkes con misbunusculas
        this.combustible = combustible;
        this.placas = placas;
     
       
       
    }
    public Automovil(){
        
    }
    @Override
    public String Apagar() {
        return "Se apaga el motor de "+ this.placas;
    }

    @Override
    public String SistemaFrenos() {
        return "Frena Autromovil "+ this.placas;
    }

    @Override
    public String SistemaElectrico() {
        return "Sistema electrico "+ this.placas;
    }
    
    
    public String EncenderMotor(int combustible) {
        if (combustible>=1)
        {
            return "Enciende el motor "+ this.placas ;
        }
        else{
            return "Falta gasolina";
        }
        
        
    }
    
    @Override
    public String Manejo() {
        return "Manejado de automovil";
    }
    
    
}
