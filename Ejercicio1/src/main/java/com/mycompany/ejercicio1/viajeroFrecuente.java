/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author jeron
 */
public class viajeroFrecuente {
    private Integer numero;
    private String dni;
    private String nombre;
    private String apellido;
    private Integer millas;

    public viajeroFrecuente(Integer numero, String dni, String nombre, String apellido) {
        this.numero = numero;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.millas = 0;
    }
    
    public Integer getNumero() {
        return numero;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getMillas() {
        return millas;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMillas(Integer millas) {
        this.millas = millas;
    }
    
    public Integer acumularMillas(Integer nvmillas) {
        this.millas= this.millas+nvmillas;
        return this.millas;
    }
    
    public Integer canjearMillas(Integer millasc) {
        if (this.millas>=millasc){
            this.millas=this.millas-millasc;
        }
        else{
            System.out.println("Millas insuficientes para realizar la operacion");
        }
        return this.millas;
    }
    
        @Override
    public String toString(){
        return "Nombre: "+this.nombre+" ; "+"Apellido: "+this.apellido+" ; "+"DNI: "+this.dni+" ; "+"Millas:"+this.millas+".";
    }
    
}


