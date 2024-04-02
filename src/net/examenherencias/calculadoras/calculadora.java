package net.examenherencias.calculadoras;

public class calculadora {

    private int[] notas;

    public calculadora(int[] notas) {
        this.notas = notas;
    }

    public static int calcularMediaNotas(int[] notas) {
        int notaInt = 0;
        int resultado = 0;
        int sumaNotas = 0;
        int mediaNotas = 0;
        for (int i = 0; i < notaInt; i++) {
            if (notas[i] != -1) {
                sumaNotas += notas[i];
                mediaNotas++;
                resultado = (sumaNotas / mediaNotas);
            }
        }
        return resultado;
    }
}
