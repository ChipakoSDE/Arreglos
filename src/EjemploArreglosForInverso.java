import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        String[] productos = {"Kingston pendrive 128Gb", "Samsung Galaxy S21", "SSD Samsung externo", "Notebook Asus",
                              "Chromecast 4ta Generación", "Parlante BT JBL", "Bateria portátil 10000mA"};
        int count = productos.length;

        /*
        productos[0] = "Kingston pendrive 128Gb";
        productos[1] = "Samsung Galaxy S21";
        productos[2] = "SSD Samsung externo";
        productos[3] = "Notebook Asus";
        productos[4] = "Chromecast 4ta Generación";
        productos[5] = "Parlante BT JBL";
        productos[6] = "Bateria portátil 10000mA";
        */
        Arrays.sort(productos);

        System.out.println("\n======== Recorriendo con for ========");
        for (int i = 0; i < count; i++ ){
            System.out.println("Para índice " + i + ": " + productos[i]);
        }

        System.out.println("\n======== Recorriendo en orden inverso ========");
        for (int i = 0; i < count; i++ ){
            System.out.println("Para índice " + (count-1-i) + ": " + productos[count-1-i]);
        }

        System.out.println("\n======== Recorriendo en orden inverso de otra manera ========");
        for (int i = count - 1; i >= 0 ; i-- ){
            System.out.println("Para índice " + i + ": " + productos[i]);
        }

    }
}
