package Moneda1;

public class LanzaMoneda {

        int numcaras,numcruces;
        int numlanzam;
        public  LanzaMoneda(int numlan) {
            numlanzam= numlan;
            numcaras=0;
            numcruces=0;
        }
        public void lanzamiento(){

            int c=1;
            int ct=1;
            int l=0;
            for(int i=1 ; i<= numlanzam;i++)
            {
                l=  (int)(Math.random()* (2-1+1)+ 1);
                if (l==1)
                {
                    numcruces =  c;
                    c++;

                }
                if(l==2)
                {

                    numcaras = ct;
                    ct++;

                }


            }

        }
        public void resultado(){
            System.out.println("caras" +  numcaras  + "n");
            System.out.println("cruz" +  numcruces + "n");

        }

    }


