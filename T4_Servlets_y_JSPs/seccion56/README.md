### Sección 56 - Servlets y JSPs: Cabeceros de Respuestas con Servlets

* [V211 - PDF - Lección Cabeceros de Respuestas con Servlets](Apuntes/CJSP-A-Leccion-CabecerosRespuesta.pdf)
    - Los cabeceros de respuestas se utilizan para indicar al navegador
        como se debe comportar ante una respuesta de parte del Servidor.
        Debe informar si la respuesta es un PDF'S, Excel, Audio, Video, etc. 

    - Para indicar el tipo de respuesta se utiliza los tipos "MIME"
        (Multipupose Internet Mail Extensions)

    - Los MIMES son un conjunto de especificaciones con el objetivo de intercambiar
        archivos a través de Internet 
    ```java
        response.setHeader(String nombreCabecero, String valorCabecero);

    ```
    -Tambien podemos utilizar
        * setDataHeader
        * setIntHeader
        Estos ponen un Cabecero, si ya existe lo reemplaza

* [V212 Ejercicio Cabeceros de Respuestas con Servlets](V212_Ejercicio_Cabeceros_de_Respuesta_con_Servlets/src/main)
    - [index.html](V212_Ejercicio_Cabeceros_de_Respuesta_con_Servlets/src/main/webapp/index.html)
    - [Crear Excel](V212_Ejercicio_Cabeceros_de_Respuesta_con_Servlets/src/main/java/web/GeneracionExcelServlet.java)
    - [Mostrar Hora Actualizandose](V212_Ejercicio_Cabeceros_de_Respuesta_con_Servlets/src/main/java/web/HoraServlet.java)

[Volver](../)