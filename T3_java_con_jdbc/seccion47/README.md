### Sección 47 - Java con JDBC: 

* [V187 - PDF - Transacciones con JDBC](Apuntes/CJDBC-A-Leccion-TransaccionesJDBC.pdf)
 - Una transacción es un conjunto de Querys que son agrupadas en bloques 
    de ejecución

* [V188 Ejercicio: Manejo de Transacciones con JDBC](V187_Leccion_Transacciones_con_JDBC/src/main/java)
    - [PersonaDAO](V187_Leccion_Transacciones_con_JDBC/src/main/java/datos/PersonaDAO.java)
        * Declaración de conexionTransaccional en cada método
    - [TestManejoPersonas - Main](V187_Leccion_Transacciones_con_JDBC/src/main/java/test/TestManejoPersonas.java)
        * Ejecutando las query haciendo una conexión previa con
            commits

* [V189 Laboratorio: Manejo de Transacciones con JDBC](V189_Laboratorio_Manejo_de_Transacciones_con_JDBC/src/main/java)
    - [UsuarioJDB](V189_Laboratorio_Manejo_de_Transacciones_con_JDBC/src/main/java/datos/UsuarioJDBC.java) 
        * Declaración de conexionTransaccional en cada método
    - [ManejoUsuarios - Main](V189_Laboratorio_Manejo_de_Transacciones_con_JDBC/src/main/java/test/ManejoUsuarios.java)
        * Ejecutando las query haciendo una conexión previa con
            commits

[Volver](../)