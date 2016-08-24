package algoritmodeordenamiento;

import java.util.Scanner;

/**
 * @author OscarNedzelsky A00513376
 **/

public class Algoritmo {
    public static void Ordenamiento1(int [] array){
        for (int i = 0; i < (array.length-1); i++){ //Este es el ciclo para la posición de la izquierda.
            int m = i; //Este es el apuntador.
            for (int j = i + 1; (j < array.length); j++){ //Este es el ciclo para la posición de la derecha.
                if (array [j] < array [m]){ //Si j es menor a m, el valor de j se guarda en m para después cambiarlo de posición.
                   m = j;
                }
            }
        int aux = array[i]; //El auxiliar guarda el número en la posición i del arreglo, para así poder hacer el cambio de orden sin eliminar ningún número.
        array[i]=array[m]; //El número en la posición i pasa a ser el que se guardó en m.
        array[m] = aux; //El número en la posición m pasa a ser el que se guardó en el auxiliar, completando así el intercambio (swap).
        }
    }
   
   public static int [] setArray(){//Este método crea el vector y le introduce los valores.
        Scanner scan = new Scanner(System.in);
        System.out.println("Teclee la longitud que desea que tenga su vector:"); //Se le pide al usuario que teclee la longitud del vector.
        int lgt = scan.nextInt();
        int array [] = new int [lgt]; //Se crea el vector con la longitud especificada.
        for (int i = 0; (i < lgt); i++){ //El ciclo permite que el usuario llene el vector.
            System.out.println("Teclee el valor que ocupará la posición " + (i + 1) + ":");
            int valor = scan.nextInt();
            array [i] = valor;
        }
        return array; //Una vez que el vector fue creado, es regresado para modificarlo.
    }
}
