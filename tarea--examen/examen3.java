import java.util.Scanner;
public class examen3{
  public static void main(String args[]){
    //declarar vareables
    double valor1 = 0, valor2 = 0, resultado = 0, raiz = 0, modulo = 0;
    String operacion = "";
    //Scanner
    Scanner in = new Scanner(System.in);
    
    //datos de entrada
    System.out.print("¿que operacion deseas realizar?");
    operacion = in.next();
    //operaciones
    if("+".equals(operacion)){
      System.out.print("dame el primer valor de tu suma: ");
      valor1 = in.nextDouble();
      System.out.print("dame el segundo valor de tu suma: ");
      valor2 = in.nextDouble();
      resultado = valor1 + valor2;      
    }else if("-".equals(operacion)){
      System.out.print("dame el primer valor de tu resta es: ");
      valor1 = in.nextDouble();
      System.out.print("dame el segundo valor de tu resta es: ");
      valor2 = in.nextDouble();
      resultado = valor1 - valor2;
      System.out.print("el resultado de tu resta es "+resultado);
      
    }else if("*".equals(operacion)){
      System.out.print("dame el primer valor de tu multiplicacion: ");
      valor1 = in.nextDouble();
      System.out.print("dame el segundo valor de tu multiplicacion: ");
      valor2 = in.nextDouble();
      resultado = valor1 * valor2;
      System.out.print("el resultado de tu multiplicacion es: "+ resultado);
      
    }else if("/".equals(operacion)){
      System.out.print("dame el primer valor de tu division: ");
      valor1 = in.nextDouble();
      System.out.print("dame el segundo valor de tu division: ");
      valor2 = in.nextDouble();
      resultado = valor1/valor2;
      System.out.print("el resultado de tu division es "+resultado);
      
    }else if("v".equals(operacion)){
      System.out.print("dame la base de tu potencia: ");
      valor1 = in.nextDouble();
      System.out.print("dame el exponente de tu potencia: ");
      valor2 = in.nextDouble();
      System.out.print("el resultado de tu potencia es "+ 
      Math.pow(valor1,valor2));
    }else if("R".equals(operacion)){
      System.out.print("dame el valor para sacarle raiz cuadrada: ");
      valor1 = in.nextDouble();
      raiz = Math.sqrt(valor1);
      System.out.print("la raiz cuadrada de "+valor1+ " es " + raiz);
    }else if("%".equals(operacion)){
      System.out.print("dame el primer valor de tu modulo: ");
      valor1 = in.nextDouble();
      System.out.print("dame el segundo valor de tu modulo: ");
      valor2 = in.nextDouble();
      resultado = valor1%valor2;
      System.out.print("el resultado de tu modulo es: "+resultado);
    }
    
  }
}