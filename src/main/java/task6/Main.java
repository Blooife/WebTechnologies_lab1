package task6;

public class Main {
    public static void main(String[] args) {
        double[][] a = getMatrix(new double[]{1,2,3,4,5,6,7,8,9});
        printMatrix(a);
    }
    public static void printMatrix(double[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.printf("%.2f ", arr[i][j]);
            }
            System.out.println();
        }
    }
    public static double[][] getMatrix(double[] arr){
        double[][] result = new double[arr.length][arr.length];
        for(int i = 0; i < arr.length; i++){
            int s1 =0;
            for(int j = i; j < arr.length; j++){
                result[i][s1] = arr[j];
                s1++;
            }
            int s2 = 0;
            for(; s1 < arr.length; s1++){
                result[i][s1] = arr[s2];
                s2++;
            }
        }
        return result;
    }
}
