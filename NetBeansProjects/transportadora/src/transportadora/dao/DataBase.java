/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class DataBase {
    public static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection("derby://localhost:1527/banco", "usuario", "senha");
        return conn;
    }
}
