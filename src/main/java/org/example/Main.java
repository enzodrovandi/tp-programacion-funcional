package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== 1 ===");
        List<Alumno> alumnos = Arrays.asList(
                new Alumno("Ana", 9.5, "Java"),
                new Alumno("Luis", 6.2, "Python"),
                new Alumno("Elena", 8.1, "Java"),
                new Alumno("David", 10.0, "Java"),
                new Alumno("Carla", 5.0, "C++"),
                new Alumno("Pedro", 7.8, "Python"),
                new Alumno("Maria", 4.1, "C++"),
                new Alumno("Juan", 9.0, "Python")
        );

        List<String> aprobados = alumnos.stream()
                .filter(a -> a.getNota() >= 7)
                .map(a -> a.getNombre().toUpperCase())
                .sorted()
                .toList();
        System.out.println("1. Alumnos aprobados: "+aprobados);

        double promedio = alumnos.stream()
                .collect(Collectors.averagingDouble(Alumno::getNota));
        System.out.println("2. Alumnos promedio: "+promedio);

        Map<String, List<Alumno>> porCurso = alumnos.stream()
                .collect(Collectors.groupingBy(Alumno::getCurso));

        System.out.println("3. Alumnos por curso: ");
        porCurso.forEach((curso, lista) -> {
            System.out.println(" "+curso+ ": "+lista);
        });

        List<Alumno> top3Alumnos = alumnos.stream()
                .sorted(Comparator.comparingDouble(Alumno::getNota).reversed())
                .limit(3)
                .toList();
        System.out.println("4. Alumnos top3: "+top3Alumnos);

        System.out.println("\n=== 2 ===");
        List<Producto> productos = Arrays.asList(
                new Producto("Monitor 4K", "Electronica", 250.50, 15),
                new Producto("Teclado Mecanico", "Electronica", 85.00, 30),
                new Producto("Mouse Optico", "Electronica", 40.00, 50),
                new Producto("Silla de Oficina", "Hogar", 180.99, 10),
                new Producto("Mesa de Roble", "Hogar", 310.00, 5),
                new Producto("Cafe Colombiano", "Alimentos", 15.75, 100),
                new Producto("Leche Entera", "Alimentos", 3.20, 200)
        );

        List<Producto> productosOrdenados = productos.stream()
                .filter(p -> p.getPrecio() >= 100)
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .toList();
        System.out.println("1. Productos ordenados: "+productosOrdenados);

        Map<String, Integer> stockCategoria = productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria,
                        Collectors.summingInt(Producto::getStock)));
        System.out.println("2. Productos stock categoria: "+stockCategoria);

        String nombrePrecio = productos.stream()
                .map(p->p.getNombre() + ": " + p.getPrecio())
                .collect(Collectors.joining("; "));
        System.out.println("3. Productos precio: "+nombrePrecio);

        double promedioGeneral = productos.stream()
                .collect(Collectors.averagingDouble(Producto::getPrecio));

        Map<String, Double> promedioPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria, Collectors.averagingDouble(Producto::getPrecio)));

        System.out.println("4. Promedio general: "+promedioGeneral +
                "\nPromedio por categoria: "+promedioPorCategoria);

        System.out.println("\n=== 3 ===");

        List<Libro> libros = Arrays.asList(
                new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200, 25.50),
                new Libro("1984", "George Orwell", 328, 15.75),
                new Libro("Cien Años de Soledad", "Gabriel García Márquez", 417, 18.00),
                new Libro("El Hobbit", "J.R.R. Tolkien", 310, 14.20),
                new Libro("Ficciones", "Jorge Luis Borges", 224, 12.99),
                new Libro("Rebelión en la Granja", "George Orwell", 112, 9.99)
        );

        List<String> librosMasPaginas = libros.stream()
                .filter(l->l.getPaginas()>300)
                .map(Libro::getTitulo)
                .sorted()
                .toList();
        System.out.println("1. Titulos de libros con mas de 300 paginas: "+librosMasPaginas);

        double promedioPaginas = libros.stream()
                .collect(Collectors.averagingInt(Libro::getPaginas));
        System.out.println("2. Promedio de paginas de todos lo slibros: "+promedioPaginas);

        Map<String, Long> librosXautor = libros.stream()
                .collect(Collectors.groupingBy(Libro::getAutor, Collectors.counting()));
        System.out.println("3. Libros por autos:");
        librosXautor.forEach((a,b)->{
            System.out.println("\t-"+a+": "+b);
        });

        Optional<Libro> libroMasCaro = libros.stream()
                .max(Comparator.comparingDouble(Libro::getPrecio));
        System.out.println("4. Libro mas caro: ");
        libroMasCaro.ifPresent(System.out::println);

        System.out.println("\n=== 4 ===");
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Ana", "Ventas", 2100, 28),
                new Empleado("Luis", "TI", 3200, 41),
                new Empleado("Elena", "Ventas", 2250, 32),
                new Empleado("David", "Marketing", 1950, 25),
                new Empleado("Carla", "TI", 3500, 45),
                new Empleado("Pedro", "Marketing", 1800, 23)
        );

        List<Empleado> empleadosConMasSalario = empleados.stream()
                .filter(e -> e.getSalario()>=2000)
                .sorted(Comparator.comparingDouble(Empleado::getSalario).reversed())
                .toList();
        System.out.println("1. Lista de empleados con salarios mayor a 2000: "+empleadosConMasSalario);

        double salarioPromedio = empleados.stream()
                .collect(Collectors.averagingDouble(Empleado::getSalario));
        System.out.println("2. Salario promedio de todos los empleados: "+salarioPromedio);

        Map<String, Double> salariosXDepartamento = empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getDepartamento, Collectors.summingDouble(Empleado::getSalario)));
        System.out.println("3. Suma de salarios por departamento: ");
        salariosXDepartamento.forEach(
                (departamento,salario)->{
                    System.out.println("\t-"+departamento+": "+salario);
                }
        );

        List<String> empleadosMasJovenes = empleados.stream()
                .sorted(Comparator.comparingInt(Empleado::getEdad))
                .limit(2)
                .map(Empleado::getNombre)
                .toList();
        System.out.println("4. Los dos empleados mas jovenes: "+empleadosMasJovenes);
    }
}