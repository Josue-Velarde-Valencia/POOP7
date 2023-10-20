/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo7;

/**
 *
 * @author poo08alu24
 */
public class AnimalAereo extends Animal {
    private int numeroAlas;

    public AnimalAereo() {
    }

    public AnimalAereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }

    public int getNumeroAlas() {
        return numeroAlas;
    }

    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

    public void volar() {
        System.out.println("Estoy volando en el cielo");
    }

    @Override
    public void comer() {
        System.out.println("Estoy comiendo insectos y otros alimentos aéreos");
    }

    @Override
    public String toString() {
        return "AnimalAereo{" + "numeroAlas=" + numeroAlas + super.toString() + '}';
    }
}
