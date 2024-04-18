### Sección 39 - Programación con Java: Manejos de Excepciones

[PDF - Excepciones](Apuntes/15-01-Excepciones-CPJ.pdf)

[V136 - Manejo de Excepciones - Parte 1](V136_Manejo_de_Excepciones_Parte_1/src/test/TestExcepciones.java)
- Manejo de errores ( Excepciones ) con [try/catch](V136_Manejo_de_Excepciones_Parte_1/src/test/TestExcepciones.java)
```java
    try{
        // Ejecución
        int res = 10 / 0;
        
        /* 
            Si hay error entra el Catch para capturar el tipo de error
            en una variable de tipo Exeption ( Clase de Java )
        */
    }catch(Exeption error){
        // Llamamos al método de la clase para que nos muestre la pila de errores
        error.printStackTrace();
        // error.printStackTrace(System.out);
    }
```

[V137 - Manejo de Excepciones - Parte 2](V137_Manejo_de_Excepciones_Parte_2/src/test/TestExcepciones.java)
- La clase Exception hereda de la clase padre de todas las Excepciones llamada
Class Throwable  ( pero no la vamos a usar )
- La Class Exception va a ser nuestra clase Padre que utilizaremos en nuestras App
- RunTimeException es una clase ( clase hija Class Exception )que nos muestra el error en tiempo de ejecución,
NO es necesario atraparla con un Try/Catch
- NullPointerException ( otra clase hija ), se va a disparar en momento de ejecución
cuando una variable quiera acceder a un atributo o método y no este apuntando a
ningun Objeto valido ( Variable Null ).

[V138 - Manejo de Excepciones - Parte 3](V138_Manejo_de_Excepciones_Parte_3/src)
- Las [clases personalizadas de Excepciones](V138_Manejo_de_Excepciones_Parte_3/src/excepciones/OperacionExcepcion.java)
 ( manejo de errores), heredan de la clase padre Exception.
- Le tenemos que  indicar al [método de nuestra Clase](V138_Manejo_de_Excepciones_Parte_3/src/aritmetica/Aritmetica.java) 
que puede devolver una posible Exception e indicar su tipo de Exception

[V139 - Manejo de Excepciones - Parte 4](V139_Manejo_de_Excepciones_Parte_4/src)
- Haciendo uso del [método con Excepcion personalizada](V139_Manejo_de_Excepciones_Parte_4/src/test/TestExcepcionAritmetica.java)

[V140 - Manejo de Excepciones - Parte 5](V140_Manejo_de_Excepciones_Parte_5/src)
- Extendemos nuestra clase con [RunTimeException](V140_Manejo_de_Excepciones_Parte_5/src/excepciones/OperacionExcepcion.java) 
y no de Exception. 
- Esto hará que en la firma del método no tengamos la obligación de espeficicar 
que puede devoler un Exception
- Usar un Try/Catch tampoco es obligatorio si declaramos nuestra clase personalizada
de Exception con implementación RunTimeException. Al no controlar la Exception
con el Try/Catch la App va a terminar de manera abrupta
- Se recomienda usar RunTimeException para que nuestro código sea mas limpio

[V141 - Manejo de Excepciones - Parte 6](V141_Manejo_de_Excepciones_Parte_6/src)
- [Try/Catch, Multiples Catchs y Finally](V141_Manejo_de_Excepciones_Parte_6/src/test/TestExcepciones.java)
El bloque de cotidogo Finally siempre se va a ejecutar al final del Try/Catch


[Volver](../)