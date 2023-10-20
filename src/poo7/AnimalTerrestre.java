/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo7;

/**
 *
 * @author poo08alu24
 */
public class AnimalTerrestre extends Animal {
    private int numeroPatas;

    public AnimalTerrestre() {
    }

    public AnimalTerrestre(int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public void caminar() {
        System.out.println("Estoy caminando en la tierra");
    }

    @Override
    public void comer() {
        System.out.println("Estoy comiendo plantas y otros alimentos terrestres");
    }

    @Override
    public String toString() {
        return "AnimalTerrestre{" + "numeroPatas=" + numeroPatas + super.toString() + '}';
    }
}
