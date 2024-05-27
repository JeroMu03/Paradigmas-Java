/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.Objects;

/**
 *
 * @author jeron
 */

public class gestor {
    private int cantidad;
    private int indice;
    private viajeroFrecuente[] viajeros;
    
    public gestor(int cantidad) {
        this.cantidad = cantidad;
        this.viajeros = new viajeroFrecuente[cantidad];
        this.indice=0;
    }
    
    public void agregarViajero(Integer num,String dni,String nom,String ap){
        viajeroFrecuente viajerox;
        viajerox= new viajeroFrecuente(num,dni,nom,ap);
        if ((this.cantidad) > this.indice){
            viajeros[indice]=viajerox;
            this.indice=this.indice+1;
        }
        else{
            System.out.println("Arreglo lleno");
        }
    }
    
    public void mostrarViajero(Integer numViaj){
        Integer indice = 0;
        while(viajeros[indice].getNumero() != numViaj && indice < this.cantidad-1){
            indice=indice+1;
        }
        if (viajeros[indice].getNumero() == numViaj){
            System.out.println(viajeros[indice].toString());
        }
        else{
            System.out.println("No se encontre el viajero");
        }
    }
    
    public void cntMillas(String dni){
        Integer indice = 0;
        while(!(viajeros[indice].getDni().equals(dni)) && indice < this.cantidad-1){
            indice=indice+1;
        }
        if (viajeros[indice].getDni().equals(dni)){
            System.out.println("Cantidad de millas: "+ viajeros[indice].getMillas());
        }
        else{
            System.out.println("No se encontro un viajero con ese num de dni");
        }
    }
    
    public void acumMillas(String dni, Integer millas){
        Integer indice = 0;
        while(!(viajeros[indice].getDni().equals(dni)) && indice < this.cantidad-1){
            indice=indice+1;
        }
        if (viajeros[indice].getDni().equals(dni)){
            System.out.println("La nueva cantidad de millas es de: "+viajeros[indice].acumularMillas(millas));
        }
        else{
            System.out.println("No se encontro un viajero con ese num de dni");
        }
    }
    
    public void canjMillas(String dni, Integer millas){
        Integer indice = 0;
        while(!(viajeros[indice].getDni().equals(dni)) && indice < this.cantidad-1){
            indice=indice+1;
        }
        if (viajeros[indice].getDni().equals(dni)){
            System.out.println("La nueva cantidad de millas es de: "+viajeros[indice].canjearMillas(millas));
        }
        else{
            System.out.println("No se encontro un viajero con ese num de dni");
        }
    }
        
    public Integer maxMillas(){
        Integer cntMillaMax=0;
        for (Integer i=0;i<this.indice;i++){
            if (this.viajeros[i].getMillas() > cntMillaMax){
                cntMillaMax=this.viajeros[i].getMillas();
            }
        }
        return cntMillaMax;
    }
    
    public void mejorViajero(){
        Integer maxMillas=this.maxMillas();
        System.out.println("Mejor/es viajero/s: ");
        for (Integer i=0;i<this.indice;i++){
            if (Objects.equals(this.viajeros[i].getMillas(), maxMillas)){
                System.out.println(this.viajeros[i].toString());
            }
        }
    }
    
}
