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
    //ejercicio 3
    // Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2,
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
        //4.
    // Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
    //Para ello utiliza un contador y suma de 2 en 2.
    System.out.println("EJERCICIO 4");

    for (int contador = 2; contador <= 200; contador = contador + 2) {
        System.out.println(contador);
    }
    //5
    // Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
    //Esta vez utiliza un contador sumando de 1 en 1.9
    System.out.println("EJERCICIO 5");

    for (int contador = 1; contador <= 200; contador = contador + 1) {
        if (contador % 2 == 0) {
            System.out.println(contador);
        }
    }
    // EJERCICIO 6
    // Realiza un programa que muestre los números desde el 1 hasta un número N que se
    //introducirá por teclado.
    System.out.println("EJERCICIO 6");
    Scanner programa3 = new Scanner(System.in);
    System.out.println("di una edad");
    int numero4 = programa3.nextInt();
    for (int contador = 1; contador <= numero4; contador = contador + 1) {
         {
            System.out.println(contador);
        }
    }
    //EJERCICIO 7
    // Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en
    //calificación alfabética, escribiendo el resultado.
    //• de 0 a <3 Muy Deficiente.
    //• de 3 a <5 Insuficiente.
    //• de 5 a <6 Bien.
    //• de 6 a <9 Notable
    //• de 9 a 10 Sobresaliente

    System.out.println("EJERCICIO 7");
    Scanner programa4 = new Scanner(System.in);
    System.out.println("di una NOTA");
    int numero5 = programa3.nextInt();
    if(numero5 >= 0 && numero5<=3)
    System.out.println("tu nota es deficiente");
    else if (numero5>=3 && numero5<=5)
    System.out.println("tu nota es insuficiente");
    else if(numero5 >= 5 && numero5<=6)
    System.out.println("tu nota es un bien");
    else if(numero5 >= 6 && numero5<=9)
    System.out.println("tu nota es un notable");
    else if(numero5 >= 9 && numero5<=10)
    System.out.println("tu nota es un sobresaliente");

    //EJERCICIO 8
    // Realiza un programa que lea un número positivo N y calcule y visualice su factorial N!
    //Siendo el factorial:
    //• 0! = 1
    //• 1! = 1
    //• 2! = 2 * 1
    //• 3! = 3 * 2* 1
    //• N! = N * (N-1) * (N-2)........* 3*2*1

    System.out.println("EJERCICIO 8");
    Scanner programa5 = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int n = programa5.nextInt();
    int factorial = 1;

    for (int i = 1; i <= n; i++) {
        factorial = factorial * i;
    }

    System.out.println("El factorial de " + n + " es: " + factorial);
    // EJERCICIO 9
    // Escribe un programa que recibe como datos de entrada una hora expresada en horas,
    //minutos y segundos que nos calcula y escribe la hora, minutos y segundos que serán,
    //transcurrido un segundo.
    System.out.println("EJERCICIO 9");
    Scanner programa6 = new Scanner(System.in);
    System.out.print("Introduce unas horas: ");
    int horas = programa6.nextInt();
    System.out.print("Introduce unas minitos: ");
    int minutos = programa6.nextInt();
    System.out.print("Introduce unas segundos: ");
    int segundos = programa6.nextInt();
    if(segundos==60)
        segundos=0;
        minutos++;
    if (minutos==60);
    minutos=0;
    horas++;
    if(horas==24);
    horas=0;
    System.out.println("La hora dentro de un segundo será: "
            + horas + ":" + minutos + ":" + segundos);

    // EJERCICIO10 Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha
    //leído algún número negativo o no.
    System.out.println("EJERCICIO 10");
    Scanner programa7 = new Scanner(System.in);
    boolean negativo = false;
    for(int i=0;i<=10;i++);
    System.out.println("di un numero");
    int numero7 = programa6.nextInt();
    if(numero7<=0);{
        negativo= true;

    }
    if (numero7=true);
    }






}
