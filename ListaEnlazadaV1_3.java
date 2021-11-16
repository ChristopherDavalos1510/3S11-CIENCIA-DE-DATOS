package lista.enlazada.v1;

import java.util.Scanner;

public class ListaEnlazadaV1_3 {

    static class Node {

        String name;
        Node next;
   
        }
        
    static void dump(String msg, Node topNode) {
        System.out.print(msg + " ");
        while (topNode != null) 
        {
            System.out.print(topNode.name + " ");
            topNode = topNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Scanner rd = new Scanner(System.in);
         Node top = null;
         int opt = 0;
         top = new Node ();
         
        do {

            System.out.println("\ningrese la opción requerida:\n"
                              +"1. Agregar nodo inicial\n"
                              +"2. Mostrar\n" 
                              +"3. Eliminar nodo incial\n"
                              +"4. Buscar nodo\n"
                              +"5. Fin\n");

            switch (opt = rd.nextInt()) {

                case 1:

                    System.out.print("Ingresar el contenido del Nodo incial: ");
                    top.name = sc.nextLine();
                    top.next = null;
                    Node temp;

                    temp = new Node();
                    
                    System.out.print("Ingresar el contenido del Nodo anterior a inicial: ");
                    temp.name = sc.nextLine();
                    temp.next = top;
                    top = temp;
                    break;
                    
                case 2:

                    if (top == null) {

                        System.out.println("La lista esta vacia");
                    } else {
                        dump("Vista del nodo\n", top);
                    }
                    break;

                case 3:

                    if (top == null) {
                        System.out.println("No hay valores candidatos a eliminar\n");
                    } else {
                        top = top.next;
                        dump("Nodo eliminado: ", top);
                        break;
                    }
            }
        } while (opt != 5);
    }
}
