### Sección 36 - Programación con Java: Clases Abstractas

[PDF - Clase Abstractas](Apuntes/CPJ-A-Leccion-ClasesAbstractas.pdf)

[V128 Clases Abstractas - Parte 1]()
- Si la clase tiene 1 método abstracto entonces 
[toda la clase se tiene que marcar como Class Abstract](V128_Clases_Abstractas_Parte_1/src/domain/FiguraGeometrica.java). 
- Esto nos ayuda a que podemos declarar un Método abstracto en la clase Padre
sin tener la obligación de tener que implementar alguna función con el mismo y
asi poder ir a trabar con un Override a las clase hijas.

[V129 Clases Abstractas - Parte 2](V129_Clases_Abstractas_Parte_2/src)
- [No se pueden instanciar un objeto de una clase Abstracta](V129_Clases_Abstractas_Parte_2/src/test/TestClasesAbstractas.java)
- Solo vamos a poder trabajar con sus clases hijas
- Estamos obligados a implementar en la [clase hija](V129_Clases_Abstractas_Parte_2/src/domain/Rectangulo.java)
todos los mètodos Abstractos 
de la clase Padre

[Volver](../)
