### Sección 48 - Java con JDBC: Patrones de Diseño y Buenas Prácticas 

* [V190 - PDF - Capa de Datos JDBC](Apuntes/CJDBC-A-Leccion-CapaDatosJDBC.pdf)

* [V191 Ejercicio Cración Capa de Datos](V191_Ejercicio_Cracion_Capa_de_Datos/src/main/java)
    
    - Declaración de las Clases DTO ( Data Transfer Object)
        * [Clase PersonaDTO](V191_Ejercicio_Cracion_Capa_de_Datos/src/main/java/domain/PersonaDTO.java)
        * [Class UsuarioDTO](V191_Ejercicio_Cracion_Capa_de_Datos/src/main/java/domain/UsuarioDTO.java)

    - Declaración de las Interfaces - Patron DAO ( Data Access Object)
        * [Interface PersonaDAO](V191_Ejercicio_Cracion_Capa_de_Datos/src/main/java/datos/PersonaDAO.java)
        * [Interface UsuarioDAO](V191_Ejercicio_Cracion_Capa_de_Datos/src/main/java/datos/UsuarioDAO.java)

    - Declaración de las Clases DAO implementando las Interfaces DAO
        * [Class PersonaDaoJDBC](V191_Ejercicio_Cracion_Capa_de_Datos/src/main/java/datos/PersonaDaoJDBC.java)
        * [Class UsuarioDaoJDBC](V191_Ejercicio_Cracion_Capa_de_Datos/src/main/java/datos/UsuarioDaoJDBC.java)

    - Modificación del tipo de dato en la cración de la instancia del Objeto
        * [Main - TestManejoPersonas](V191_Ejercicio_Cracion_Capa_de_Datos/src/main/java/test/TestManejoPersonas.java)
        * [Main - TestManejoUsuarios](V191_Ejercicio_Cracion_Capa_de_Datos/src/main/java/test/TestManejoUsuarios.java)


[Volver](../)