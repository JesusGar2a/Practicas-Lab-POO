/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica4.pkg;

import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author Jesus
 */
public class CoonectionDb {
    
    String User = "root";
      String myDriver = "com.mysql.cj.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost:3306/practica5?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC";
      String pass = "root";
      //Class.forName(myDriver);
      //Connection conn = DriverManager.getConnection(myUrl, User, pass);
}
