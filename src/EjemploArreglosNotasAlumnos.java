import java.util.Scanner;

public class EjemploArreglosNotasAlumnos {
    public static void main(String[] args) {
        double[] claseMatematicas, claseHistoria, claseLengua;
        double sumaNotasMatematicas = 0, sumaNotasHistoria = 0, sumaNotasLengua = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLengua = new double[7];
        int cantNotas = claseMatematicas.length;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese las 7 notas de Matemáticas:");
        for (int i = 0; i < cantNotas; i++) {
            claseMatematicas[i] = s.nextDouble();
            sumaNotasMatematicas += claseMatematicas[i];
        }
        System.out.println("Ingrese las 7 notas de Historia:");
        for (int i = 0; i < cantNotas; i++) {
            claseHistoria[i] = s.nextDouble();
            sumaNotasHistoria += claseHistoria[i];
        }
        System.out.println("Ingrese las 7 notas de Lengua:");
        for (int i = 0; i < cantNotas; i++) {
            claseLengua[i] = s.nextDouble();
            sumaNotasLengua += claseLengua[i];
        }
        double promedioMatematicas = sumaNotasMatematicas/cantNotas;
        double promedioHistoria = sumaNotasHistoria/cantNotas;
        double promedioLengua = sumaNotasLengua/cantNotas;
        System.out.println("Promedio de los alumnos en Matemáticas = " + promedioMatematicas);
        System.out.println("Promedio de los alumnos en Historia = " + promedioHistoria);
        System.out.println("Promedio de los alumnos en Lengua = " + promedioLengua);
        System.out.println("Promedio de los alumnos en todas las materias = " + (promedioMatematicas+promedioHistoria+promedioLengua)/3);

        System.out.println("Ingrese el número de alumno (de 0 a 6) del que quiere conocer las notas y el promedio general");
        int alumno = s.nextInt();

        System.out.println("La nota del alumno en Matemáticas es = " + claseMatematicas[alumno]);
        System.out.println("La nota del alumno en Historia es = " + claseHistoria[alumno]);
        System.out.println("La nota del alumno en Lengua es = " + claseLengua[alumno]);
        double promedioAlumno = (claseMatematicas[alumno] + claseHistoria[alumno] + claseLengua[alumno])/3;
        System.out.println("El promedio general del alumno es = " + promedioAlumno);
    }
}
