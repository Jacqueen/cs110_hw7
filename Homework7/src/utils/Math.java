package utils;

public class Math {
    public static int factorial(int num) {
        if (num == 0)
            return 1;
        return num * factorial(num - 1);

    }
    public static int factorialLoop (int num){
        int i = 1;
        while(num != 1) {
            i = i * num;
            i--;
        }
        return i;
    }
}
