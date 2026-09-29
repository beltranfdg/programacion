import java.util.Scanner;
void main() {
    System.out.println("EJERCICIO 1");
    Scanner programa = new Scanner(System.in);
    System.out.println("di una edad");
    int numero = programa.nextInt();
    if(numero >= 18);
    System.out.println("puedes pasar");

// ej 2


    System.out.println("EJERCICIO 2");
    Scanner programa1 = new Scanner(System.in);
    System.out.println("di una edad");
    int edad = programa1.nextInt();
    if (edad < 18) {
        System.out.println("No pasas");
    } else {
        System.out.println("pasas");
    }
    //Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2,
    //3... 20).
    System.out.println("EJERCICIO 3");


        int numero2 = 1;

        switch (numero2) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            case 8:
                System.out.println("8");
                break;
            case 9:
                System.out.println("9");
                break;
            case 10:
                System.out.println("10");
                break;
            case 11:
                System.out.println("11");
                break;
            case 12:
                System.out.println("12");
                break;
            case 13:
                System.out.println("13");
                break;
            case 14:
                System.out.println("14");
                break;
            case 15:
                System.out.println("15");
                break;
            case 16:
                System.out.println("16");
                break;
            case 17:
                System.out.println("17");
                break;
            case 18:
                System.out.println("18");
                break;
            case 19:
                System.out.println("19");
                break;
            case 20:
                System.out.println("20");
                break;
        }
        //4. Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
    //Para ello utiliza un contador y suma de 2 en 2.
    System.out.println("EJERCICIO 4");

    for (int contador = 2; contador <= 200; contador = contador + 2) {
        System.out.println(contador);
    }
    //5 Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
    //Esta vez utiliza un contador sumando de 1 en 1.9
    System.out.println("EJERCICIO 5");

    for (int contador = 1; contador <= 200; contador = contador + 1) {
        if (contador % 2 == 0) {
            System.out.println(contador);
        }
    }
    // EJERCICIO 6 Realiza un programa que muestre los números desde el 1 hasta un número N que se
    //introducirá por teclado. 







}
