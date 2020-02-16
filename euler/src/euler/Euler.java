package euler;
import java.util.Scanner;
public class Euler {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
    int i, j;
  double euler = 0, parte1, parte2;
  
  System.out.print("El esponencial de euler es : ");
  int x =sc.nextInt();// variable del numero a calcular el exponencial
  
  System.out.print("Cuantos terminos de precision desea: ");
  int n =sc.nextInt();// numero de veces que se hara la suma
  
  for (i=0; i<=n; i++){
   
   parte1 = 1;
   for(j=0; j<i; j++){//ciclo que realiza la parte del dividendo
    parte1= parte1 * x;// la parte del dividendo se multiplicara por dato x
   }
   
   parte2 = 1;
   for(j=1; j<=i; j++){//ciclo que realiza la parte del divisor
    parte2 = parte2 * j;// se multiplicaran los numeros del factorial
   }
   
   euler = euler +(parte1 / parte2);
  }

  System.out.print("EL calculo de euler al exponente "+ x +" es: "+euler);
  
  
  
 
 }
 
}
