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
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM test.personas";
            Connection conexion = DriverManager.getConnection(url, "root", "admin");
            Statement instruccion = conexion.createStatement();
            ResultSet resultado = instruccion.executeQuery(sql);
            
            System.out.println("resultado: " + resultado);
            
            while( resultado.next() ){
                System.out.print("id: " + resultado.getInt("id_persona"));
                System.out.print(" - Nombre: " + resultado.getString("nombre"));
                System.out.print(" - Apellido: " + resultado.getString("apellido"));
                System.out.print(" - Email: " + resultado.getString("email"));
                System.out.print(" - Tel.: " + resultado.getString("telefono"));
                System.out.println("");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
                
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
