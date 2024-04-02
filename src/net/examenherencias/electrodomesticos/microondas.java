package net.examenherencias.electrodomesticos;

import net.examenherencias.electrodomestico;

public class microondas extends electrodomestico {

    private boolean puerta;

    public microondas(String marca, String modelo, float peso, float potencia) {
        super("Lenovo", "70", 30, 5);
        this.puerta = puerta;
    }
    
    @Override 
    public boolean encendido() {
        if (estasEncendida = false ) {
            System.out.println("No");
        } else {
            System.out.println("Algo huele a quemado");
        }
        return estasEncendida;
    }

    @Override
    public String toString() {
        String mostrar = "";
        System.out.println("------------------------------------");
        mostrar += "\nTipo de electrodomestico: Microondas";
        mostrar += "\nMarca: " + super.getMarca();
        mostrar += "\nModelo: " + super.getModelo();
        mostrar += "\nPeso: " + super.getPeso();
        mostrar += "\nPotencia: " + super.getPotencia();
        mostrar += "\nPuerta: " + this.puerta;
        mostrar += "\nEsta encendido: " + encendido();
        mostrar += "\n------------------------------------";
        return mostrar;
    }
}
