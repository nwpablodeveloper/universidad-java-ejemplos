### Sección 20 - Fundamentos Java: Uso de la palabra FINAL en Java

[PDF - Palabra Final](Apuntes/17-01-PalabraFinal-CFJ.pdf)

[V79 Uso de la palabra Final](V79_Uso_de_la_Palabra_Final/src)
- [Las Clases FINAL](V79_Uso_de_la_Palabra_Final/src/domain/claseFinal/Persona.java) no pueden tener clases hijas
- [Los Métodos FINAL](V79_Uso_de_la_Palabra_Final/src/domain/metodoFinal/Persona.java) no pueden ser sobreescritos en las clases hijas- @Override -
- [Los Atributos FINAL](V79_Uso_de_la_Palabra_Final/src/domain/metodoFinal/Persona.java) no puden modificar su valor una ves declarados (constantes)

[V80 Uso de la palabra Final con Objectos](V80_Uso_de_la_Palabra_Final/src/test/TestFinal.java)
- Los Objetos creados con FINAL no se pueden volver a asignar una nueva referencia
```java
    final Persona persona1 = new Persona();
    
    /* 
        Esto no se puede hacer
        persona1 = new Persona();
    */
```

[Volver](../)

