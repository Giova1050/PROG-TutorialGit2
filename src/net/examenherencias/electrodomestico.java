package net.examenherencias;

public class electrodomestico {
    
    private String marca;
    private String modelo; 
    private float peso;
    private float potencia;
    protected boolean estasEncendida;

    public electrodomestico(String marca, String modelo, float peso, float potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public boolean encendido() {
        if (estasEncendida = false ) {
            System.out.println("Esta apagado");
        } else {
            System.out.println("Esta encendido");
        }
        return estasEncendida;
    }
}
