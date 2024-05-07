### Sección 45 - Java con JDBC: Introducción a JDBC

[PDF - Introducción a JDBC](Apuntes/02-01-IntroduccionJDBC-JDBC.pdf)

[V172 Introducción a JDBC]()
* Creación del proyecto con Java With Maven
* Vincular la libreria de MySql
    - Proyect Files -> 
    - [pom.xml](V172_Introduccion_JDBC/pom.xml)
    - Agregar dependencias
```xml
    <dependencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.19</version>
        </dependency>
    </dependencies>
    
```
    - Click derecho al proyecto -> Clean and build

[V173 Cadena de Conexion a Mysql](V173_Cadena_de_Conexion_a_MySql/src/main/java/test/TestMySqlJDBC.java)

[V174 Conexión desde Java con JDBC]()
* [Conectando desde el Main](V174_Conexion_desde_Java_con_JDBC/src/main/java/test/TestMysqlJDBC.java)

[V175 Conexión desde Java con JDBC]()
* [Cadena de conexion, conexion y mostrar data en la consola](V175_Procesando_el_resultado_con_ResultSet/src/main/java/test/TestMySqlJDBC.java)

[Volver](../)