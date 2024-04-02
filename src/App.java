import net.examenherencias.calculadoras.calculadora;
import net.examenherencias.electrodomesticos.microondas;
import net.examenherencias.electrodomesticos.nevera;

public class App {
    public static void main(String[] args) throws Exception {
        calculadora mediaNotas = new calculadora(null);
        System.out.println(mediaNotas);



        nevera nevera = new nevera("Lenovo", "69", 200, 50);
        microondas microondas = new microondas("Lenovo", "70", 30, 5);

        System.out.println(nevera);
        System.out.println(microondas);
    }
}
