package reforzamiento2022g1;

import java.util.Scanner;

/**
 * ejercicio1
 */
public class ejercicio1 {

   public static void mostrarcursodia() {
       //definir variable
       int diasem; 
       String mensaje;
       String primeraParteM="ese dia  toca el curso de: ";
       //Leer datos
       Scanner leerT=new Scanner(System.in);
       System.out.println("ingrese un dia de la semana:\n1=Dom"+"\n2=Lun\n3=Mar\n4=mier\n5=jue\n6=vier\n7=sab");
       diasem=leerT.nextInt();
       //Proceso
       if (diasem==1) {
           mensaje=primeraParteM+"No Hay Clases";
       }else if(diasem==2) {
             mensaje=primeraParteM+"matematica";
       }else if(diasem==3) {
             mensaje=primeraParteM+"fundamentos de programacion";
       }else if(diasem==4) {
             mensaje=primeraParteM+"capacidades comonucativas"; 
       }else if (diasem==5) {
             mensaje=primeraParteM+"introduccion ala ingeneria";
       }else if (diasem==6) {
              mensaje=primeraParteM+"formacion cristiana";
       }else if (diasem==7) {
              mensaje=primeraParteM+"no hay clases"; 
            }else{
                mensaje="el dia  que  coloco no  existe";
            }
            //datos de salida
            System.out.println("ese dia toca el curso de : "+mensaje);  
                
    }         
            
              
           
       
   
   
   
   
    public static void main(String[] args) {
        mostrarcursodia();
    }
}