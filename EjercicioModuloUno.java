package com.adecco;

import java.util.Scanner;

public class EjercicioModuloUno {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("""
                Te damos la bienvenida a la app de Calendario.
                Elija una opción para obtener información:
                1- Enero.
                2- Febrero.
                3- Marzo.
                4- Abril.
                5- Mayo.
                6- Junio.
                7- Julio.
                8- Agosto.
                9- Septiembre.
                10- Octubre.
                11- Noviembre.
                12- Diciembre.
                13- ¡Sacame de aqui!
                """);

        while (true) {
            System.out.print("Elija una opción (1-13): ");
            int numeroMes = consola.nextInt();

            if (numeroMes == 13) {
                System.out.println("Gracias, vuelva pronto.");
                break; // Sale del bucle
            }

            // Verificar que el número esté entre 1 y 12
            if (numeroMes < 1 || numeroMes > 12) {
                System.out.println("Opción incorrecta, vuelva a probar.");
                continue; // Vuelve al inicio del bucle
            }

            String estacion = "", mes = "";

            switch (numeroMes) {
                case 1:
                    mes = "Enero";
                    estacion = "Invierno";
                    break;
                case 2:
                    mes = "Febrero";
                    estacion = "Invierno";
                    break;
                case 3:
                    mes = "Marzo";
                    estacion = "Primavera";
                    break;
                case 4:
                    mes = "Abril";
                    estacion = "Primavera";
                    break;
                case 5:
                    mes = "Mayo";
                    estacion = "Primavera";
                    break;
                case 6:
                    mes = "Junio";
                    estacion = "Verano";
                    break;
                case 7:
                    mes = "Julio";
                    estacion = "Verano";
                    break;
                case 8:
                    mes = "Agosto";
                    estacion = "Verano";
                    break;
                case 9:
                    mes = "Septiembre";
                    estacion = "Otoño";
                    break;
                case 10:
                    mes = "Octubre";
                    estacion = "Otoño";
                    break;
                case 11:
                    mes = "Noviembre";
                    estacion = "Otoño";
                    break;
                case 12:
                    mes = "Diciembre";
                    estacion = "Invierno";
                    break;
            }

            System.out.println("El mes de " + mes + " se encuentra en la estación " + estacion);
        }

        consola.close(); // Cierra el Scanner al finalizar
    }


    public static class ejemploArray {
        public static void main(String[] args) {

            String[] array = {"Hola", "Mundo", "Desde", "Java"};

            // Iterar con un bucle for tradicional

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }

            // Iterar con un bucle for-each

            for (String nombre : array) {
                System.out.println(nombre);
            }
        }
    }

    public static class ejemploFuncionNombre {

        public static class crearFuncion {

            public static void imprimirNombre(String nombre) {

                System.out.println("¡Hola, soy " + nombre + "!");
            }

            public static void main(String[] args) {

                String nombre1 = "Ana";
                imprimirNombre(nombre1);

                String nombre2 = "David";
                imprimirNombre(nombre2);

                String nombre3 = "Alan";
                imprimirNombre(nombre3);

                String nombre4 = "Daniel";
                imprimirNombre(nombre4);
            }
        }
    }

}