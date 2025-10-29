package org.example;

public class Empleado {
    private String nombre;
    private String departamento;
    private double salario;
    private int edad;

    Empleado(String nombre, String departamento, double salario, int edad) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getEdad() {
        return edad;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                ", edad=" + edad +
                '}';
    }
}
