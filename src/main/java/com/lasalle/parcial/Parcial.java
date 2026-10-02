/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.lasalle.parcial;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Parcial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Empleado por horas ---");
        System.out.print("Nombre: ");
        String nombre1 = sc.nextLine();
        System.out.print("Documento: ");
        String doc1 = sc.nextLine();
        System.out.print("Horas trabajadas: ");
        int horas = sc.nextInt();
        System.out.print("Valor por hora: ");
        double valorHora = sc.nextDouble();
        sc.nextLine(); // limpia el salto de línea

        Empleado e1 = new EmpleadoPorHoras(nombre1, doc1, horas, valorHora);

        System.out.println("--- Empleado asalariado ---");
        System.out.print("Nombre: ");
        String nombre2 = sc.nextLine();
        System.out.print("Documento: ");
        String doc2 = sc.nextLine();
        System.out.print("Salario mensual: ");
        double salario = sc.nextDouble();

        Empleado e2 = new EmpleadoAsalariado(nombre2, doc2, salario);

        System.out.println("\n" + e1 + " | Pago: " + e1.calcularPago());
        System.out.println(e2 + " | Pago: " + e2.calcularPago());

        sc.close();
    
    }
}
