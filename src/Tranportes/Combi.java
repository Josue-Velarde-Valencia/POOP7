/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tranportes;

/**
 *
 * @author poo08alu42
 */
public class Combi  extends Supraterraneo {
    private String ruta;

    public Combi() {
    }

    public Combi(String ruta, String vehivulo, int velocidad, String capacidad, String nombre, String combustible) {
        super(vehivulo, velocidad, capacidad, nombre, combustible);
        this.ruta = ruta;
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
        return "Combi{" + "ruta=" + ruta + '}';
    }
    
}
