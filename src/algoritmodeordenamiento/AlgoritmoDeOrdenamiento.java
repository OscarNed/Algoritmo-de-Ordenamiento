package algoritmodeordenamiento;

/**
 * @author OscarNedzelsky A00513376
 */
public class AlgoritmoDeOrdenamiento {

    public static void main(String[] args) {
        int array [] = Algoritmo.setArray();
        getArrayDisorder(array);
        Algoritmo.Ordenamiento1(array);
        //Algoritmo.Ordenamiento1(array);
        getArrayInOrder(array);
    }
    
    public static void getArrayDisorder(int array []){
        System.out.println("Su arreglo es el siguiente:");
        for (int i = 0; (i < array.length); i++){
            System.out.print("[" + array [i] + "] ");
        }
        //System.out.println("");
    }
    
    public static void getArrayInOrder(int array []){
        System.out.println("\nSu arreglo en orden es el siguiente:");
        for (int i = 0; (i < array.length); i++){
            System.out.print("[" + array [i] + "] ");
        }
    }
}
