package generarpalabra;

import java.util.Random;
import java.util.Scanner;

public class Generarpalabra {

    static class Nodp {

        String palap;
        Nodp follo;

    }

    Nodp in = null;
    Nodp fin = null;

        public static void main(String[] args) {

        Generarpalabra n = new Generarpalabra();
        Scanner rd = new Scanner(System.in);
        int op;

        do {

            System.out.println
                    ( "1 Agregar\n"
                    + "2 Ordenar\n"
                    + "3 Mostrar\n"
                    + "4 Salir");

            switch (op = rd.nextInt()) {

                case 1:

                    n.Agregar();

                    break;

                case 2:

                    n.Ordenar();

                    break;

                case 3: 
                
                    n.Mostrar();

                break;
            }

        } while (op != 4);
    }
    
    public void Agregar() {

        Random r = new Random();

        for (int i=0;i<= 5;i++) {
            Nodp temp = new Nodp();
            
            
            for (int j=0;j<4;j++) {
                char l = (char) (r.nextFloat() * 25 + 97);
                temp.palap = (String)temp.palap+l;           
            }
                       
            if (in == null) {
                in = temp;
                in.follo = null;
                fin = temp;

            }else {
                fin.follo = temp;
                temp.follo = null;
                fin = temp;
            }
        }
        System.out.println("Valor agregado");
    }

    public void Ordenar() {

        if (in != null) {
            System.out.println(" Se han ordenado los datos ");

            for (int a = 0; a <= 500; a++) {
                Nodp antp = new Nodp();
                antp = in;
                Nodp actual = new Nodp();
                actual = antp.follo;

                while (antp.follo != null) {

                    if (antp.palap == actual.palap) {

                        String aux = antp.palap;
                        antp.palap = actual.palap;
                        actual.palap = aux;
                    }

                    antp = actual;
                    actual = antp.follo;
                }
            }
        }
    }

    public void Mostrar() {

        Nodp actual = new Nodp();

        actual = in;
        if (in != null) {

            while (actual != null) {
                System.out.println("" + "[" + actual.palap + "]");
                actual = actual.follo;
            }

        } else {
            System.out.println("No existen valores");
        }
    }
}
