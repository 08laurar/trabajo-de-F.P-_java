package estrepetitivas;

import java.util.Scanner;

/**
 * EjercicioR
 */
public class ejercicios_RR {

    public static void inprimirwhileN1_10() {
        int numInit=21;
        while(numInit<=20) {
           System.out.println(numInit);
           numInit=numInit+1;
        }

    }
    public static void inprimirDowhileN1_20() {
        int numInit=21;
        do {
            System.out.println(numInit);
            numInit++;
        } while (numInit<=20);
        
    }
    public static void inprimirForN1_20() {
        for (int numInit = 1; numInit <= 20; numInit++) {
            System.out.println(numInit);
            
        }
        
    }
    
    
    public static void nombrevertical() {
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre=lt.next();
        for (int i= 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
            
        }
        
    }
    public void nombrealovolteado() {
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese su erbmon");
        String erbmon=lt.next();
        for (int i = erbmon.length()-1; i >=0; i--){
            System.out.println(erbmon.charAt(i));
        }
        
    }

    public static void main(String[] args) {
       /*System.out.println("inprimir while"); inprimirwhileN1_10();
       System.out.println("imprimir do while");inprimirDowhileN1_20();
       System.out.println("inprimir for");inprimirForN1_20();*/

       nombrevertical();

        
    }
}