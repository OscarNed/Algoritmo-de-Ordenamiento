package algoritmodeordenamiento;

/**
 * @author OscarNedzelsky A00513376
 */
public class AlgoritmoDeOrdenamiento {

    public static void main(String[] args) {
        int array [] = Algoritmo.setArray();
        getArrayDisorder(array);
        Algoritmo.Ordenamiento1(array);
        getArrayInOrder(array);
    }
    
    /*El siguiente método muestra el arreglo en desorden, es decir,
    * como lo tipeo el usuario originalmente.
    */
    public static void getArrayDisorder(int array []){
        System.out.println("Su arreglo es el siguiente:");
        for (int i = 0; (i < array.length); i++){
            System.out.print("[" + array [i] + "] ");
        }
    }
    
    /*El siguiente método muestra el arreglo en orden.*/
    public static void getArrayInOrder(int array []){
        System.out.println("\nSu arreglo en orden es el siguiente:");
        for (int i = 0; (i < array.length); i++){
            System.out.print("[" + array [i] + "] ");
        }
    }
}
