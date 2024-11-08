/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persona;

/**
 *
 */
public abstract class PERSONA {
    // Atributos protegidos (encapsulamiento)
    protected String nombre;
    protected int edad;

    // Constructor para inicializar los atributos
    public PERSONA(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método abstracto para mostrar información (abstracción y polimorfismo)
    public abstract void mostrarInformacion();
}