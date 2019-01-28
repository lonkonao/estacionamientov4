/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import baseDeDatos.Conexion;
import java.sql.SQLException;

/**
 *
 * @author giovannicaceres
 */
public class Dao {
    
    private Conexion c;
    
    
    public Dao() {

        try {
            c = new Conexion();
            c.server = "localhost";
            c.user = "root";
            c.pass = "root";
            c.bd = "jestacionamiento";

            c.conectar();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
