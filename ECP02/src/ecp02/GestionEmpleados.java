/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecp02;

/**
 *
 * @author Erson Segura
 */
public class GestionEmpleados {

    private Empleado arregloEmpleados[];
    private int contadorEmpleados;

    public GestionEmpleados() {
        this.arregloEmpleados = new Empleado[5];
        this.contadorEmpleados = 0;
    }

    public String AgregarEmpleado(String pNombre, String pDepartamento, int pEdad, double pSalario) {

        Empleado nuevoEmpleado = new Empleado(pNombre, pDepartamento, pEdad, pSalario);
        boolean bandera = false;
        String mensaje = "No se pudo agregar el empleado";

        for (int i = 0; i < arregloEmpleados.length; i++) {
            if (arregloEmpleados[i] == null) {
                arregloEmpleados[i] = nuevoEmpleado;
                contadorEmpleados++;
                bandera = true;
                break;
            }
        }

        if (bandera) {
            mensaje = "Empleado agregado con exito\n";
            mensaje += "-------------------------\n";
            mensaje += nuevoEmpleado.toString();
            mensaje += "\n-------------------------\n";
        }

        return mensaje;

    }

    public String MostrarInformacion() {

        String mensaje = "Informacion de Empleados: \n";
        mensaje += "-------------------------\n";
        for (int i = 0; i < arregloEmpleados.length; i++) {
            if (arregloEmpleados[i] != null) {
                mensaje += arregloEmpleados[i].toString() + "\n";
                mensaje += "-------------------------\n";
            }
        }

        return mensaje;

    }

    public String BuscarEmpleado(String pNombre) {

        String mensaje = "Informacion del Empleado buscado: \n";
        mensaje += "-------------------------\n";

        for (int i = 0; i < arregloEmpleados.length; i++) {
            if (arregloEmpleados[i] != null) {
                if (pNombre.toLowerCase().equals(arregloEmpleados[i].getNombre().toLowerCase())) {
                    mensaje += arregloEmpleados[i].toString();
                    mensaje += "\n-------------------------\n";
                    break;
                }
            }
        }

        return mensaje;

    }

    public double CalcularSalarioPromedio() {

        double suma = 0;

        for (int i = 0; i < arregloEmpleados.length; i++) {
            if (arregloEmpleados[i] != null) {
                suma += arregloEmpleados[i].getSalario();
            }
        }

        return (suma / contadorEmpleados);

    }

    public String EmpleadoSalarioMasAlto() {

        String mensaje = "Informacion del Empleado con el Salario mas alto: \n";
        mensaje += "-------------------------\n";
        String aux = "";

        double salario = 0;

        for (int i = 0; i < arregloEmpleados.length; i++) {
            if (arregloEmpleados[i] != null) {
                if (arregloEmpleados[i].getSalario() > salario) {
                    salario = arregloEmpleados[i].getSalario();
                    aux = arregloEmpleados[i].toString();
                }
            }
        }
        mensaje += aux;
        mensaje += "\n-------------------------\n";

        return mensaje;

    }

    public String EmpleadoSalarioMasBajo() {

        String mensaje = "Informacion del Empleado con el Salario mas alto: \n";
        mensaje += "-------------------------\n";
        String aux = "";

        double salario = 0;

        for (int i = 0; i < arregloEmpleados.length; i++) {
            if (arregloEmpleados[i] != null) {
                salario = arregloEmpleados[i].getSalario();
                aux = arregloEmpleados[i].toString();
                break;
            }
        }

        for (int i = 0; i < arregloEmpleados.length; i++) {
            if (arregloEmpleados[i] != null) {
                if (arregloEmpleados[i].getSalario() < salario) {
                    salario = arregloEmpleados[i].getSalario();
                    aux = arregloEmpleados[i].toString();
                }
            }
        }
        mensaje += aux;
        mensaje += "\n-------------------------\n";

        return mensaje;

    }

}
