### Sección 44 - Java con JDBC: Introduccion a SQL

* [V168 Ejercicio: Instalacion de MySql 8.x](https://dev.mysql.com/downloads/mysql/)

* [V169 Ejercicio: Creación Base de Datos con MySql 8.x](V169_Creacion_Base_de_Datos)

   - [CREATE SCHEMA - Crear DB](V169_Creacion_Base_de_Datos/crear_schema.sql)

```sql
    CREATE SCHEMA nombreDb;
```

   - [CREATE TABLE - Crear tabla en la DB](V169_Creacion_Base_de_Datos/crear_tabla.sql)

    ```sql
        CREATE TABLE nombreDb.nombreTabla (
            `id_campoKey` INT NOT NULL AUTO_INCREMENT,
            `campo1` VARCHAR(45) NULL,
            `campo2` VARCHAR(45) NULL,
            `campo3` VARCHAR(45) NULL,
            `campo4` VARCHAR(45) NULL,
            PRIMARY KEY (`id_persona`));
    ```

* [V170 Sentencias DML en MySql - parte 1](V170_Sentencia_DML_en_MySql_Parte_1)
    - ( SQL ) Structured Query Language
    - ( DML ) Data Manipulation Languaje    

   * [INSERT INTO - Insertar datos en la tabla](V170_Sentencia_DML_en_MySql_Parte_1/insertar.sql)

    ```sql
        INSERT INTO nombreSchema.nombreTabla ( campo1, campo2 )
        VALUES ('contenido1', 'contenido2')
    ```

   - [SELECT * FROM - Seleccionar una tabla](V170_Sentencia_DML_en_MySql_Parte_1/seleccionar.sql)

    ```sql
        SELECT * FROM nombreSchema.tabla
    ```

* [V171 Sentencias DML en MySql - parte 2](V171_Sentencia_DML_en_MySql_Parte_2)

   - [UPDATE - Actualizar registro de la tabla](V171_Sentencia_DML_en_MySql_Parte_2/update.sql)

    ```sql
        UPDATE nombreSchem.table SET
        nombreCampo1 = 'valor 1',
        nombreCampo2 = 'valor 2',
        nombreCampo3 = 'valor 3',
    ```

   - [DELETE FROM - Eliminar tabla](V171_Sentencia_DML_en_MySql_Parte_2/eliminar.sql)

    ```sql
    DELETE FROM personas
    WHERE id_campoIdKey = 12;
    ```

[Volver](../)