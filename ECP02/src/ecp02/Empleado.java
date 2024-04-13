/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecp02;

/**
 *
 * @author Erson Segura
 */
public class Empleado {

    private String nombre, departamento;
    private int edad;
    private double salario;

    public Empleado(String pNombre, String pDepartamento, int pEdad, double pSalario) {
        this.nombre = pNombre;
        this.departamento = pDepartamento;
        this.edad = pEdad;
        this.salario = pSalario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nDepartamento: " + departamento + "\nEdad: " + edad + "\nSalario: " + salario;
    }

}
