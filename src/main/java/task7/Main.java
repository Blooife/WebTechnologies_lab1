package task7;

import java.util.Arrays;

public class Main {

    public static void main(String [] args){
        double[] arr ={4,3,2,1,52,21,14,3152,163,112,511,12,444,124,1,4,124,567};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static double[] sort(double[] arr){
        int index = 0;
        while (index < arr.length - 1){
            if(arr[index] > arr[index + 1]){
                double tmp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = tmp;
                index--;
                index = index == -1 ? 0 : index;
            }
            else{
                index++;
            }
        }
        return arr;
    }
}
