* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona;

/**
 *
 */
public class DEPORTISTA extends PERSONA {
    private String deporte;

    // Constructor
    public DEPORTISTA (String nombre, int edad, String deporte) {
        super(nombre, edad);
        this.deporte = deporte;
    }

    // Métodos getter y setter para deporte
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    // Implementación de mostrarInformacion (polimorfismo)
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Deporte: " + deporte);
    }
}
