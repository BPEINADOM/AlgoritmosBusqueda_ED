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

        System.out.println("\nBUSQUEDA INGENUA");

        busquedaIngenua(precios, 30);

        System.out.println("\nBUSQUEDA STAIRCASE");
        
        busquedaStaircase(precios, 20);
    }

    public static void busquedaIngenua(int[][] precios, int objetivo) {

        // Contadores
        int comparaciones = 0;
        int encontrados = 0;

        // Recorrer todas las filas
        for (int i = 0; i < precios.length; i++) {

            // Recorrer todas las columnas
            for(int j = 0; j < precios[i].length; j++) {

                // Contabilizar la comparacion
                comparaciones++;

                // Verificar si encontramos el precio
                if (precios[i][j] == objetivo) {

                    encontrados++;

                    System.out.print(
                        "\nEncontrado en fila " + i +
                        ", columna " + j
                    );
                }
            }
        }

        // Mostrar resultados
        if (encontrados > 0) {

            System.out.println("\nPrecio encontrado: " + objetivo);
            System.out.println("\nTotal de apariciones: " + encontrados);

        } else {

            System.out.println("\nel precio " + objetivo + " no existe en la matriz");
        }

        System.out.println("Comparaciones realizadas: " + comparaciones);

    }

    public static void busquedaStaircase(int[][] precios, int objetivo) {

        // Variables
        int fila = 0;
        int columna = precios[0].length - 1;
        int comparaciones = 0;
        int encontrados = 0;

        // Ciclo While

        while (fila < precios.length && columna >= 0) {

            comparaciones++;

            if (precios[fila][columna] == objetivo) {

                encontrados++;

                System.out.println(
                    "\nEncontrado en fila " + fila +
                    ", columna " + columna
                );

                fila++;

            } else if (precios[fila][columna] > objetivo) {

                columna--;

            } else {

                fila++;

            }
        }

        // Mostrar resultado
        if (encontrados > 0) {

            System.out.println("\nPrecio encontrado: " + objetivo);
            System.out.println("\nTotal de apariciones: " + encontrados);

        } else {

            System.out.println("\nEl precio " + objetivo + " no existe en la matriz");

        }

        System.out.println("Comparaciones realizadas: " + comparaciones);
    }

}
