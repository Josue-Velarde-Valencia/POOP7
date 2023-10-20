/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tranportes;
/**
 *
 * @author poo08alu42
 */
public class Helicoptero  extends Aereo {
    private int numero_de_registro;
    private String ubicacion;

    public Helicoptero() {
    }
    
    public Helicoptero(int numero_de_registro, String ubicacion, int velocidad, String capacidad, String nombre, String combustible) {
        super(velocidad, capacidad, nombre, combustible);
        this.numero_de_registro = numero_de_registro;
        this.ubicacion = ubicacion;
    }

    public int getNumero_de_registro() {
        return numero_de_registro;
    }
    public void setNumero_de_registro(int numero_de_registro) {
        this.numero_de_registro = numero_de_registro;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
     @Override
    public void despegar(){
        System.out.println("Despegando...");
    }
    @Override
    public void aterrizar(){
        System.out.println("Aterrizando...");
    }
    @Override
    public String toString() {
        return "Helicoptero{" + "numero_de_registro=" + numero_de_registro + ", ubicacion=" + ubicacion + '}';
    }
    
    
}
