# Proyecto de Programación Funcional en Java

Este repositorio contiene la resolución de una serie de ejercicios prácticos de programación funcional utilizando Java y la API de Streams. El objetivo es aplicar los conceptos de `filter`, `map`, `reduce`, `sorted`, `collect`, entre otros, para procesar colecciones de datos de forma declarativa y eficiente.

## Organización del Proyecto

El código fuente se encuentra en la carpeta `src/main/java/org/example`. La clase `Main.java` contiene la lógica de todos los ejercicios, y las clases `Alumno.java`, `Producto.java`, `Libro.java` y `Empleado.java` definen los modelos de datos utilizados.

## Ejercicios

A continuación se describe brevemente cada uno de los ejercicios implementados:

### 1. Gestión de Alumnos
Se procesa una lista de `Alumno` para realizar las siguientes operaciones:
- Filtrar y mostrar los nombres de los alumnos aprobados (nota >= 7).
- Calcular la nota promedio de todos los alumnos.
- Agrupar a los alumnos por curso.
- Encontrar los 3 alumnos con las notas más altas.

### 2. Catálogo de Productos
Se manipula una colección de `Producto` para:
- Filtrar productos con un precio mayor a 100 y ordenarlos de mayor a menor precio.
- Calcular el stock total por categoría de producto.
- Generar una cadena de texto con el nombre y precio de cada producto.
- Calcular el precio promedio general y por categoría.

### 3. Biblioteca de Libros
Se trabaja con una lista de `Libro` para:
- Encontrar y mostrar los títulos de libros con más de 300 páginas.
- Calcular el promedio de páginas de todos los libros.
- Contar cuántos libros ha escrito cada autor.
- Encontrar el libro con el precio más alto.

### 4. Administración de Empleados
Se analiza una lista de `Empleado` para:
- Obtener una lista de empleados con salarios mayores a 2000, ordenada por salario.
- Calcular el salario promedio de todos los empleados.
- Calcular la suma de salarios por departamento.
- Encontrar los dos empleados más jóvenes de la empresa.

## Cómo Ejecutar

Para compilar y ejecutar el proyecto, siga estos pasos:

1.  **Clonar el repositorio:**
    ```sh
    git clone <URL-DEL-REPOSITORIO>
    ```

2.  **Navegar al directorio del proyecto:**
    ```sh
    cd tp-funcional
    ```

3.  **Ejecutar la aplicación con Gradle:**
    En sistemas Unix/Linux/macOS:
    ```sh
    ./gradlew run
    ```

    En Windows:
    ```sh
    gradlew.bat run
    ```

El comando `run` de Gradle compilará y ejecutará la clase `Main`, y verá la salida de todos los ejercicios en la consola.
