### Sección 30 - Programación con Java: Modificadores de Acceso

[PDF - Modificadores de Acceso](06-01-ModificadoresAcceso-public-CFJ.pdf)
- PUBLIC es el menos restringido, se puede acceder desde cualquier paquete
- PROTECTED Pude ser accedido desde el mismo paquete o desde clases HIjas/Padres
- DEFAULT O PACKAGE puden ser utilizadas dentro del mismo paquete
- PRIVATE solo puede ser utilizado dentro de la misma Clase

[V114 Modificadores de Acceso Public](V114_Modificadores_de_Acceso_Public/src)
- El modificador de Acceso Public aplica a:
    - [Clases](V114_Modificadores_de_Acceso_Public/src/paquete1/Clase1.java) 
    - [Variables](V114_Modificadores_de_Acceso_Public/src/paquete1/Clase1.java) 
    - [Métodos](V114_Modificadores_de_Acceso_Public/src/paquete1/Clase1.java) 
    - [Constructores](V114_Modificadores_de_Acceso_Public/src/paquete1/Clase1.java) 
- Todo el contenido con modificador Public puede tener acceso desde cualquier [otro
paquete](V114_Modificadores_de_Acceso_Public/src/test/TestModificadoresAccesosPublic.java)

[V115 Modificadores de Acceso Protected](V115_Modificadores_de_Acceso_protected/src)
- Los elementos protected pueden ser utilizados desde otras Clases [hijas/padres](V115_Modificadores_de_Acceso_protected/src/paquete2/ClaseHija.java)
- El modificador Protected no aplica para clases
- Podemos acceder a los elementos Protected que estan dentro del mismo Paquete.
    Ej. Un constructor protected pude ser accedido desde otra clase pero dentro
    del [mismo paquete](V115_Modificadores_de_Acceso_protected/src/paquete1/TestModificadorProtected.java).

[V116 Modificadores de Acceso Default o Package](V116_Modificadroes_de_Acceso_Default_o_Package/src)
- Dafault o package es ausencia del modificador
- En Clases Default las mismas pueden utilizarse únicamente dentro del [mismo
paquete](V116_Modificadroes_de_Acceso_Default_o_Package/src/paquete1)

[V117 Modificadores de Acceso Private](V117_Modificadroes_de_Acceso_Private/src/paquete1)
- PRIVATE Class - No aplica al nivel de Class
- [private atributo](V117_Modificadroes_de_Acceso_Private/src/paquete1/ClasePrivate.java) - Solo pueden ser accedidos desde la misma clase
- [private constructor](V117_Modificadroes_de_Acceso_Private/src/paquete1/ClasePrivate.java) - Solo pueden ser accedidos desde la misma clase
    - Se va a necesitar de un 2do constructor publico que reciba como minimo
    1 argumento
- private metodo - Solo pueden ser accedidos desde la misma clase
- Podemos modifcar el contenido de los atributos por medios de [Setters públicos](V117_Modificadroes_de_Acceso_Private/src/paquete1/TestModificadorProtected.java)



[Volver](../)