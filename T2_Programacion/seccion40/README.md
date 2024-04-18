### Sección 40 - Programación con Java: API de Collections

[PDF - Colecciones](Apuntes/16-01-Colecciones-CPJ.pdf)

[V142 Lección: API de Collections - Parte 1](Apuntes/16-01-Colecciones-CPJ.pdf)
- Toas las colecciones heredan de la Class Collection de Java.util
- Colecciones [List](V143_API_de_Collections_Parte_2/src/test/TestColecciones.java)
    - ArrayList()
    - Vector
- Colecciones [Set](V144_Set/src/test/TestSet.java)
    - HashSet()
- Colecciones [Map](V145_Map/src/test/TestMap.java)
    - HashMap()

[V143 Lección: API de Collections - Parte 2](V143_API_de_Collections_Parte_2/src/test/TestColecciones.java)
- [Tipo List](V143_API_de_Collections_Parte_2/src/test/TestColecciones.java)
    - El Objeto ArrayList() funciona muy paracido a un Array pero la diferencia
està en que lo podemos cargar de forma dinámica, la misma mantiene el orden
en el que el mismo fue cargado
- Se pueden duplicar elementos
- Función flecha
```java

    import java.util.ArrayList;
    import java.util.List;

    List miLista = new ArrayList();
```
[V144 Set](V144_Set/src/test/TestSet.java)
- [Tipo Set / HashSet](V144_Set/src/test/TestSet.java)
    - El Objeto HashSet() funciona como una lista que podemos cargar
de forma dinámica, pero la misma NO mantiene el orden en la que fue cargada y
su funcionalidad es más rapida. 
- No admite elementos duplicados
- Función flecha
```java

    import java.util.HashSet;
    import java.util.Set;

    Set miSet = new HashSet();
```

[V145 Map](V145_Map/src/test/TestMap.java)
- Trabaja con el Objeto HashMap();
- Un mapa es una colección de elementos almacenados con una llave/valor.
- No herada de Collection, herada de la interface Map
- No mantienen el orden
```java
    import java.util.HashMap;
    import java.util.Map;

    Map miMap = new HashMap();
    miMap.put(key, value);
```
[Volver](../)