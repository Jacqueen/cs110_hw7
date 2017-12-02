package utils;

public class ArrayUtils {
    public static int[] reverse(int arr[]) {
        int array[] = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            array[index] = arr[i];
        index++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        System.out.println(stringifyArray(array1));

    }
    public static String stringifyArray(int[] arr) {
        String s = " ";
        for(int i = 0; i < arr.length; i++){
            s = s + arr[i];
            if(i != arr.length - 1){
                s = s + ",";
            }
        }
        return s;
    }
}
