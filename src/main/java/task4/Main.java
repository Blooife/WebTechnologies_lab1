package task4;

import java.util.ArrayList;

public class Main {
    public static void printPrimeElements(int[] array){
        for (int i = 0; i < array.length; i++){
            if(isPrime(array[i])){
                System.out.print(i + " ");
            }
        }
    }

    /*public static int[] getPrimeIndexes(int[] array){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if(isPrime(array[i])){
                result.add(i);
            }
        }
        return result.
    }*/

    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        if(n == 2){
            return true;
        }
        for(int i = 2; i <= n / 2 + 1; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 15, 3, 9 , 4, 17};
        printPrimeElements(array);
    }
}
