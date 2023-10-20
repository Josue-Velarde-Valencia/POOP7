/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tranportes;
/**
 *
 * @author poo08alu42
 */
public class Taxi extends Supraterraneo {
    private String tarifabase,disponible;

    public Taxi() {
    }

    public Taxi(String tarifabase, String disponible, String vehivulo, int velocidad, String capacidad, String nombre, String combustible) {
        super(vehivulo, velocidad, capacidad, nombre, combustible);
        this.tarifabase = tarifabase;
        this.disponible = disponible;
    }
    public String getTarifabase() {
        return tarifabase;
    }
    public void setTarifabase(String tarifabase) {
        this.tarifabase = tarifabase;
    }
    public String getDisponible() {
        return disponible;
    }
    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }
     @Override
    public void iniciarViaje(){
        System.out.println("inicia viaje");
    }
     @Override
    public void finalizarViaje(){
        System.out.println("Finalizar viaje");
    }
    public void consultarhorario(){
        System.out.println("Consultando horario....");
    }
    @Override
    public String toString() {
        return "Taxi{" + "tarifabase=" + tarifabase + ", disponible=" + disponible + '}';
    }
    public void consultarHorario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
