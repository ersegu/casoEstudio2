/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecp02;

import javax.swing.JOptionPane;

/**
 *
 * @author Erson Segura
 */
public class ECP02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GestionEmpleados gE1 = new GestionEmpleados();

        int indice = 0;

        do {
            indice = Integer.parseInt(JOptionPane.showInputDialog(">>>>>MENU<<<<<\n\n"
                    + "1) Agregar un nuevo empleado\n"
                    + "2) Mostrar la informacion de todos los empleados\n"
                    + "3) Buscar un empleado por nombre\n"
                    + "4) Calcular el salario promedio\n"
                    + "5) Buscar el empleado con el salario mas alto\n"
                    + "6) Buscar el empleado con el salario mas bajo\n"
                    + "0) SALIR\n\nIngrese una opcion:"));

            switch (indice) {
                case 1:
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado", "Agregar Empleado", JOptionPane.QUESTION_MESSAGE);
                    String departamento = JOptionPane.showInputDialog(null, "Ingrese el departamento del empleado", "Agregar Empleado", JOptionPane.QUESTION_MESSAGE);
                    int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del empleado", "Agregar Empleado", JOptionPane.QUESTION_MESSAGE));
                    double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado", "Agregar Empleado", JOptionPane.QUESTION_MESSAGE));
                    JOptionPane.showMessageDialog(null, gE1.AgregarEmpleado(nombre, departamento, edad, salario), "Agregar Empleado", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, gE1.MostrarInformacion(), "Informacion Empleados", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, gE1.BuscarEmpleado(JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado a buscar",
                            "Buscar Empleado", JOptionPane.QUESTION_MESSAGE)), "Buscar Empleado", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "El Salario promedio es: "+ gE1.CalcularSalarioPromedio(), "Salario Promedio", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, gE1.EmpleadoSalarioMasAlto(), "Empleado con el Salario mas alto", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, gE1.EmpleadoSalarioMasBajo(), "Empleado con el Salario mas bajo", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Fin del programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error: opcion no valida.");
                    break;
            }
        } while (indice != 0);

    }

}
