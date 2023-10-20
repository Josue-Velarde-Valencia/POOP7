/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tranportes;

/**
 *
 * @author poo08alu42
 */
public class Trajinera extends Acuatico{
    private String nombre;
    public Trajinera() {
    }

    public Trajinera(int velocidad, String capacidad, String nombre, String combustible) {
        super(velocidad, capacidad, nombre, combustible);
    }
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void iniciarPaseo(){
        System.out.println("Iniciando paseo....");
    }

    @Override
    public String toString() {
        return "Trajinera{" + "nombre=" + nombre + '}';
    }
  
}
