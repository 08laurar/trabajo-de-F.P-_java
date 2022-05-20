package reforzamiento2022g1;

import java.util.Scanner;

/**
 * ejercicio2
 */

public class ejercicio2 {
      static Scanner leerT=new Scanner(System.in);
      public static void saludosegunhora() {
    // variables 
    int hora;
    String saludo="";
    //datos de  entrada
    System.out.println("ingrese la hora:");
    hora=leerT.nextInt(); 
    //proceso
    if (hora>=6 && hora<=20) {
        saludo="buenos dias ";

    } else if (hora>=13 && hora <=20) {
        saludo="buenos dias ";
    } else if ((hora>=21 && hora <=23) || (hora>=0 && hora<=5)) {
        saludo="buenos dias ";
    }else{
        saludo="esa hora no existe";
    }
    //datos de salida 
    System.out.print(saludo);
}


    public static void main(String[] args) {
        //mostrarcursodia();
        saludosegunhora();
       
    }

}    