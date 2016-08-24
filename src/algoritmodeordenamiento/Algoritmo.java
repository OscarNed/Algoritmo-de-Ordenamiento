package algoritmodeordenamiento;

import java.util.Scanner;

/**
 * @author OscarNedzelsky A00513376
 **/

public class Algoritmo {
    public static void Ordenamiento1(int [] array){
        for (int i = 0; i < (array.length-1); i++){
            int m = i; //Este es el apuntador.
            for (int j = i + 1; (j < array.length); j++){
                if (array [j] < array [m]){
                   m = j;
                }
            }
        int aux = array[i];
        array[i]=array[m];
        array[m] = aux;
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
