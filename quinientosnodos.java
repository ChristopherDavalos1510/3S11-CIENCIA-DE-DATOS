 static class Nodos5 {

        int number;
        Nodos5 art;
    }

    Nodos5 in = null;
    Nodos5 fin = null;

    public static void main(String[] args) {

        Quinientosnodos n = new Quinientosnodos();

        Scanner rd = new Scanner(System.in);
        int op;

        do {

            System.out.println
                    ("\n1 Agregar\n"
                    + "2 Mostrar\n"
                    + "3 Ordenar\n"
                    + "4 Eliminar\n"
                    + "5 Agregar faltantes\n"
                    + "6 Salir\n");

            switch (op = rd.nextInt()) {
                
                default:

                case 1:

                    n.Agregar();

                    break;

                case 2:

                    n.Mostrar();

                    break;

                case 3:

                    n.Ordenar();

                    break;

                case 4:

                    n.Eliminar();

                    break;

                case 5: 

                    n.EFaltante();

                    break;
            }
          
        } while (op != 6);
    }
    
    public void Mostrar() {

        Nodos5 act = new Nodos5();

        act = in;

        if (in!= null) {

            while (act != null) {
                System.out.println("" + "[" + act.number + "]");

                act = act.art;
            }

        } else {

            System.out.println("la lista esta vacia");
        }
    }

    public void Ordenar() {

        if (in!= null) {

            System.out.println(" Datos ordenados ");

            for (int a = 0; a <= 500; a++) {

                Nodos5 anterior = new Nodos5();
                anterior = in;

                Nodos5 actual = new Nodos5();
                actual = anterior.art;

                while (anterior.art != null) {
                    if (anterior.number < actual.number) {
                        int aux = anterior.number;
                        anterior.number = actual.number;
                        actual.number = aux;
                    }

                    anterior = actual;
                    actual = anterior.art;
                }
            }
        }
    }

     public void Agregar() {

        for (int j = 0; j <= 500; j++) {

            Nodos5 tem = new Nodos5();

            tem.number = (int) (Math.random() * 500);
            if (in == null) {

                in = tem;
                in.art = null;
                fin = tem;

            } else {

                fin.art = tem;
                tem.art = null;
                fin = tem;
            }
        }
        System.out.println("valores agregados");
    }
     
    public void Eliminar() {

        System.out.println(" Datos repetidos eliminados\n");

        for (int tr=1;tr<=500;tr++) {

            Nodos5 ant = new Nodos5();
            ant = in;
            
            Nodos5 act = new Nodos5();
            act = ant.art;

            if (in!= null) {

                while (ant.art != null) {

                    if (ant.number == act.number) {
                        if (ant.art==in) {

                            act = act.art;

                        } else {
                            
                            if (act.art == null) {
                                ant.art = null;

                                } else {
                                ant.art = act.art;
                                act = act.art;
                            }
                        }
                    }

                    ant = act;
                    act = ant.art;
                }
            }
        }
    }

    public void EFaltante(){
//No logre resolver este método, tenia errores y opte por no colocarlo

    }
}
