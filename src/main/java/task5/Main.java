package task5;

public class Main {
    public static void main(String[] args) {
        System.out.println(findLeastNumberOfElements(new int[]{13, 51, 93, 91, 42, 36, 96, 37, 27, 18}));
        System.out.println(findLeastNumberOfElements(new int[]{1,2,3,4,5,6}));
    }
    public static int findLeastNumberOfElements(int[] arrray) {
        boolean isSort=true;
        for (int i = 0; i <arrray.length-1 ; i++) {
            if(arrray[i]>arrray[i+1]){
                isSort=false;
                break;
            }
        }
        if(isSort)
            return 0;
        int n = arrray.length;
        int length = 0;
        final int MIN = Integer.MIN_VALUE;
        final int MAX = Integer.MAX_VALUE;

        int[] extraArray = new int[n];
        extraArray[0]=MIN;
        for (int i = 1; i < n; i++)
            extraArray[i] = MAX;

        for (int i = 0; i < n - 1; i++) {
            int j=binarySearch(extraArray,0,n-1,arrray[i]);
            if (extraArray[j-1] < arrray[i] && arrray[i] < extraArray[j]){
                extraArray[j]=arrray[i];
                length=Math.max(length,j);
            }
        }
        return n-length;
    }

    static int binarySearch(int[] array, int left, int right, int searchedElem) {
        int middle = -1;
        if (searchedElem < array[left])
            return left;
        if (searchedElem > array[right])
            return right;
        while (left <= right) {
            middle = (left + right) / 2;
            if (searchedElem >= array[middle] && searchedElem < array[middle + 1])
                return middle + 1;
            if (searchedElem < array[middle])
                right = middle - 1;
            if (searchedElem > array[middle])
                left = middle + 1;
        }
        return middle;
    }
}
