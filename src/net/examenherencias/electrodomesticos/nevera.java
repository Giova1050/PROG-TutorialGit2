package net.examenherencias.electrodomesticos;

import net.examenherencias.electrodomestico;

public class nevera extends electrodomestico {

    private float temperatura = 19;

    public nevera(String marca, String modelo, float peso, float potencia) {
        super("Lenovo", "69", 200, 50);
        this.temperatura = temperatura;
    }
    
    @Override 
    public boolean encendido() {
        if (estasEncendida = false ) {
            System.out.println("Esta apagado");
        } else {
            System.out.println("Ños, fuerte pelete");
        }
        return estasEncendida;
    }

    @Override
    public String toString() {
        String mostrar = "";
        System.out.println("------------------------------------");
        mostrar += "\nTipo de electrodomestico: Nevera";
        mostrar += "\nMarca: " + super.getMarca();
        mostrar += "\nModelo: " + super.getModelo();
        mostrar += "\nPeso: " + super.getPeso();
        mostrar += "\nPotencia: " + super.getPotencia();
        mostrar += "\nTemperatura: " + this.temperatura;
        mostrar += "\nEsta encendido: " + encendido();
        mostrar += "\n------------------------------------";
        return mostrar;
    }

}
