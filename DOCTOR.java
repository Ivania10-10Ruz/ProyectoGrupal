/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona;

import java.util.Scanner;

/**
 *
 */
public class MAIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos para el Doctor
        System.out.println("Ingrese los datos del Doctor:");
        System.out.print("Nombre: ");
        String nombreDoctor = scanner.nextLine();

        System.out.print("Edad: ");
        int edadDoctor = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Especialidad: ");
        String especialidadDoctor = scanner.nextLine();

        DOCTOR doctor = new DOCTOR(nombreDoctor, edadDoctor, especialidadDoctor);

        // Ingresar datos para el Deportista
        System.out.println("\nIngrese los datos del Deportista:");
        System.out.print("Nombre: ");
        String nombreDeportista = scanner.nextLine();

        System.out.print("Edad: ");
        int edadDeportista = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Deporte: ");
        String deporteDeportista = scanner.nextLine();

        DEPORTISTA deportista = new DEPORTISTA(nombreDeportista, edadDeportista, deporteDeportista);

        // Mostrar información de ambos
        System.out.println("\nInformacion del Doctor:");
        doctor.mostrarInformacion();

        System.out.println("\nInformacion del Deportista:");
        deportista.mostrarInformacion();

        scanner.close();
    }
}
