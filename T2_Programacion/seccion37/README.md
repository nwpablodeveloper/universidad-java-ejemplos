### Sección 37 - Programación con Java: Manejos de Interfaces

[PDF - Interfaces](Apuntes/CPJ-A-Leccion-Interfaces.pdf)

[V130 Menejo de Interfaces - Parte 1]()
- Las interfaces son parecidas a las clases Abstractas por que sus metodos
tampoco tienen un implementación por que támbien son métodos abstractos.
- Sus atributos declarados son CONSTANTES ( pubic final static )

[V131 Menejo de Interfaces - Parte 2](V131_Manejo_de_Interfaces_Parte_2/src/accesodatos/IAccesoDatos.java)
- Desde el IDE podemos crear la Interfaces. 
- Se recomienda poner una "I" al principio del nombre del archivo para identiricarla
como INTERFACE.
- Las Interfaces al no ser una clase NO hereda de la clase Object como el resto
de las clases
- Las Interfaces pueden tener Interfaces hijas
```java
    public interface IAccesoDatos {
    
    } 
```
[V132 Menejo de Interfaces - Parte 3](V132_Manejo_de_Interfaces_Parte_3/src/accesodatos)
- Implementar la [Interface](V132_Manejo_de_Interfaces_Parte_3/src/accesodatos/IAccesoDatos.java)
en una [Clase](V132_Manejo_de_Interfaces_Parte_3/src/accesodatos/ImplementacionMySql.java)
- Declarar los métodos en común con la Interface creada. Al crear una clase 
con una Interface estamos obligados a consumir todos los métodos abstractos de
la Interface, caso contrario deberiamos convertir la Clase actual en Abstracta
y eso nos impediria crear objetos en la misma y tener que recurrir a crear
clases hijas.
- [Implementar la interfaces en otra Clase](V132_Manejo_de_Interfaces_Parte_3/src/accesodatos/ImplementacionOracle.java)

[V133 Menejo de Interfaces - Parte 4](V133_Manejo_de_Interfaces_Parte_4/src)
- Cración de [variables y polimorfismo](V133_Manejo_de_Interfaces_Parte_4/src/test/TestInterfaces.java) 
de tipo Interfaces


[Volver](../)