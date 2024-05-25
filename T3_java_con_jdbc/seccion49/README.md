### Sección 49 - Java con JDBC: Manejo de Pool de Conexiones 

[V192 - PDF - Manejo de Pool de Conexiones](Apuntes/CJDBC-A-Leccion-PoolConexiones.pdf)

[V193 Ejercicio Manejo de Pool de Conexiones](V193_Ejercicio_Manejo_de_Pool_de_Conexiones/src/main/java)
    - [porm xml](V193_Ejercicio_Manejo_de_Pool_de_Conexiones/pom.xml)
        * Incorporación de la libreria de Apache commons

```xml
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-dbcp2</artifactId>
            <version>2.7.0</version>
        </dependency>
```

   - [Class Conexión](V193_Ejercicio_Manejo_de_Pool_de_Conexiones/src/main/java/datos/Conexion.java)
        * Método DataSource

[Volver](../)