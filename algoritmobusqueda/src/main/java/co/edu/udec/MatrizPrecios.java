package co.edu.udec;


public class MatrizPrecios {

    public static void main(String[] args) {

        // Declaracion e inicializacion de la matriz
        int[][] precios = {
            {10, 20, 30, 40, 50},
            {15, 25, 35, 45, 55},
            {20, 30, 40, 50, 60},
            {25, 35, 45, 55, 65},
            {30, 40, 50, 60, 70}
        };

        // Mostrar la matriz
        System.out.println("MATRIZ DE PRECIOS");

        for (int i = 0; i < precios.length; i++) {

            for (int j = 0; j < precios[i].length; j++) {

                System.out.print(precios[i][j] + "\t");

            }

            System.out.println();
        }
    }
}
