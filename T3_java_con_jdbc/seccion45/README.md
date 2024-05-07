### Sección 45 - Java con JDBC: Introducción a JDBC

[PDF - Introducción a JDBC](Apuntes/02-01-IntroduccionJDBC-JDBC.pdf)

[V172 Introducción a JDBC]()
* Creación del proyecto con Java With Maven
* Click derecho al proyecto -> Clean and build
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
* Conectando desde el Main

[V175 Conexión desde Java con JDBC]()

[Volver](../)