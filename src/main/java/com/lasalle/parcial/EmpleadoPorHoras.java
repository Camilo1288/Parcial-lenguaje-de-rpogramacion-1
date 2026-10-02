/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.parcial;

/**
 *
 * @author Usuario
 */
public class EmpleadoPorHoras extends Empleado {
    private int horas;
    private double valorHora;

    public EmpleadoPorHoras(String nombre, String documento, int horas, double valorHora) {
        super(nombre, documento);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPago() {
        return horas * valorHora;
    }
    
}
