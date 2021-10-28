package nodos;

import java.util.Scanner;

public class Lista {

        static class Node {
        String name;
        Node next;
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
        Scanner sc = new Scanner(System.in);
         Scanner rd = new Scanner(System.in);
         Node top = null;
         int opt = 0;

        do {
            System.out.println       
                    ("Elija la opcion requerida: \n"

                    + "1 - Agregar nodo inicial \n"
                    + "2 - Agregar nodo dettras de inicial\n"
                    + "3 - Agregar nodo adelante de inicial\n"
                    + "4 - Agregar nodo intermedio\n"
                    + "5 - Mostrar lista\n"
                    + "6 - Salir\n");

            switch (opt = sc.nextInt()) {
                
                case 1:
                    
                    top = new Node();
                    System.out.println("ingresa el contenido del nodo inicial");
                    top.name = rd.nextLine();
                    top.next = null;
                    
                    dump("Case 1", top);
                    break;
                    
                case 2:
                    
                    Node temp;
                    temp = new Node();
                    System.out.println("ingresa el contenido del nodo anterior al inicial");
                    temp.name = rd.nextLine();
                    temp.next = top;
                    top = temp;
                    dump("Case 2", top);
                    
                    break;
                    
                case 3:
                    
                    temp = new Node();
                    System.out.println("ingresa el contenido de nodo posterior al inicial");
                    temp.name = rd.nextLine();
                    temp.next = null;
                    Node temp2;
                    temp2 = top;

                    while
                    (temp2.next != null) {
                     temp2 = temp2.next;
                    }

                    temp2.next = temp;
                    dump("Case 3", top);
                    break;
                    
                case 4:
                    
                    temp = new Node();
                    System.out.println("Ingresa el contenido del nodo intermedio");
                    temp.name = rd.nextLine();
                    temp2 = top;

                   while 
                   (temp2.name.equals(top.name) == false) {
                   temp2 = temp2.next;
                   }

                   temp.next = temp2.next;
                   temp2.next = temp;
                   dump("Case 4", top);
                    break;
                    
                case 5:
                    dump("Totalidad de la lista de nodos", top);
                    
                    break;
                    
            }

        } while (opt
                != 6);

    }
    
    
}
