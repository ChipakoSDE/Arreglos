public class EjemploArreglosCombinados2 {
    public static void main(String[] args) {

        int[] a, b, c;
        a = new int[16];
        b = new int[16];
        c = new int[32];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 5;
        }
        /*
        int aux = 0;
        for (int i = 0; i < c.length/2; i+=4) {
            c[aux++] = a[i];
            c[aux++] = a[i+1];
            c[aux++] = a[i+2];
            c[aux++] = a[i+3];
            c[aux++] = b[i];
            c[aux++] = b[i+1];
            c[aux++] = b[i+2];
            c[aux++] = b[i+3];
        }
        */
        // cuando son muchos los que quiero agregar conviene anidar un for por cada array, por ejemplo

        int aux = 0;
        for (int i = 0; i < c.length/2; i+=4) {
            for (int j = 0; j < 4; j++) {
                c[aux++] = a[i + j];
            }
            for (int j = 0; j < 4; j++) {
                c[aux++] = b[i + j];
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println("c [" + i + "] = " + c[i]);
        }
    }
}
