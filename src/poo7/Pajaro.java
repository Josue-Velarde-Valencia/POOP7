/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo7;

/**
 *
 * @author poo08alu24
 */
public class Pajaro extends AnimalAereo {
    private String especie;

    public Pajaro() {
    }

    public Pajaro(String especie, int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void cantar() {
        System.out.println("Pio, pio");
    }

    @Override
    public void comer() {
        System.out.println("Estoy comiendo insectos y semillas");
    }

    @Override
    public String toString() {
        return "Pajaro{" + "especie=" + especie + super.toString() + '}';
    }
}

