### Sección 38 - Programación con Java: Manejos de JavaBeans

[PDF - JavaBeans](Apuntes/CPJ-A-Leccion-JavaBeans.pdf)

[V134 Manejo de JavaBeans - Parte 1](V134_Manejo_de_JavaBeans/src/domain/Persona.java)
- Tenemos que implementar Serializable
- Debe tener 1 constructor PUBLIC vacios 
- Sus atributos tienen que ser privados
- Cada atributo tienen que tener sus respectivos Gets y Sets públicos

[V135 Manejo de JavaBeans - Parte 2](V135_Manejo_de_JavaBeans_Parte_2/src)
- Es necesario crear un objeto con el [Constructor Vacio](V135_Manejo_de_JavaBeans_Parte_2/src/test/TestJavaBeans.java).
- Al ser una clase con implementación SERIALIZABLE ya que por si alguna razon
el objeto es necesario transferirlo por la red, el servidor Java se va a 
encargara de serializarlo en 0 y 1 ( unos y ceros ) y luego el otro server Java
que lo reciba se va a encargar de Deserializarlo

[Volver](../)