package tareaMANQ;

import java.util.Scanner;

public class TAREA4 {
    
    Scanner ll = new Scanner(System.in);
    public void tarea05() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = ll.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = ll.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c <= f; c++) {
                matriz[f][(dimension - 1) - c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void tarea06()  {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = ll.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = ll.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c <= f; c++) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void tarea07()  {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = ll.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = ll.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c <= (matriz.length - 1) - f; c++) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void tarea09()  {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = ll.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = ll.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = (matriz[0].length - 1) - f; c <= matriz[0].length - 1; c++) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void tarea010() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = ll.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = ll.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][i - j] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void tarea011() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = ll.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = ll.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = (matriz.length - 1) - f; c >= 0; c--) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void tarea012() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = ll.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = ll.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = matriz[f].length-1; c >= f; c--) {
                matriz[f][c] = String.valueOf(valor);                 valor++;        
            }          
        }
        imprimirMatriz(matriz);
    }
    public void tarea018() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = ll.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = ll.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c <= f; c++) {
                matriz[c][(dimension - 1) - f] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void tarea020() {

        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = ll.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = ll.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = (matriz[0].length - 1); f >= 0; f--) {
            for (int c = matriz[f].length-1; c >= f; c--) {
                matriz[c][f] = String.valueOf(valor); 
                valor++;        
            }          
        }
        imprimirMatriz(matriz);
    }
    public void tarea022() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = ll.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = ll.nextInt();
        matriz = new String[dimension][dimension];
        for (int c = 0; c < matriz[0].length; c++) {
            if (c % 2 == 0) {
                for (int f = matriz.length - 1; f >= 0; f--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int f = 0; f < matriz.length; f++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }
    public void tarea023() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = ll.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = ll.nextInt();
        matriz = new String[dimension][dimension];
        for (int c = (matriz[0].length - 1); c >= 0; c--) {
            if (c % 2 == 0) {
                for (int f = 0; f < matriz.length; f++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int f = matriz.length - 1; f >= 0; f--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }
    public void tarea024() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = ll.nextInt();
        System.out.println("Ingrese el valor inicial");
        int valor = ll.nextInt();
        matriz = new String[dimension][dimension];
        for (int columna = matriz[0].length - 1; columna >= 0; columna--) {
            if (columna%2== 0) {
                for (int fila = matriz.length - 1; fila >= 0; fila--) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor = valor+1;
                }
            } else {
                for (int fila = 0; fila < matriz.length; fila++) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor = valor+1;
                }
            }

        }
        imprimirMatriz(matriz);
    }
    public void tarea025() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = ll.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor = ll.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            if (f % 2 == 0) {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int c = matriz.length - 1; c >= 0; c--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }
    public void tarea026() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la  Matriz:");
        int dimension = ll.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor = ll.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            if (f % 2 == 0) {
                for (int c = matriz.length - 1; c >= 0; c--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
}
            }

        }
        imprimirMatriz(matriz);
    }
    public void tarea027() {
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = ll.nextInt();
        System.out.println("Ingrese el valor inicial");
        int valor =0;
        String[][] matriz = new String[dimension][dimension];
        for (int fila =matriz.length - 1; fila >= 0; fila--) {
            if (fila % 2 == 0) {
                for (int columna = matriz.length - 1; columna >= 0; columna--) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor=valor+1;
                }
            } else {
                for (int columna = 0; columna < matriz.length; columna++) {
                    matriz[fila][columna] =String.valueOf(valor);
                    valor=valor+1;
                }
            }
        }
        imprimirMatriz(matriz);
    }
    public void tarea028() {
            System.out.println("Ingrese dimesion de Matriz:");
            int dimension = ll.nextInt();
            System.out.println("Ingrese valor inicial:");
            int valor = ll.nextInt();
            String[][] matriz = new String[dimension][dimension];
            for (int f = (matriz.length - 1); f >= 0; f--) {
                if (f % 2 == 0) {
                    for (int c = 0; c < matriz.length; c++) {
                        matriz[f][c] = "" + valor;
                        valor++;
                    }
                } else {
                    for (int c = (matriz.length - 1); c >= 0; c--) {
                        matriz[f][c] = "" + valor;
                        valor++;
                    }
                }
            }
            imprimirMatriz(matriz);
        }
    public void tarea029() {
                String[][] matriz;
                System.out.println("Ingrese dimesion de Matriz:");
                int dimension = ll.nextInt();
                System.out.println("Ingrese valor inicial:");
                int valor = ll.nextInt();
                matriz = new String[dimension][dimension];
                for (int v = 0; v < dimension / 2; v++) {
                    for (int ls = v; ls < dimension - 1 - v; ls++) {
                        matriz[v][ls] = String.valueOf(valor);
                        valor++;
                    }
                    for (int ld = v; ld < dimension - 1 - v; ld++) {
                        matriz[ld][dimension - 1 - v] = String.valueOf(valor);
                        valor++;
                    }
                    for (int lin = dimension - 1 - v; lin > v; lin--) {
                        matriz[dimension - 1 - v][lin] = String.valueOf(valor);
                        valor++;
                    }
                    for (int liz = dimension - 1 - v; liz > v; liz--) {
                        matriz[liz][v] = String.valueOf(valor);
                        valor++;
                    }
                }
                if (dimension % 2 != 0) {
                    matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
                }
                imprimirMatriz(matriz);
            }
    public void tarea030() {
                    String[][] matriz;
                    System.out.println("Ingrese la dimesion de la Matriz:");
                    int dimension = ll.nextInt();
                    System.out.println("Ingrese el valor inicial:");
                    int valor = ll.nextInt();
                    matriz = new String[dimension][dimension];
                    for (int v = 0; v < dimension / 2; v++) {
                        for (int ld = v; ld < dimension - 1 - v; ld++) {
                            matriz[ld][dimension - 1 - v] = String.valueOf(valor);
                            valor++;
                        }
                        for (int lin = dimension - 1 - v; lin > v; lin--) {
                            matriz[dimension - 1 - v][lin] = String.valueOf(valor);
                            valor++;
                        }
                        for (int liz = dimension - 1 - v; liz > v; liz--) {
                            matriz[liz][v] = String.valueOf(valor);
                            valor++;
                        }
                        for (int ls = v; ls < dimension - 1 - v; ls++) {
                            matriz[v][ls] = String.valueOf(valor);
                            valor++;
                        }
                    }
                    if (dimension % 2 != 0) {
                        matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
                    }
                    imprimirMatriz(matriz);
                }
    public void tarea031() {
                    String[][] matriz;
                    System.out.println("Ingrese la dimesion de la  matriz:");
                    int dimension = ll.nextInt();
                    System.out.println("Ingrese el valor inicial:");
                    int valor = ll.nextInt();
                    matriz = new String[dimension][dimension];
                    for (int v = 0; v < dimension / 2; v++) {
                        for (int lin = dimension - 1 - v; lin > v; lin--) {
                            matriz[dimension - 1 - v][lin] = String.valueOf(valor);
                            valor++;
                        }
                        for (int liz = dimension - 1 - v; liz > v; liz--) {
                            matriz[liz][v] = String.valueOf(valor);
                            valor++;
                        }
                        for (int ls = v; ls < dimension - 1 - v; ls++) {
                            matriz[v][ls] = String.valueOf(valor);
                            valor++;
                        }
                        for (int ld = v; ld < dimension - 1 - v; ld++) {
                            matriz[ld][dimension - 1 - v] = String.valueOf(valor);
                            valor++;
                        }
                    }
                    if (dimension % 2 != 0) {
                        matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
                    }
                    imprimirMatriz(matriz);
                }
    public void tarea032() {
                    String[][] matriz;
                    System.out.println("Ingrese la dimesion de la matriz:");
                    int dimension = ll.nextInt();
                    System.out.println("Ingrese el valor inicial:");
                    int valor = ll.nextInt();
                    matriz = new String[dimension][dimension];
                    for (int v = 0; v < dimension / 2; v++) {
                        for (int liz = dimension - 1 - v; liz > v; liz--) {
                            matriz[liz][v] = String.valueOf(valor);
                            valor++;
                        }
                        for (int ls = v; ls < dimension - 1 - v; ls++) {
                            matriz[v][ls] = String.valueOf(valor);
                            valor++;
                        }
                        for (int ld = v; ld < dimension - 1 - v; ld++) {
                            matriz[ld][dimension - 1 - v] = String.valueOf(valor);
                            valor++;
                        }
                        for (int lin = dimension - 1 - v; lin > v; lin--) {
                            matriz[dimension - 1 - v][lin] = String.valueOf(valor);
                            valor++;
                        }
                    }
                    if (dimension % 2 != 0) {
                        matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
                    }
                    imprimirMatriz(matriz);
                }
    public void tarea033() {
                    String[][] matriz;
                    System.out.println("Ingrese dimesion de Matriz:");
                    int dimension = ll.nextInt();
                    System.out.println("Ingrese valor inicial:");
                    int valor = ll.nextInt();
                    matriz = new String[dimension][dimension];
                    for (int v = matriz.length - 1; v >= matriz.length / 2; v--) {
                        for (int ls = v; ls > (dimension - 1) - v; ls--) {
                            matriz[(dimension - 1) - v][ls] = String.valueOf(valor);
                            valor++;
                        }
                        for (int liz = (dimension - 1) - v; liz < v; liz++) {
                            matriz[liz][(dimension - 1) - v] = String.valueOf(valor);
                            valor++;
                        }
                        for (int lin = (dimension - 1) - v; lin < v; lin++) {
                            matriz[v][lin] = String.valueOf(valor);
                            valor++;
                        }
                        for (int ld = v; ld > (dimension - 1) - v; ld--) {
                            matriz[ld][v] = String.valueOf(valor);
                            valor++;
                        }
                    }
                    if (dimension % 2 != 0) {
                        matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
                    }
                    imprimirMatriz(matriz);
                }
    public void tarea034() {
                    String[][] matriz;
                    System.out.println("Ingrese dimesion de Matriz:");
                    int dimension = ll.nextInt();
                    System.out.println("Ingrese valor inicial:");
                    int valor = ll.nextInt();
                    matriz = new String[dimension][dimension];
                    for (int v = matriz.length - 1; v >= matriz.length / 2; v--) {
                        for (int liz = (dimension - 1) - v; liz < v; liz++) {
                            matriz[liz][(dimension - 1) - v] = String.valueOf(valor);
                            valor++;
                        }
                        for (int lin = (dimension - 1) - v; lin < v; lin++) {
                            matriz[v][lin] = String.valueOf(valor);
                            valor++;
                        }
                        for (int ld = v; ld > (dimension - 1) - v; ld--) {
                            matriz[ld][v] = String.valueOf(valor);
                            valor++;
                        }
                        for (int ls = v; ls > (dimension - 1) - v; ls--) {
                            matriz[(dimension - 1) - v][ls] = String.valueOf(valor);
                            valor++;
                        }
                    }
                    if (dimension % 2 != 0) {
                        matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
                    }
                    imprimirMatriz(matriz);
                }
    public void tarea035() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = ll.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = ll.nextInt();
        matriz = new String[dimension][dimension];
        for (int v = matriz.length - 1; v >= matriz.length / 2; v--) {
        for (int lin = (dimension - 1) - v; lin < v; lin++) {
        matriz[v][lin] = String.valueOf(valor);
        valor++;
    }
         for (int ld = v; ld > (dimension - 1) - v; ld--) {
         matriz[ld][v] = String.valueOf(valor);
        valor++;
    }
        for (int ls = v; ls > (dimension - 1) - v; ls--) {
        matriz[(dimension - 1) - v][ls] = String.valueOf(valor);
        valor++;
        }
        for (int liz = (dimension - 1) - v; liz < v; liz++) {
        matriz[liz][(dimension - 1) - v] = String.valueOf(valor);
         valor++;
    }
    }
        if (dimension % 2 != 0) {
        matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
    }
    imprimirMatriz(matriz);
     }
    public void tarea036() {
                    String[][] matriz;
                    System.out.println("Ingrese dimesion de Matriz:");
                    int dimension = ll.nextInt();
                    System.out.println("Ingrese valor inicial:");
                    int valor = ll.nextInt();
                    matriz = new String[dimension][dimension];
                    for (int v = matriz.length - 1; v >= matriz.length / 2; v--) {
                        for (int ld = v; ld > (dimension - 1) - v; ld--) {
                            matriz[ld][v] = String.valueOf(valor);
                            valor++;
                        }
                        for (int ls = v; ls > (dimension - 1) - v; ls--) {
                            matriz[(dimension - 1) - v][ls] = String.valueOf(valor);
                            valor++;
                        }
                        for (int liz = (dimension - 1) - v; liz < v; liz++) {
                            matriz[liz][(dimension - 1) - v] = String.valueOf(valor);
                            valor++;
                        }
                        for (int lin = (dimension - 1) - v; lin < v; lin++) {
                            matriz[v][lin] = String.valueOf(valor);
                            valor++;
                        }
                    }
                    if (dimension % 2 != 0) {
                        matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
                    }
                    imprimirMatriz(matriz);
                } 
    
    public void imprimirMatriz(String[][] m) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[0].length; c++) {
                if (m[f][c] == null) {
                    System.out.print("\t");
                } else {
                    System.out.print(m[f][c] + "\t");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        new TAREA4().tarea010();
    }

}