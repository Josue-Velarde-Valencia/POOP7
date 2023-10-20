/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tranportes;

/**
 *
 * @author poo08alu42
 */
public class Subterraneo extends Terrestre  {
     private float costo;

    public Subterraneo() {
    }

    public Subterraneo(float costo, int velocidad, String capacidad, String nombre, String combustible) {
        super(velocidad, capacidad, nombre, combustible);
        this.costo = costo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    @Override
    public void iniciarViaje(){
        System.out.println("inicia viaje");
    }

    @Override
    public String toString() {
        return "Subterraneo{" + "costo=" + costo + '}';
    }
   
     
}
