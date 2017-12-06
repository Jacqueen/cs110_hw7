package utils;

public class Math {
    public static long factorial(int num) {
        if (num == 0)
            return 1;
        return num * factorial(num - 1);

    }
    public static long factorialLoop (int num){
        int i = 1;
        while(num != 1) {
            i = i * num;
            num--;
        }
        return i;
    }
}
