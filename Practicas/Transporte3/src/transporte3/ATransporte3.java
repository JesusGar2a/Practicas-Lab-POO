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
public abstract class  ATransporte3
{
    public abstract String Apagar();//un metoodo abstracto dentro de clase abstracta
    public abstract String Manejo();
    
    private String EncenderMotor(int Combustible)
    {
        return "Enciende motor";
    }
    
    
}
