/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica4.pkg;

import java.sql.*;


/**
 *
 * @author Jesus
 */
public class CoonectionDb {
    //aqui todo para conectarse a la base de datos 
    
    /*
     try{
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://practica5";
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(myUrl, "root", "Weegeestaaqui1");
            
            String query = " insert into datos (nombre, apellido, correo, direccion, telefono)"
        + " values (?, ?, ?, ?, ?)";
            
          PreparedStatement preparedStmt = conn.prepareStatement(query);
          preparedStmt.setString (1, this.txtNombre.getText());
          preparedStmt.setString (2, this.txtApellido.getText());
          preparedStmt.setString (3, this.txtCorreo.getText());
          preparedStmt.setString (4, this.txtDireccion.getText());
          preparedStmt.setString (5, this.txtTelefono.getText());
          

      // execute the preparedstatement
      preparedStmt.execute();
      
      conn.close();
            
        }catch(Exception e){
            System.err.println(e);
        }
        
        */
    
        //retornarn la conexion
}
