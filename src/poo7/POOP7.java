/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo7;

import Tranportes.Avion;
import Tranportes.Barco;
import Tranportes.Combi;
import Tranportes.Helicoptero;
import Tranportes.MediodeTransportes;
import Tranportes.Metro;
import Tranportes.Subterraneo;
import Tranportes.Suburbano;
import Tranportes.Supraterraneo;
import Tranportes.Taxi;
import Tranportes.Trajinera;

/**
 *
 * @author poo08alu24
 */
public class POOP7 {
    
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        System.out.println("\n--------------ANIMAL--------------");
        // Crear un objeto de la clase Animal
        Animal animal = new Animal();
        animal.setNombre("Willis");
        animal.setLugarOrigen("Iztapalapa");
        animal.setColor("Gris");

        // Imprimir información del animal
        System.out.println("Informacion del animal:");
        System.out.println(animal.toString());
        System.out.println();

        // Crear un objeto de la clase AnimalAcuatico
        AnimalAcuatico animalAcuatico = new AnimalAcuatico(2, "Nemo", "Oceano", "Naranja");
        animalAcuatico.comer();

        // Imprimir información del animal acuático
        System.out.println("Informacion del animal acuatico:");
        System.out.println(animalAcuatico.toString());
        System.out.println();

        // Crear un objeto de la clase Ballena
        Ballena ballena = new Ballena(10, 2, "Willy", "Australia", "Gris");

        // Imprimir información de la ballena
        System.out.println("Informacion de la ballena:");
        System.out.println(ballena.toString());
        System.out.println();

        // Crear un objeto de la clase Perro
        Perro perro = new Perro("Labrador", 4, "Kira", "Iztapalapa", "Negro");
        perro.ladrar();

        // Imprimir información del perro
        System.out.println("Informacion del perro:");
        System.out.println(perro.toString());
        System.out.println();

        // Crear un objeto de la clase Pajaro
        Pajaro pajaro = new Pajaro("Canario", 2, "Piolin", "CDMX", "Amarillo");
        pajaro.cantar();

        // Imprimir información del pájaro
        System.out.println("Informacion del pajaro:");
        System.out.println(pajaro.toString());
        System.out.println("\n--------------TRANSPORTE--------------");
        // Crear un objeto de la clase Taxi
        Taxi taxi = new Taxi("25 USD", "Disponible", "Sedan", 80, "4 pasajeros", "Taxi1", "Gasolina");
        taxi.iniciarViaje();
        taxi.finalizarViaje();
        
        // Imprimir información del taxi
        System.out.println("Información del taxi:");
        System.out.println(taxi.toString());
        System.out.println();

        // Crear un objeto de la clase Supraterraneo
        Supraterraneo supraterraneo = new Supraterraneo("Metro", 100, "1000 pasajeros", "Línea 1", "Electricidad");
        supraterraneo.verificarDisponibilidad();
        
        // Imprimir información del transporte supraterraneo
        System.out.println("Información del transporte supraterraneo:");
        System.out.println(supraterraneo.toString());
        System.out.println();

        // Crear un objeto de la clase MediodeTransportes
        MediodeTransportes medioTransporte = new MediodeTransportes("Coche", "Gasolina");
        medioTransporte.iniciarViaje();
        medioTransporte.finalizarViaje();
        medioTransporte.encender("Encendido");
        medioTransporte.pagar("Apagado");

        // Imprimir información del medio de transporte
        System.out.println("Información del medio de transporte:");
        System.out.println(medioTransporte.toString());
        
        Combi combi = new Combi("Ruta A", "Minivan", 60, "12 pasajeros", "Combi1", "Gasolina");
        combi.iniciarViaje();
        combi.finalizarViaje();
        
        // Imprimir información de la combi
        System.out.println("Información de la combi:");
        System.out.println(combi.toString());
        // Crear un objeto de la clase Subterraneo
        Subterraneo subterraneo = new Subterraneo(3.5f, 90, "500 pasajeros", "Línea 2", "Electricidad");
        subterraneo.iniciarViaje();
        
        // Imprimir información del transporte subterráneo
        System.out.println("Información del transporte subterráneo:");
        System.out.println(subterraneo.toString());
        System.out.println();

        // Crear un objeto de la clase Suburbano
        Suburbano suburbano = new Suburbano("Horario A", "Ciudad X", 8.2f, 120, "1000 pasajeros", "Tren A", "Diesel");
        suburbano.iniciarViaje();
        suburbano.finalizarViaje();
        
        // Imprimir información del tren suburbano
        System.out.println("Información del tren suburbano:");
        System.out.println(suburbano.toString());
        System.out.println();

        // Crear un objeto de la clase Metro
        Metro metro = new Metro("Estación Y", "Ciudad Z", 2.5f, 80, "800 pasajeros", "Metro Línea 3", "Electricidad");
        metro.iniciarViaje();
        metro.abordar();
        metro.descender();
        
        // Imprimir información del metro
        System.out.println("Información del metro:");
        System.out.println(metro.toString());
        
        Barco barco = new Barco("Tripulación 1", "Puerto A", "Puerto B", 30, "100 pasajeros", "Barco 1", "Gasolina");
        barco.abordarPasajeros("Pasajero 1");
        barco.desembarcarPasajeros("Pasajero 2");
        
        // Imprimir información del barco
        System.out.println("Información del barco:");
        System.out.println(barco.toString());
        System.out.println();

        // Crear un objeto de la clase Trajinera
        Trajinera traijinera = new Trajinera(15, "20 pasajeros", "Trajinera 1", "Gasolina");
        traijinera.iniciarPaseo();
        
        // Imprimir información de la trajinera
        System.out.println("Información de la trajinera:");
        System.out.println(traijinera.toString());
        
        // Crear un objeto de la clase Avion
        Avion avion = new Avion("Aeropuerto Internacional", "Piloto 1", 700, "300 pasajeros", "Boeing 747", "Queroseno");
        avion.despegar();
        avion.aterrizar();

        // Imprimir información del avión
        System.out.println("Información del avión:");
        System.out.println(avion.toString());
        System.out.println();

        // Crear un objeto de la clase Helicoptero
        Helicoptero helicoptero = new Helicoptero(12345, "Helipuerto A", 200, "5 pasajeros", "Heli 1", "Gasolina");
        helicoptero.despegar();
        helicoptero.aterrizar();

        // Imprimir información del helicóptero
        System.out.println("Información del helicóptero:");
        System.out.println(helicoptero.toString());

    }
}

