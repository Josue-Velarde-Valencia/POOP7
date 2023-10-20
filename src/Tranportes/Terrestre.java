/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tranportes;

/**
 *
 * @author poo08alu42
 */
public class Terrestre extends MediodeTransportes {
    private int velocidad;
    private String capacidad;

    public Terrestre() {
    }

    public Terrestre(int velocidad, String capacidad, String nombre, String combustible) {
        super(nombre, combustible);
        this.velocidad = velocidad;
        this.capacidad = capacidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    public void acelerar(){
        System.out.println("Acelerando..");
    }
    public void frenar(){
        System.out.println("Frenado..");
    }

    @Override
    public String toString() {
        return "Terrestre{" + "velocidad=" + velocidad + ", capacidad=" + capacidad + '}';
    }
    
}
