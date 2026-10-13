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

    for (int i = 0; i < 10; i++) {
        System.out.println("Dame un número: ");
        int num = programa.nextInt();
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


    // EJERCICIO 4  Crea un programa que pida veinte números enteros por teclado, los almacene en un
    //array y luego muestre por separado la suma de todos los valores positivos y negativos.
    System.out.println("EJERCICIO 4");



            Scanner teclado2 = new Scanner(System.in);

            int[] numeros3 = new int[20];
            int sumaPositivos = 0;
            int sumaNegativos = 0;

            for (int i = 0; i < numeros3.length; i++) {
                System.out.println("Introduce un número entero:");
                numeros3[i] = teclado.nextInt();
            }

            for (int i = 0; i < numeros3.length; i++) {
                if (numeros3[i] > 0) {
                    sumaPositivos = sumaPositivos + numeros3[i];
                } else if (numeros3[i] < 0) {
                    sumaNegativos = sumaNegativos + numeros3[i];
                }
            }

            System.out.println("La suma de los positivos es: " + sumaPositivos);
            System.out.println("La suma de los negativos es: " + sumaNegativos);

    //EJERCICIO 5 Crea un programa que pida veinte números reales por teclado, los almacene en un array
    //y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.
            Scanner teclado3 = new Scanner(System.in);

            int[] numeros4 = new int[20];
            int sumavalores = 0;
            int media;
            for (int i = 0; i < numeros4.length; i++) {
                System.out.println("Introduce un número entero:");
                numeros4[i] = teclado.nextInt();
            }
            for (int i = 0; i < 20; i++) {
            sumavalores = sumavalores + numeros4[i];
            }

            media = sumavalores / 20;

            System.out.println("La media es: " + media);

    //6. Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
    //N, escriba M en todas sus posiciones y lo muestre por pantalla.//


            Scanner teclado4 = new Scanner(System.in);

            int N, M;

            System.out.println("Introduce el tamaño del array (N):");
            N = teclado4.nextInt();

            System.out.println("Introduce el número que quieres guardar (M):");
            M = teclado4.nextInt();

            int[] numeros5 = new int[N];

            for (int i = 0; i < N; i++) {
                numeros5[i] = M;
            }
            for (int i = 0; i < N; i++) {
            System.out.println(numeros5[i]);}

    //7. Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
    //todos los valores desde P hasta Q, y lo muestre por pantalla.
            Scanner teclado5 = new Scanner(System.in);
            int P, Q;

            System.out.println("Introduce el tamaño del array (P):");
            P = teclado4.nextInt();

            System.out.println("Introduce el número que quieres guardar (Q):");
            Q = teclado4.nextInt();
            int[] numeros6 = new int[Q-P +1];
            for (int i = 0; i < N; i++) {
                numeros6[i] =P+ i;
            }
            for (int i = 0; i < N; i++) {
                System.out.println(numeros6[i]);}
    //8. Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
    //utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
    //cuántos valores del array son igual o superiores a R.
    Scanner teclado6 = new Scanner(System.in);


    double R;
    int contador = 0;

    double[] numeros7 = new double[100];

    for (int i = 0; i < 100; i++) {
        numeros7[i] = Math.random();
    }
    System.out.println("Introduce el número que quieres guardar (Q):");
    R = teclado4.nextInt();
    for (int i = 0; i < 100; i++) {
        if(numeros7[i]>=R);
        contador++;


    }
    System.out.println("IGUAL O SUPERIORES:");


















}












