### Sección 15 - Fundamentos Java: Encapsulamiento en Java

[PDF - Contexto Estático](Apuntes/13-01-ContextoEstatico-CFJ.pdf)

[V67 Lección Contexto Estático en Java](V67_Leccion_Contexto_Estatico_en_Java/src/domain/Persona.java)
- El atributo estático va a compartir su valor con todos los objectos que se
   creen con la misma clase que lo contenga

[V68 Ejercicio Contexto Estático en Java](V68_Ejercicio_Contexto_Estatico_en_Java_/src)
- [Creación de varios objectos](V68_Ejercicio_Contexto_Estatico_en_Java_/src/test/PersonaPrueba.java)
- Funcionamiento del modificador Static en ejecución. El mimso va a amantener
su valor en cada objeto creado. Comparte entre los objetos la misma info.

[V69 Ejercicio Contexto Estático en Java](V69_Ejercicio_Contexto_Estatico_en_Java/src)
- Los [Métodos STATIC](V69_Ejercicio_Contexto_Estatico_en_Java/src/test/PersonaPrueba.java) 
 solo pueden llamar a otro método que tambien tenga el modificador
Static. Tampoco podemos utilizar la palabra this dentro de un método STATIC

[Volver](../)