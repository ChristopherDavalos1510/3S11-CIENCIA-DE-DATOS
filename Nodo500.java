package nodo500;

import java.util.Scanner;
import java.util.Random;

public class Nodo500 {
    
 Scanner sc= new Scanner (System.in); 
    
    static class Nodo { 
    String Name; 
    Nodo next; 
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in); 
        int opc;
        Nodo500 n= new Nodo500 ();
        do{ 
           
System.out.println ("\n Menu de opciones :" 
                   +"\n 1-Agregar nodo "
                   +"\n 2-Eliminar nodos"
                   +"\n 3-Mostrar lista"
                   +"\n 4-Generar palabra"
                   +"\n 5-Buscar "
                   +"\n 6-Editar Nodo"
                   +"\n 7-Elimiar especial"
                   +"\n 8-Salir");

            switch (opc = sc.nextInt()){
                
                case 1:
                    n.Agregar ();
                    break;
                    
                    
                case 2:
                    n.Eliminar ();
                    break;
                    
                    
                 case 3:
                    n.Mostrar ();
                    break;
                    
                 case 4: 
                     n.Generar (); 
                    break; 
                    
                 case 5: 
                     n.Buscar ();
                    break; 
                 
                 case 6:
                     n.EditarNodo ();
                    break; 
                 case 7:
                     n.Eliminarespecial ();
                    break; 
                
            }  
        } while (opc != 8); 
    } Nodo inicial=null; 
    
    
    public void Agregar (){ 
        if (inicial== null) {
            inicial = new Nodo ();
            System.out.println ("Ingrese: ");
            inicial.Name = sc.nextLine();
        } else {  Nodo post = new Nodo ();
                  System.out.println ("Ingrese: ");
                  post.Name = sc.nextLine();
                  post.next= inicial;
                  inicial=post;
            }
    }
     
     

    public void Mostrar(){
        Nodo post = new Nodo (); post=inicial;
        if(inicial!= null){
        while(post != null){
            System.out.print(post.Name + "  ");
            post = post.next;
        }
        } else{ System.out.println ("La lista esta vacia");}
    }
    
    

     public void Eliminar(){
        if(inicial == null){
            System.out.println ("No hay nodos que eliminar");
        } else{ System.out.print("\n Nodo eliminado");
            inicial = inicial.next;} 
    }   
    

     public void Generar(){
         char L1,L2,L3,L4,L5;
         Random r= new Random (); 
         L1 = (char)(r.nextInt(26)+'A');
         L2 = (char)(r.nextInt(74)+48);
         L3 = (char)(r.nextInt(74)+48);
         L4 = (char)(r.nextInt(74)+48);
         L5 = (char)(r.nextInt(14)+33);
        
         
         if (inicial == null) {
            inicial = new Nodo ();
            inicial.Name = (""+L1+L2+L3+L4+L5+"");
        } else {  Nodo post = new Nodo ();
                  post.Name = (""+L1+L2+L3+L4+L5+"");
                  post.next= inicial;
                  inicial=post;
            }
     }
    
    

   public void Buscar (){ 
        Nodo actual= new Nodo();
        actual=inicial;
        int cont=1;
        boolean Encontrado= false ; 
        if (inicial != null ){
        String valor;
        System.out.println("Ingrese el nodo a buscar");
        valor = sc.nextLine();
        
            while(actual != null && Encontrado != true  ){
                
                if( actual.Name.equals(valor) ) {
                   
                    System.out.println ("El dato: "+actual.Name+" encontrado en la posicion: "+ cont);
                    Encontrado= true;
                }                       
                cont ++;
                actual= actual.next;
                      
            } if (!Encontrado){
                System.out.println ("Nodo no encontrado");
            }   
        } else {
            System.out.println("Lista vacia");
        }
    }   
   
   public void EditarNodo (){ 
        Nodo post =new Nodo(); 
           post =inicial; 
           String dato; 
           if(post != null){ 
           System.out.print("Ingresa el dato de la lista que deseas modificar: ");
           dato =sc.nextLine();
           while (post != null){
               if (post.Name.equals(dato)){
                   System.out.print ("Ingrese el nuevo dato para este nodo: ");
                   post.Name = sc.nextLine ();
               }
               post=post.next;
           }
           } else {
               System.out.print ("No hay datos en la lista para editar");
           }
       } 

   public void Eliminarespecial(){ 
       boolean Encontrado= false ;
        Nodo actual =new Nodo(); 
        Nodo anterior =new Nodo(); 
        actual =inicial; 
        anterior=null;
        String dato; 
           if(inicial != null){ 
           System.out.print("Ingresa el dato de la lista que deseas eliminar: "); 
           dato =sc.nextLine(); 
           while (actual != null && Encontrado != true){ 
               if (actual.Name.equals(dato)){ 
                   if(actual == inicial){
                inicial=inicial.next;
                   }
               }
            else{
               anterior.next=actual.next; 
               }  
               {
                System.out.print("Nodo eliminadao");
                Encontrado= true;
                }
                anterior=actual;
                actual=actual.next;
   }
           if (!Encontrado){
               System.out.println("Valor no encontrado");
           }
           } else { 
               System.out.print ("No hay datos en la lista para eliminar");
           }
       }
}
