### Sección 04 - Fundamentos Java: Tipos Primitivos
- [PDF Variables](Apuntes/01-VariablesJava.pdf)

<img src="Apuntes/tamaños-del-tipo-de-dato.png"
     alt="Markdown Monster icon"
     style="float: left; margin-right: 10px;" />

[V15 Tipos Primitivos - byte](V15-Tipos-Primitivos-Byte/src/v15/tipos/primitivos/V15TiposPrimitivos.java)
### byte 
 - MIN Short: -128
 - MAX Short: 127

```java
    // Forzar un numero a ser Byta si estamos fuera de su tamaño
    byte numeroByte = (byte)128;
    // resultado: -127 generando una perdida de precisión
```

[V16 Tipos primitivos enteros Numericos](V16-Tipos-Enteros-Numericos/src/v16/tipos/enteros/numericos/V16TiposEnterosNumericos.java)
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

[V17 Tipos primitivos flotantes](V17_Ejercicio_Tipos_primitivos_flotantes/src/v17_ejercicio_tipos_primitivos_flotantes/V17_Ejercicio_Tipos_primitivos_flotantes.java)
* Los tipos flotantes por defecto son de tipo double y para 
corregir esto hay que indicar que su valor es de tipo FLOAT "F"
* Los tipos entereos tambien se pueden almacenar dentro de los
tipos double sin ingún problema

### float
 - MIN float: 1.4E-45
 - MAX float: 3.4028235E38

### double
 - MIN double: 4.9E-324
 - MAX double: 1.7976931348623157E308

[V18 Ejercicio: Inferencia de Tipos con Var y tipos primitivos](V18_Ejercicio_de_Tipos_con_Var_y_tipos_Primitivos/src/v18_ejercicio_de_tipos_con_var_y_tipos_primitivos/V18_Ejercicio_de_Tipos_con_Var_y_tipos_Primitivos.java)
```java
        var numeroEntero = 35;
        var numeroDouble = 10.0;
        var numeroFloat = (float)10.0F;
        var caracterChar = (char)97;
```
[V18 Practicas de Inferencias](V18_Ejercicio_de_Tipos_con_Var_y_tipos_Primitivos/src/practica/practica.java)

[V19 Ejercicio: Ejercicio: Tipos Primitivos tipo char](V19_Tipos_Primitivos_Tipo_Char/src/v19_tipos_primitivos_tipo_char/V19_Tipos_Primitivos_Tipo_Char.java)
- Las variables de tipo "char" tiene la carácteristicas de poder almacenar
solo carácter de la siguiente manera
1. Usando el simbolo dentro comillas simples '' ( ejempl 'a' )
2. Usando el codigo [Unicode](https://en.wikipedia.org/wiki/List_of_Unicode_characters)
    code, carácter, decimal
```java
    char miCaracter = 'a';
    char miCaracter = '\u0061';
    char miCaracter = 97;
```
[V20 Ejercicio: Tipos Primitivos tiopo Boolean]()
Estos datos tambien son conocidos como tipo bandera.
Son muy utilizados en los algoritmos de nuestra app
Los datos primitivos de tipo boolean solo pueden almacenar
2 valores "true" o "false"
```java
    boolean varBoolean1 = true;
    boolean varBoolean2 = false;
```