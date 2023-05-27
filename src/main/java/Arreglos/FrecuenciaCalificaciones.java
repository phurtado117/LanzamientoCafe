package Arreglos;
import java.util.Scanner;
public class FrecuenciaCalificaciones {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] calificaciones = new int[30];
            int[] frecuencia = new int[5];

            System.out.println("Ingrese la calificación de cada uno de los 30 alumnos:");
            for (int i = 0; i < calificaciones.length; i++) {
                System.out.print("Calificación del alumno #" + (i+1) + ": ");
                int calificacion = sc.nextInt();
                calificaciones[i] = calificacion;
            }

            for (int i = 0; i < calificaciones.length; i++) {
                switch (calificaciones[i]) {
                    case 1:
                        frecuencia[0]++;
                        break;
                    case 2:
                        frecuencia[1]++;
                        break;
                    case 3:
                        frecuencia[2]++;
                        break;
                    case 4:
                        frecuencia[3]++;
                        break;
                    case 5:
                        frecuencia[4]++;
                        break;
                }
            }

            System.out.println("\nFrecuencia de calificaciones:\n");
            System.out.println("1: " + frecuencia[0] + " veces");
            System.out.println("2: " + frecuencia[1] + " veces");
            System.out.println("3: " + frecuencia[2] + " veces");
            System.out.println("4: " + frecuencia[3] + " veces");
            System.out.println("5: " + frecuencia[4] + " veces");
        }
    }




