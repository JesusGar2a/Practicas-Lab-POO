/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica8.pkg;


import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Jesus
 */
public class JFrmMyApp extends JFrame  /*implements  ActionListener*/{
    
    
    JLabel LblName = new JLabel();
    JTextField TxtName = new JTextField();
    JButton BtnAccept = new JButton();
    
    
    public  JFrmMyApp() {
        initComponents();
    }
    private void initComponents(){
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        LblName.setText("Nombre:");
        
        
        TxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNameActionPerformed(evt);
            }
        });
        
        
        BtnAccept.setText("Aceptar");
        BtnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAcceptActionPerformed(evt);
            }
        });
        
    GroupLayout layout = new GroupLayout(getContentPane());
  
//se agrega esto al codigo para ordenar el gui, de alguna forma 

    getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                                    // quitamos el swing lo agregamos directo?
                                    // java.swing.windowsconstants eliminar el java swing 

            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            
                            .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(LblName)
                                .addGap(18, 18, 18)
                                .addComponent(TxtName))
                            
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(BtnAccept)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(142, 215, Short.MAX_VALUE)))
            ) );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(LblName)
                    .addComponent(TxtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
               
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAccept)
                //.addContainerGap(33, Short.MAX_VALUE)
                )
            ) );

        pack();

   }//initcomp
    private void TxtNameActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }       
    
     private void BtnAcceptActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
      
           try  {
      // create a mysql database connection
      String myDriver = "com.mysql.cj.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost:3306/practica5?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC";
      String user = "root";
      String pass = "root";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, user, pass);
    

      // the mysql insert statement
      String query = " INSERT INTO datos (nombre)"
        + " values (?)";

      // create the mysql insert preparedstatement
      
      
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString (1, this.TxtName.getText());

      // execute the preparedstatement
      preparedStmt.execute();
      
      conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
           
    }                                          

}//class

