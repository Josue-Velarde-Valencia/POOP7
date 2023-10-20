/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tranportes;

/**
 *
 * @author poo08alu42
 */
public class MediodeTransportes extends Object{
    private String nombre, combustible;

    public MediodeTransportes() {
    }

    public MediodeTransportes(String nombre, String combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    public void iniciarViaje(){
        System.out.println("inicia viaje");
    }
    public void finalizarViaje(){
        System.out.println("Finalizar viaje");
    }
    public void encender(String encendido){
        System.out.println("Estado: "+encendido);
    }
    public void pagar(String apagado){
        System.out.println("Estado: "+apagado);
    }

    @Override
    public String toString() {
        return "MediodeTransportes{" + "nombre=" + nombre + ", combustible=" + combustible + '}';
    }
    
}

