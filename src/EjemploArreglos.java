import java.util.Arrays;
import java.util.Random;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "Kingston pendrive 128Gb";
        productos[1] = "Samsung Galaxy S21";
        productos[2] = "SSD Samsung externo";
        productos[3] = "Notebook Asus";
        productos[4] = "Chromecast 4ta Generación";
        productos[5] = "Parlante BT JBL";
        productos[6] = "Bateria portátil 10000mA";

        Arrays.sort(productos); // método de la clase Arrays que ordena el contenido del array

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);



        int[] numeros = new int[4];

        numeros[0] = 107;
        numeros[1] = Integer.valueOf("2579");
        numeros[2] = 388;
        numeros[3] = -65;

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
