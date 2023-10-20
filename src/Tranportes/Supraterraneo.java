/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tranportes;

/**
 *
 * @author poo08alu42
 */
public class Supraterraneo extends Terrestre {
    private String vehivulo;

    public Supraterraneo() {
    }

    public Supraterraneo(String vehivulo, int velocidad, String capacidad, String nombre, String combustible) {
        super(velocidad, capacidad, nombre, combustible);
        this.vehivulo = vehivulo;
    }

    public String getVehivulo() {
        return vehivulo;
    }

    public void setVehivulo(String vehivulo) {
        this.vehivulo = vehivulo;
    }
   
    public void verificarDisponibilidad(){
        System.out.println("Verficando Disponibilidad");
    }

    @Override
    public String toString() {
        return "Supraterraneo{" + "vehivulo=" + vehivulo + '}';
    }

    public void calcularTarifa() {
        throw new UnsupportedOperationException("Calculadno tarija..."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
