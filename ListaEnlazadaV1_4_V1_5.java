package lista.enlazada.v1;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListaEnlazadaV1_4_V1_5 {

    static class Node {

        String name;
        Node next;
    }

    static void dump(String palabreria_, StringBuilder palabra) {

        System.out.println(palabreria_ + "");

        while (palabra != null) {
            System.out.println(palabra + " ");
            palabra = palabra.append(palabreria_);
            break;
        }
        System.out.println("");
    }

    static void dump(String msg, Node topNode) {
        System.out.print(msg + " ");

        while (topNode != null) {
            System.out.print(topNode.name + " ");
            topNode = topNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner rd = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        Node top = null;
        top = new Node();
        Node random;
        Node temp;
        StringBuilder palabreria = new StringBuilder();
        StringBuilder palabra = palabreria;

        do {

            System.out.println("\ningrese la opción requerida:\n"
                              + "1. Agregar nodo inicial\n"
                              + "2. Muestra\n"
                              + "3. Eliminar nodo incial\n"
                              + "4. Generar palabra aleatoria\n"
                              + "5. Buscar nodo\n"
                              + "6. Fin");

            switch (opt = rd.nextInt()) {

                case 1:

                        System.out.print("ingresa el contenido del nodo incial: ");
                        top.name = sc.nextLine();
                        top.next = null;

                        temp = new Node();
                        System.out.print("ingresa el contenido del nodo anterior a inicial: ");
                        temp.name = sc.nextLine();
                        temp.next = top;
                        top = temp;
                    break;

                case 2:

                    if (top == null) {
                        System.out.println("La lista se encuentra vacia");
                    } else {
                        
                        dump("Vista del nodo: ", top);
                    }
                    break;

                case 3:

                    if (top == null) {
                        System.out.println("No existen valores que borrar\n");
                    } else {
                        top = top.next;
                        dump("nodo eliminado: ", top);
                        break;
                    }

                case 4:

                     try {

                        ArrayList<String> list = new ArrayList<>();
                        int longo = 4;
                        int indice = 0;
                        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                        String caracter = "abcdefghijklmnopqrstuvwxyz"
                                        + "0123456789";
                            String raro = "#$%^&*@";
                        
                        Random rnd = new Random();
                        indice = rnd.nextInt(mayusculas.length());
                        palabreria.append(mayusculas.charAt(indice));
                        
                        for (int i = 0; i < longo; i++) {
                            indice = rnd.nextInt(caracter.length());
                            palabreria.append(caracter.charAt(indice));
                        }
                        
                        indice = rnd.nextInt(raro.length());
                        palabreria.append(raro.charAt(indice));
                        

                        dump("palabra: ", palabra);
                        dump("nodos", top);
                    } catch (Exception e) {
                    }
                    break;

                case 5:
                    //No logre implementar el método "buscar nodo" lo intente pero honestamente no
                    //consegui que se ejecutara con este programa pero con el anterior si y 
                    //ahora me suelta un error que no comprendo, espero solucionarlo
                    break;
         }
        } while (opt != 6);
    }
}
