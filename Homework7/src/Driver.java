import Animal.Puppy;
import utils.ArrayUtils;
import utils.Math;

public class Driver {
    public static void main(String[] args) {
        Puppy a = new Puppy("Joey");
        Puppy b = new Puppy("Ross");
        Puppy c = new Puppy("Chandler");
        System.out.println(a.getName());
        System.out.println(b.getName());
        System.out.println(c.getName());
        int[] d = ArrayUtils.reverse(new int[]{9, 20, 3, 44, 88, 300});
        System.out.println(ArrayUtils.stringifyArray(d));
        double num = 15.4;
        System.out.println(Math.factorial((int) num));
    }
}
