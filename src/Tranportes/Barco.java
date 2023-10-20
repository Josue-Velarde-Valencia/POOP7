/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tranportes;
/**
 *
 * @author poo08alu42
 */
public class Barco extends Acuatico{
    private String tripulacion, puerto_origen,puerto_destino;

    public Barco() {
    }
    public Barco(String tripulacion, String puerto_origen, String puerto_destino, int velocidad, String capacidad, String nombre, String combustible) {
        super(velocidad, capacidad, nombre, combustible);
        this.tripulacion = tripulacion;
        this.puerto_origen = puerto_origen;
        this.puerto_destino = puerto_destino;
    }
    public String getTripulacion() {
        return tripulacion;
    }
    public void setTripulacion(String tripulacion) {
        this.tripulacion = tripulacion;
    }
    public String getPuerto_origen() {
        return puerto_origen;
    }
    public void setPuerto_origen(String puerto_origen) {
        this.puerto_origen = puerto_origen;
    }
    public String getPuerto_destino() {
        return puerto_destino;
    }

    public void setPuerto_destino(String puerto_destino) {
        this.puerto_destino = puerto_destino;
    }
    public void abordarPasajeros(String pasajero){
        System.out.println("Abordando Pasajero:"+pasajero);
    }
    public void desembarcarPasajeros(String pasajero){
        System.out.println("Desembarcando Pasajero:"+pasajero);
    }
    @Override
    public String toString() {
        return "Barco{" + "tripulacion=" + tripulacion + ", puerto_origen=" + puerto_origen + ", puerto_destino=" + puerto_destino + '}';
    }
    
}
