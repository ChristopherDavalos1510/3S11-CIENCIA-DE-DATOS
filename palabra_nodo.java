package palabra_nodo;

import java.util.Scanner;
import java.util.Random;

public class Palabra_nodo {
Scanner sc= new Scanner (System.in);

  public class palabra {
      char Dato1,Dato2,Dato3,Dato4, name;
      palabra Next;
  }
  palabra inicio= null;
  palabra fin = null;
  char r;
    public static void main(String[] args) {
       Scanner sc= new Scanner (System.in);
        Palabra_nodo n= new Palabra_nodo ();
        int opc;
        do {
            
            System.out.println("\n Menú de opciones:"
                    + "\n 1- LLENAR "
                    + "\n 2- MOSTRAR"
                    + "\n 3- ORDENAR "
                    + "\n 4- SALIR");
            
            switch(opc = sc.nextInt ()){
                case 1:
                    n.LLENAR();
                    break;
                case 2:
                    n.MOSTRAR();
                    break;

            }
            
        } while ( opc != 4);
    }
   public void LLENAR (){
        int cont;
        Random r= new Random ();   
        
         for (cont=1;cont<=100;cont++) {
         palabra temp =new palabra();
     
        if (inicio == null) {
         temp.Dato1 = (char)(r.nextInt(26)+'a');
         temp.Dato2 = (char)(r.nextInt(25)+'a');   
         temp.Dato3= (char)(r.nextInt(25)+'a');   
         temp.Dato4 = (char)(r.nextInt(25)+'a');
           inicio=temp;   
           inicio.Next=null;  
           fin=temp;
          
        } else {  
            
         temp.Dato1 = (char)(r.nextInt(26)+'a');
         temp.Dato2 = (char)(r.nextInt(25)+'a');  
         temp.Dato3= (char)(r.nextInt(25)+'a');  
         temp.Dato4 = (char)(r.nextInt(25)+'a');
           fin.Next=temp;
           temp.Next=null;
           fin=temp;   
        }
    }  System.out.println("LOS DATOS HAN SIDO AGREGADOS");
    }
    
    public void MOSTRAR (){
         palabra actual  =new palabra ();
        actual = inicio;
 
        
        if(inicio!= null){
        while(actual!= null){
                System.out.println(" [ "+actual.Dato1+actual.Dato2+actual.Dato3+actual.Dato4+" ] ");
                actual=actual.Next;
                //cont++;
        }
        } else {
            System.out.println (" NO HAY DATOS EN LISTA ");
        }
    }
}
