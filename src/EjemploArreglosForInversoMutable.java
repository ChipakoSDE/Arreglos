import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void arregloInverso (String[] arreglo){ // método para invertir el orden de los elementos del array
        int count = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total; i++) {
            // recorro el array solo hasta la mitad e invierto el orden de los productos
            String actual = arreglo[i];
            String inverso = arreglo[count - 1 - i];
            arreglo[i] = inverso;
            arreglo[count - 1 - i] = actual;
            total--; //decremento el total después de cada iteración para llegar al punto de inflexión
        }

    }
    public static void main(String[] args) {

        String[] productos = {"Kingston pendrive 128Gb", "Samsung Galaxy S21", "SSD Samsung externo", "Notebook Asus",
                "Chromecast 4ta Generación", "Parlante BT JBL", "Bateria portátil 10000mA"};
        int count = productos.length;
        Arrays.sort(productos);

        arregloInverso(productos);
        // también puedo invertir usando el método reverse la clase de Collections de Java
        // Collections.reverse(Arrays.asList(productos)); // Collections necesita como parámetro de entrada una lista,
        // nosotros tenemos un array, entonces usamos el método asList de la clase helper Arrays
        System.out.println("\n======== Recorriendo con for el array mutado ========");
        for (int i = 0; i < count; i++) {
            System.out.println("Para índice " + i + ": " + productos[i]);

        }
    }
}
