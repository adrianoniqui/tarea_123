package pe.edu.upeu.manq;

import java.util.Scanner;

import pe.edu.upeu.manq.examen.ResolucionExamen;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )

    {
        Scanner leer=new Scanner(System.in);
        int n;
        System.out.println("introduzca el numero del algoritmo:");
        n=leer.nextInt();
        switch (n) {
            case 2: new ResolucionExamen().examen02MANQ(); break;
            case 3: new ResolucionExamen().examen03MANQ(); break;
            case 4: new ResolucionExamen().examen04MANQ(); break;
            case 5: new ResolucionExamen().examen05MANQ(); break;
            
            default: System.err.println("dicha  opcion no existe :("); break;
        }
       
    }
}

   
    


