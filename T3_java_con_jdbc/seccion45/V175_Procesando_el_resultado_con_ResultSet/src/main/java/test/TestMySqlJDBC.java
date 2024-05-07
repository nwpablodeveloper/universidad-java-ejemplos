package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMySqlJDBC {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "admin");
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM test.personas";
            ResultSet resultado = instruccion.executeQuery(sql);
            System.out.println("resultado: " + resultado);
            
            while( resultado.next() ){
                System.out.println(resultado.getInt("id_persona"));
                System.out.println(resultado.getString("nombre"));
                System.out.println(resultado.getString("apellido"));
                System.out.println(resultado.getString("email"));
                System.out.println(resultado.getString("telefono"));
            }
                
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
