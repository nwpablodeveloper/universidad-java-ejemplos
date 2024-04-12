### Sección 26 - Programación con Java: Manejo de Enumeraciones en Java

[PDF - Enumeraciones - enum](Apuntes/02-01-Enumeraciones-CPJ.pdf)

[V106 Manejo de Enumeraciones - enum - en java](V106_Menejos_de_Enumeraciones_en_Java/src/enumeracion/Dias.java)
- Las enumeraciones son un tipo de dato que genera una lista de valores como una constante
- Los elementos de una ENUM son PUBLIC, STATIC Y FINAL
- Las enumeraciones son muy parecidas a las clases, su firma es la sig:
```java
    public enum Dias {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO
        DOMINGO; // Punto y coma en el ultimo
    }
```
- [Accediento al tipo de dato ENUM Dias](V106_Menejos_de_Enumeraciones_en_Java/src/test/TestEnumeraciones.java)

[V107 - Ejercicio: Manejo de enumeraciones en Java - Parte 2](V107_Ejercicio_Manejo_de_Enumearciones_en_Java/src/enumeracion/Continentes.java)
- En las enumeraciones tambien podemos difinir atributos

[V108 - Ejercicio: Manejo de enumeraciones en Java - Parte 3](V108_Ejercicio_Manejo_de_Enumearciones_en_Java_Parte_3/src/test/TestEnumeracionesAtributos.java)
- Acceder a una clase ENUM y a su respectivo atributo

[Volver](../)