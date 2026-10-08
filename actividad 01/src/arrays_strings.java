import java.util.Arrays;
import java.util.Scanner;
public class arrays_strings {
    public static void main(String[] args){
        int numero = 3;

        // CREACIÓN ARRAYS - LISTAS
        int numeros[]; // numeros será un array de enteros
        numeros = new int[7]; // tendrá 7 elementos

        int numeros2[] = new int[7]; // numeros2 = {,,,,,,};

        String nombres[] = new String[10]; // nombres = {,,,,,,,};
        // tipo variable[] = new tipo[longitud];

        // GUARDO INFO EN EL ARRAY
        // posiciones: 0,1,2,3,4,5,...
        // array[posicion] = valor;
        numeros[0] = 32; // quiero poner un 32 en la posición 0
        numeros[2] = 44; // quiero poner un 44 en la posición 2

        // CONSULTAR EL VALOR DEL ARRAY
        System.out.println(numeros[0]);



        // Pide 5 notas al usuario y gúardalos en un array.
        int notas[] = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++){ // i = 0,1,2,3,4
            System.out.println("Dame un número: ");
            int num = sc.nextInt();
            // Meto en un array/lista
            notas[i] = num;
        }
        System.out.println(Arrays.toString(notas));


        // OTRA MANERA CREAR ARRAYS . ya sé que números quiero
        int numeros4[] = new int[4];
        numeros4[0] = 2;
        numeros4[1] = 5;
        

        int numeros3[] = new int[] {2,5,6,12};

        // FOR RECORRER LOS ELEMENTOS DEL ARRAY
        // array ya está lleno y quiero hacer algo con sus elementos
        // array.length = longitud, es decir, cuántos elementos
        for (int i = 0; i < numeros3.length; i++){
            System.out.println("El número " + numeros3[i] + " está en la posición " + i);
            // Muestra los números pares del array
            if (numeros3[i] % 2 == 0){ // par
                System.out.println(numeros3[i]);
            }

            // Muestra los numeros que estén en posiciones pares
            if (i % 2 == 0){ // par
                System.out.println(numeros3[i]);
            }
        }

        // IDEA: dentro del bucle
        // i = posición en sí
        // array[i] = el elemento, el valor guardado


        int tope = sc.nextInt(); // usuario indica el tope
        for (int i = 0; i < tope; i++){

        }

        

    }
}
