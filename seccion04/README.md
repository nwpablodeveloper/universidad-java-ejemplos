### Sección 04 - Fundamentos Java: Tipos Primitivos
- [PDF Variables](Apuntes/01-VariablesJava.pdf)
- [img Tamaño de los datos](Apuntes/tamaños-del-tipo-de-dato.png)

[V15 Tipos Primitivos - byte](V15-Tipos-Primitivos-Byte/src/v15/tipos/primitivos/V15TiposPrimitivos.java)
### byte 
 - MIN Short: -128
 - MAX Short: 127

```java
    // Forzar un numero a ser Byta si estamos fuera de su tamaño
    byte numeroByte = (byte)128;
    // resultado: -127 generando una perdida de precisión
```

[V16 Tipos enteros Numericos](V16-Tipos-Enteros-Numericos/src/v16/tipos/enteros/numericos/V16TiposEnterosNumericos.java)
### short
 - MIN Short: -32768
 - MAX Short: 32767

```java
    // Forzar a un numero a ser short si estamos fuera de su tamaño
    short numeroShort = (short)32768
    // Resultado = -32768 generando perdida de precisión
```

### int
 - MIN int: -2147483648
 - MAX int: 2147483647

```java
    // Forzar un numero a ser de tipo int si estamos fuera de su tamaño
    int numeroInt = (int)2147483647L // Agregamos un L al final
    // Resultado = -2147483648 generando una perdida de precisión
```

### Long
 - MIN long: -9223372036854775808
 - MAX long: 9223372036854775807

```java
    // Forzar un numero a ser de tipo long si estamos fuera de su tamaño
    long numeroLong = (long)9223372036854775808L a long
    // Resultado: 9223372036854775807 generando una perdida de precisión
```