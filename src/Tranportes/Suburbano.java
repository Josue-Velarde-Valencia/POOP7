/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tranportes;
/**
 *
 * @author poo08alu42
 */
public class Suburbano extends Subterraneo {
    private String horario,ciudad;

    public Suburbano() {
    }

    public Suburbano(String horario, String ciudad, float costo, int velocidad, String capacidad, String nombre, String combustible) {
        super(costo, velocidad, capacidad, nombre, combustible);
        this.horario = horario;
        this.ciudad = ciudad;
    }

    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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
        return "Suburbano{" + "horario=" + horario + ", ciudad=" + ciudad + '}';
    }
    
    
}
