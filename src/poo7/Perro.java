/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo7;

/**
 *
 * @author poo08alu24
 */
public class Perro extends AnimalTerrestre {
    private String raza;

    public Perro() {
    }

    public Perro(String raza, int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(numeroPatas, nombre, lugarOrigen, color);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void ladrar() {
        System.out.println("Guau, guau");
    }

    @Override
    public void comer() {
        System.out.println("Estoy comiendo comida para perros");
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + super.toString() + '}';
    }
}

