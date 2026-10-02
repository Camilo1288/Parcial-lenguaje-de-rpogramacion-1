/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.parcial;

/**
 *
 * @author Usuario
 */
public abstract class Empleado  {
    protected String nombre;
    protected String documento;

    public Empleado(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public abstract double calcularPago();

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Documento: " + documento;
    }
}
