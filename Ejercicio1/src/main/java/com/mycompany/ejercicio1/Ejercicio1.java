/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author jeron
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        gestor viajeros;
        viajeros= new gestor(2);
        viajeros.agregarViajero(1,"44766625","Julian","Nashe");
        viajeros.agregarViajero(2,"44766621","Maruca","Pollo");
        viajeros.acumMillas("44766621",1000);
        viajeros.canjMillas("44766621",500);
        viajeros.canjMillas("44766625",500);
        viajeros.acumMillas("44766625",500);
        viajeros.mejorViajero();
    }
}
