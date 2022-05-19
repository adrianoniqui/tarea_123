package extructuraRepetitivas;
import java.util.Scanner;

public class EjercicioVarios {
  static Scanner leerT = new Scanner(System.in);

    public static long factorialN(int numero){
      long resultado =1;  
       
       if (numero>1){
            for(long i =1; i <= numero; i++){
                System.out.print("factorial de "+ i +" es: "+factorialN(i));
                resultado = resultado*i;

            }
        }
        return resultado;
    }


    public static void main(String[] args) {
        System.out.print("ingrese el numero");
        long num = leerT.nextInt();   
        for (int i =0; i<= num; i++){
            System.out.println("factorial de "+i+"es: "+factorialN(i));
        }
    }
}
