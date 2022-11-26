import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int count = productos.length; // no es buena practica obtener el lenght en cada iteración del for, por eso se asocia a una var antes

        productos[0] = "Kingston pendrive 128Gb";
        productos[1] = "Samsung Galaxy S21";
        productos[2] = "SSD Samsung externo";
        productos[3] = "Notebook Asus";
        productos[4] = "Chromecast 4ta Generación";
        productos[5] = "Parlante BT JBL";
        productos[6] = "Bateria portátil 10000mA";

        Arrays.sort(productos);
        // recorremos el array con un for
        System.out.println("\n======== Recorriendo con for ========");
        for (int i = 0; i < count; i++ ){
            System.out.println("Para índice " + i + ": " + productos[i]);
        }

        // hacemos lo mismo con un for-each
        System.out.println("\n======== Recorriendo con for-each ========");
        for (String prod: productos) {
            System.out.println("Producto: " + prod);
        }

        // lo mismo con un while
        System.out.println("\n======== Recorriendo con while ========");
        int i = 0;
        while (i < count) {
            System.out.println("Producto: " + productos[i]);
            i++;
        }

        // lo mismo con do-while
        System.out.println("\n======== Recorriendo con do-while ========");
        int j = 0;
        do {
            System.out.println("Producto: " + productos[j]);
            j++;
        }
        while (j < count);
        
        int[] numeros = new int[10];
        int total = numeros.length;
        for (int k = 0; k < total; k++) {
            numeros[k] = k * 5;
            System.out.println("numeros = " + numeros[k]);
        }






    }
}
