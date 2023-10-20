/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tranportes;
/**
 *
 * @author poo08alu42
 */
public class Avion extends Aereo {
    private String aeropuerto,piloto;

    public Avion() {
    }

    public Avion(String aeropuerto, String piloto, int velocidad, String capacidad, String nombre, String combustible) {
        super(velocidad, capacidad, nombre, combustible);
        this.aeropuerto = aeropuerto;
        this.piloto = piloto;
    }

    public String getAeropuerto() {
        return aeropuerto;
    }
    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }
    public String getPiloto() {
        return piloto;
    }
    public void setPiloto(String piloto) {
        this.piloto = piloto;
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
        return "Avion{" + "aeropuerto=" + aeropuerto + ", piloto=" + piloto + '}';
    }
    

    
}
