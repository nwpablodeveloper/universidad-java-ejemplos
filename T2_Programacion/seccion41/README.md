### Sección 41 - Programación con Java: Manejo de Generics

[PDF - Gnerics](Apuntes/CPJ-A-Leccion-Generics.pdf)

[V146 Menjeo de Generics - Parte 1](V146_Manejo_de_Generics_Parte_1/src/genericos/ClaseGenerica.java)
- <T> Es Representación de tipo generico para una Clase. 
- La clase representadas genericamente van a poder crear Objetos de cualquier
tipo.
```java
    public class NombreClase<T>{
        T atributo;
    }
```


[V147 Menjeo de Generics - Parte 2](V147_Manejo_de_Generics_Parte_2/src)
- Para crear un Objeto con la [clase Generica](V147_Manejo_de_Generics_Parte_2/src/genericos/ClaseGenerica.java)
 que creamos anteriormente debemos especifcar el tipo de dato Envolvente 
( en el caso para datos primitivos )
o el tipo de Object que creamos con nuestras clases.
```java
     ClaseGenerica<Integer> objeto1 = new ClaseGenerica(343443);
```
- La Clase generica va a tomar el 
[tipo de dato que definamos al momento de crear la variable](V147_Manejo_de_Generics_Parte_2/src/test/TestClaseGeneric.java)
- Podemos usar tipo de datos personalizados creados con nuestras clases

[V148 Colecciones Generics - Parte 1](V148_Colecciones_Genericas_Parte_1/src/test/TestColeccionesGenericas.java)
- Todas las API Collections soportan Tipos Genéricos
```java
    List<TIPO> variableList = new ArrayList<>();
    Set<TIPO> variableSet = new HashSet<>();
    Map<TIPO> variableMap = new HashMapt<>();
```
- Ya no es necesario realizar la conversión de datos para recuperar el valor de
sus elementos debido a que ya le indicamos el tipo de dato con el cual vamos a 
trabajar
```java
    String elemento = variableList.get(0);
```
- Imprimir List y Set

[V149 Colecciones Generics HashMaps - Parte 2](V149_Colecciones_Genericas_Parte_2/src/test/TestColeccionesGenericas.java)
- Tipo de dato Generico para HashMap().
- Se puede imprimir sin tener que realizar la conversión del Objecto
- Imprimir usando ciclos ForEach


[Volver](../)