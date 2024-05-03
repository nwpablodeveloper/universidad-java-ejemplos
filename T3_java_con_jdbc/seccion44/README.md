### Sección 43 - Programación con Java: Laboratorio Final y conclusión de la sección

[PDF - Lecciòn laboratorio - Programaciòn en Java](Apuntes/CPJ-A-Leccion-LaboratorioFinal.pdf)

[V168 Ejercicio: Instalacion de MySql 8.x](https://dev.mysql.com/downloads/mysql/)

[V169 Ejercicio: Creación Base de Datos con MySql 8.x]()
```sql
    CREATE SCHEMA nombreDb;
```

[V170 Sentencias DML en MySql - parte 1]()
( SQL ) Structured Query Language
( DML ) Data Manipulation Languaje
 
* SELECT - Selecciona registro de en una tabla
```sql
    SELECT * FROM nombreSchema.tabla
```

* INSERT - Inserta registros en la tabla
```sql
    INSERT INTO nombreSchema.tabla ( campo1, campo2 )
    VALUES ('contenido1', 'contenido2')
```

[V170 Sentencias DML en MySql - parte 1]()

* UPDATE - Actualiza el registro o dato de la tabla
```sql
    UPDATE nombreSchem.table SET
    nombreCampo1 = 'valor 1',
    nombreCampo2 = 'valor 2',
    nombreCampo3 = 'valor 3',
```

* DELETE - Elimina
```sql
DELETE FROM personas
WHERE id_campoIdKey = 12;
```

[Volver](../)