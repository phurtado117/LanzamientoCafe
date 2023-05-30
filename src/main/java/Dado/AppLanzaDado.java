package Dado;

import java.util.Random;

public class AppLanzaDado {


        public static void main(String[] args) {
            Random rand = new Random();
            int[] resultados = new int[100];


            for (int i = 0; i < 100; i++) {
                resultados[i] = rand.nextInt(6) + 1;
            }


            int[] frecuencias = new int[6];
            for (int i = 0; i < 100; i++) {
                frecuencias[resultados[i] - 1]++;
            }


            System.out.println("Resultados de los 100 lanzamientos de un dado:");
            for (int i = 0; i < 100; i++) {
                System.out.print(resultados[i] + " ");
            }
            System.out.println("\n");

            System.out.println("Frecuencia de cada cara:");
            for (int i = 0; i < 6; i++) {
                System.out.println("Cara " + (i+1) + ": " + frecuencias[i]);
            }
        }
    }

