package Moneda1;


import java.util.Scanner;
public class AplicaLanzaMoneda {

    public AplicaLanzaMoneda() {
    }
    public static void main(String []args){
        Scanner en = new Scanner(System.in);
        System.out.println("digite la cantidad de lanzamientos");
        int numlan = en.nextInt();
        LanzaMoneda lm = new LanzaMoneda(numlan);
        lm.lanzamiento();
        lm.resultado();
    }

}
