/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejozepol.BasesDatos;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alejozepol
 */
public class BasesDatos {

    private final String URL        ="jdbc:mysql://localhost:3306/";
    private final String BD         ="vehiculos";
    private final String Usuario    ="root";
    private final String Contraseña ="";

    public Connection conexion = null;

    public Connection conectar() throws SQLException {
        try {
             Class.forName("com.mysql.jdbc.Driver");
             conexion = (Connection) DriverManager.getConnection(URL+BD,Usuario,Contraseña);
             
             if (conexion !=null){
                 System.err.println("La conexion se ejecuto exitosamente");
             }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return conexion;
        }

    }

}
