import java.util.Arrays;
import java.util.Scanner;
void main() {
    //1. Crea un programa que pida diez números reales por teclado, los almacene en un array,
    //y luego muestre todos sus valores.
    System.out.println("EJERCICIO 1");
    Scanner programa = new Scanner(System.in);
    System.out.println("di un numero");
    int numero = programa.nextInt();
    int numeros[] = new int[10];

    for (int i = 0; i < 10; i++) { // i = 0,1,2,3,4
        System.out.println("Dame un número: ");
        int num = programa.nextInt();
        // Meto en un array/lista
        numeros[i] = num;

    }
    System.out.println(Arrays.toString(numeros));
    //2. Crea un programa que pida diez números reales por teclado, los almacene en un array,
    //y luego muestre la suma de todos los valores.


            Scanner teclado = new Scanner(System.in);

            double[] numeros1 = new double[10];
            double suma = 0;

            for (int i = 0; i < 10; i++) {
                System.out.println("Introduce un número:");
                numeros1[i] = teclado.nextDouble();
                suma = suma + numeros1[i];
            }

            System.out.println("La suma de todos los números es: " + suma);

    //3. Crea un programa que pida diez números reales por teclado, los almacene en un array,
    //y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.

            Scanner teclado1 = new Scanner(System.in);

            double[] numeros2 = new double[10];

        // Guardamos los 10 números
            for (int i = 0; i < 10; i++) {
                System.out.println("Introduce un número:");
                numeros2[i] = teclado1.nextDouble();
            }

        // Cogemos el primer número como máximo y mínimo
            double maximo = numeros2[0];
            double minimo = numeros2[0];

        // Buscamos el máximo y el mínimo
            for (int i = 1; i < 10; i++) {

                if (numeros2[i] > maximo) {
                    maximo = numeros2[i];
                }

                if (numeros2[i] < minimo) {
                    minimo = numeros2[i];
                }
            }

            System.out.println("El máximo es: " + maximo);
            System.out.println("El mínimo es: " + minimo);
                    }







