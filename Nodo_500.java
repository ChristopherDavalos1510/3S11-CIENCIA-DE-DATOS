package nodo_500;

import java.util.Scanner;

public class Nodo_500 {

    Scanner sc = new Scanner(System.in);

    static class Nodo {

        int num;
        Nodo sig;
        Nodo ant;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc;
        Nodo_500 n = new Nodo_500();

        do {

            System.out.println("\n Menu de opciones ingrese una opción :"
                    + "\n 1-Generar 500 Nodos "
                    + "\n 2-Mostrar los 500 Nodos"
                    + "\n 3-Ordenar de Mayor-Menor"
                    + "\n 4-Ordenar de Menor-Mayor"
                    + "\n 5-Eliminar repetidos"
                    + "\n 6-Agregar faltantes"
                    + "\n 7-Salir ");

            switch (opc = sc.nextInt()) {

                case 1:
                    n.Agregar();
                    break;

                case 2:
                    n.Mostrar(); 
                    break;

                case 3:
                    n.MayMen();
                    break;

                case 4:
                    n.MenMay();
                    break;

                case 5:
                    n.Repetidos();
                    break;

                case 6:
                    n.Faltantes();
                    break;

            }
        } while (opc != 7);
    }

    Nodo inicio = null;
    Nodo fin = null;

    public void Agregar() {
        for (int k = 0; k <= 499; k++) {
            Nodo poc = new Nodo();

            poc.num = (int) (Math.random() * 500);

            if (inicio == null) {

                inicio = poc;
                inicio.sig = null;
                fin = poc;

            } else {

                fin.sig = poc;
                poc.sig = null;
                fin = poc;

            }

        }
        System.out.println("valores agregados");
    }

    public void Mostrar() {
        Nodo actual = new Nodo();
        actual = inicio;

        if (inicio != null) {

            while (actual != null) {
                System.out.println("" + "[ " + actual.num + " ]");

                actual = actual.sig;
            }

        } else {

            System.out.println("la lista esta vacia");

        }
    }

    public void MayMen() {
        Nodo actual = new Nodo();
        actual = inicio;
       Nodo aux;
        for (int i = 0; i < (499 - 1); i++) {
            for (int j = 0; j < (actual.num - 1); j++) {
                if (actual.num > actual.sig) {

                }
            }
        }

    }

    public void MenMay() {

    }

    public void Repetidos() {
        Nodo t1, t2;

        t1 = inicio;

        while (t1 != null) {
            t2 = t1.sig;
            while (t2 != null) {
                if (t1.num == t2.num) {
                    if (t2 == fin) {
                        fin = t2.ant;
                        fin.sig = null;
                    } else {
                        (t2.sig).sig = t2.sig;
                        (t2.sig).ant = t2.ant;

                    }
                }
                t2 = t2.sig;
            }
            t1 = t1.sig;
        }
        System.out.println("Valores repetidos eliminados");
    }

    public void Faltantes() {

    }

}
