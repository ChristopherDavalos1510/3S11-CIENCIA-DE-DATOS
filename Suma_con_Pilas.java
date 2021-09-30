package EstructuraP;
import java.util.Scanner;

public class Sumas_con_Pilas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam, op, topeA=0, topeB=0, sumaC=0;
        
        System.out.print("Coloca el tamaño de tus pilas: "); 
        tam = sc.nextInt();
        
         System.out.print
                    ("\n1. Llenar la pila A y pila B\n"
                    + "2. Mostrar la pila A y pila B\n"
                    + "3. Vaciar la pila A y pila B\n"
                    + "4. Unir las pilas\n"
                    + "5. Mostrar la pila C\n"
                    + "6. Salir\n:");
        
        int[] pilaA = new int[tam]; 
        int[] pilaB = new int[tam];
        int[] pilaC = new int[tam];     
                    
        do{ 
        //Colocamos un ciclo do-while para la estructura del programa
            
            switch(op=sc.nextInt()){
                
                case 1:
                    if(topeA==0){
                        for(int i=0;i<tam;i++){
                            pilaA[i]=(int)(Math.random()*100+1);
                            topeA++;
                        }
                        System.out.println("La pila A esta siendo completada");
                    } else{
                        System.out.println("Pila A Llena"); //pila terminada 
                        break;
                    }
                    if(topeB==0){
                        for(int i=0;i<tam;i++){
                            pilaB[i]=(int)(Math.random()*100+99);
                            topeB++;
                        }
                        System.out.println("La pila B esta siendo completada");
                    } else{ 
                        System.out.println("pila B completada"); //pila terminada
                        break;
                    }
                    break;
                    
                case 2:
                    if(topeA!=0 && topeB!=0){ 
                        System.out.println("La Pila A contiene:"); 
                        for(int i=tam-1;i>=0;i--){
                            System.out.println(pilaA[i]);
                        }
                        System.out.println("\nLa Pila B contiene:"); 
                        for(int i=tam-1;i>=0;i--){
                            System.out.println(pilaB[i]);
                        }
                    } else{ 
                        System.out.println("La Pila A no tiene datos"
                                          +"\nLa Pila B no tiene datos");
                    }
                    break; 
                    
                case 3:
                    topeA=0;
                    topeB=0;   
                    //en este punto no supe realmente si los topes estan bien
                    //pero creo que el resultado si las vacia
                case 4:
                    if(topeA!=0 && topeB!=0){ 
                        //Si las pilas han terminado, sube la pila C
                        for(int i=0;i<tam;i++){
                            pilaC[i]=pilaA[sumaC-1]+pilaB[sumaC-1];
                            sumaC--;
                        } 
                    } else{ 
                        System.out.println("No existen valores para operar");
                    } 
                    break;
                    
                case 5:
                    System.out.println("La Pila C contiene:");
                    if(topeA!=0 && topeB!=0){
                        for(int i=tam-1;i>=0;i--){
                            System.out.println(pilaC[i]);
                        }
                    } else{
                        System.out.println("Lo sentimos, no se ha creado la pila C");
                    }
            
                case 6:
                    break;
            }
            
        }while(op !=6);
    }
}
