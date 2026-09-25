import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {

        //EJERCICIO 1 Escribe un programa que dé los “buenos días”.
        System.out.println("Buenos Dias");
        //EJERCICIO 2 Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5.
        int lado = 5;
        int area = lado * lado;
        System.out.println(area);
        //EJERCICIO 3 Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por teclado.
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el lado: ");
        double ladoo = sc.nextDouble();

        double areaa = lado * lado;
        System.out.println(areaa);

        //4. Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta, producto y división.
        Scanner programa = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        double numero1 = programa.nextDouble();
        System.out.println("Dime un numero: ");
        double numero2 = programa.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multi = numero1 * numero2;
        double divi = numero1 / numero2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multi);
        System.out.println("División: " + divi);

        //5. Escribe un programa que toma como dato de entrada un número que corresponde a la
        // longitud de un radio y nos escribe la longitud de la circunferencia, el área del círculo y el
        //volumen de la esfera que corresponden con dicho radio.
        Scanner prog = new Scanner(System.in);
        System.out.println("Dime un numero que corresponda a la lon de un radio: ");
        double radio = prog.nextDouble();

        System.out.println("la longitud es: " +  (2 * radio * Math.PI));
        System.out.println(" el área del círculo es: " +  (2 * Math.PI * radio * radio));
        System.out.println("volumen de la esfera: " +  (4/3.0 * Math.PI * radio * radio));
        //6. Escribe un programa que dado el precio de un artículo y el precio de venta real nos
        //muestre el porcentaje de descuento realizado.
        System.out.println("EJERCICIO 6");
        Scanner progr = new Scanner(System.in);
        System.out.println("Dime el precio de un articulo: ");
        double precio = progr.nextDouble();
        System.out.println("Dime el precio de venta de un articulo: ");
        double precio2 = progr.nextDouble();
        double descuento = ((precio - precio2) / precio) * 100;
        System.out.println("El descuento es:" + descuento );
        //7. Escribe un programa que lea un valor correspondiente a una distancia en millas marinas
        //y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.

    }
}