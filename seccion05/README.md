### Sección 05 - Fundamentos Java: Operadores en Java
<img src="Apuntes/prioridad.png"
     alt="Markdown Monster icon"
     style="float: left; margin-right: 10px;" />

[V24 Ejercicio: Operadores Aritméticos en Java](V24_Ejercicio_Operadores_Aritmeticos_en_Java/src/v24_ejercicio_operadores_aritmeticos_en_java/V24_Ejercicio_Operadores_Aritmeticos_en_Java.java)
* \+ Suma
* \- Resta
* \* Mulitplicación
* \/ División
* [% Resto entero de la división " operador de modulo" Saber si un número es par](V24_Ejercicio_Operadores_Aritmeticos_en_Java/src/ejemplo/Es_Par_o_Impar.java)

[V25 Ejercicio Operadore de asignación en Java](V25_Ejercicio_Operadores_de_Asignacion_en_java/src/operadores)

El operador de asignación va a evaluar todo lo que esta a su derecha ( 
analizando de izquierda a derecha ) para luego asignarselo a su variable de 
que se va a encontrar a su Izquierda. 
Al igual que en mátemáticas primero se van a resolver las multiplicaciones
y divisiones y luego las sumas y las restas. Podemos hacer una excepción usando
parentesis.

Nota: si a la deracha del operador de igualdad lo primero que nos encontramos
es una cadena, el resto va a ser todo cadena de texto y no calculos. 

* [Operador de igualdad](V25_Ejercicio_Operadores_de_Asignacion_en_java/src/operadores/Igualdad.java)
* ( = )Operador de igualdad
* [Operador de composición](V25_Ejercicio_Operadores_de_Asignacion_en_java/src/operadores/Composicion.java)
* ( += )
* ( -= )
* ( *= )
* ( /= )
* ( %= )

[V26 Ejercicio Operadores Unarios en Java](V26_Ejercicio_Operadores_Unarios_en_Java/src/Operadores_Unarios)
* [Operador de cambio de signo](V26_Ejercicio_Operadores_Unarios_en_Java/src/Operadores_Unarios/Operador_Cambio_de_Signo.java)
* [Operador de negación](V26_Ejercicio_Operadores_Unarios_en_Java/src/Operadores_Unarios/Operador_de_Negacion.java)
* [Operador de Preincremento](V26_Ejercicio_Operadores_Unarios_en_Java/src/Operadores_Unarios/Operador_de_Preincremento.java)
* [Operador de Postincremento](V26_Ejercicio_Operadores_Unarios_en_Java/src/Operadores_Unarios/Operador_de_Postincremento.java)

[V27 Ejercicio Operadores de Igualdad y Relacionales](V27_Ejercicio_Operadores_de_Igualdad_y_Relacionales/src/Operadores)
* [Operador de igualdad y desigualdad](V27_Ejercicio_Operadores_de_Igualdad_y_Relacionales/src/Operadores/Operador_Igualdad_y_Desigualdad.java)
* ( == )
* [Operadro de Igualdad en cadenas EQUALS](V27_Ejercicio_Operadores_de_Igualdad_y_Relacionales/src/Operadores/Igualdad_cadenas_equals.java)
```Java
    var resp = cadena1.equals(cadena2);
```

[V28 Ejercicio Operadores Relacionales](V28_Ejercicio_Operadores_Ralacionales/src/V28_Ejercicio_Operadores_Ralacionales.java)
* ( > ) Mayor que...
* ( < ) Menor que...
* ( <= ) Menor o igual que...
* ( >= ) Mayor o igual que...
* [Ejercicio saber si una persona es mayor de edad](V28_Ejercicio_Operadores_Ralacionales/src/Ejercicio/Ejercicio_Edad_Persona.java)

[V29 Ejercicio Operadores Condicionales en Java](V29_Ejercicio_Operadores_Condicionales_en_Java/src/Operadores_Condicionales)
* ( && ) [AND](V29_Ejercicio_Operadores_Condicionales_en_Java/src/Operadores_Condicionales/Operador_Condicional_AND.java)
    - Las dos comparaciones se tienen que cumplir para que devuelva TRUE
* ( \|\| ) [OR](V29_Ejercicio_Operadores_Condicionales_en_Java/src/Operadores_Condicionales/Operador_Condicional_OR.java)
    - Con que se cumpla solo 1 condición devuelve TRUE

[V30 Ejercicio Operador Ternario en Java](V30_Ejercicio_Operador_Ternario/src/v30_ejercicio_operador_ternario/V30_Ejercicio_Operador_Ternario.java)
* Es recomendado usuarlo en operaciones sencillas
```java
    var resultado = ( expresión booleana ) ? "Se cumnple" : "No se cumple";
```
* [El número es par o impar?](V30_Ejercicio_Operador_Ternario/src/Ejercicio/Es_Par_o_Impar.java)

[V31 Ejercicio Precedencia de Operadores en Java](V31_Ejercicio_Precedencia_de_Operadores/src/v31_ejercicio_precedencia_de_operadores/V31_Ejercicio_Precedencia_de_Operadores.java)

[V32 TAREA 1 Calcular el area y el perimetro de un cuadrado o rectangulos](V32_Tarea_Rectangulo/src/v32_tarea_rectangulo/V32_Tarea_Rectangulo.java)
[V32 TAREA 2 Mostrar cual es el mayor de 2 numeros ingresados](V33_Tarea_El_Mayor_de_dos_numeros/src/v33_tarea_el_mayor_de_dos_numeros/V33_Tarea_El_Mayor_de_dos_numeros.java)
