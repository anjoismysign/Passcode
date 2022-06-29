package me.lbenavidesnaranjo.passcode;

import us.fiestaboleana.programacionuno.libraries.ScannerLib;

public class Passcode {

    public static void main(String[] args) {
        System.out.println("REUNIÓN CLANDESTINA");
        int passcode = ScannerLib.scanInt("Ingrese el passcode:");
        if (passcode == 2022) {
            System.out.println("Bienvenido a la fiesta boleana.");
        } else {
            System.out.println("ALERTA! INTRUSO!");
        }

    }
}
