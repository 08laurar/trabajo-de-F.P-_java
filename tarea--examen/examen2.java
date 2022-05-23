import java.util.Scanner;
public class examen2{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    //definir vareables
    double Mbase = 0, igv = 0, descuento = 0, Mtotal = 0;

    //datos de entrada..
    System.out.print("dame el precio de tu artefacto: ");
    Mbase = in.nextDouble();
    
    //estructura condicional
    if(Mbase >2000 ){
      descuento = Mbase*0.10;
      Mtotal = Mbase-descuento;
      igv = Mtotal*0.18;
      System.out.println("el descuento de tu artefacto es: "+descuento);
      System.out.println("el monto total de pagar es: "+ Mtotal);
      System.out.print("el igv es: "+igv);
    }else if(Mbase <= 2000 && Mbase>1000){
      descuento = Mbase*0.05;
      Mtotal = Mbase-descuento;
      igv = Mtotal*0.18;
      System.out.println("el descuento de tu artefacto es: "+descuento);
      System.out.println("el monto total de pagar es: "+Mtotal);
      System.out.print("el igv de tu artefacto es: "+igv);
    }else if(Mbase <=1000 && Mbase>500){
      descuento = Mbase*0.02;
      Mtotal = Mbase-descuento;
      igv = Mtotal*0.18;
      System.out.println("el descuento de tu artefacto es: "+descuento);
      System.out.println("el monto total de pagar es: "+Mtotal);
      System.out.print("el igv de tu artefacto es: "+igv);
    }else if(Mbase<=500){
      igv = Mbase*0.18;
      System.out.println("usted no cuenta con descuento, el monto a pagar es: "+Mbase);
      System.out.print("su igv del artefacto es: "+igv);
    }
  }
}