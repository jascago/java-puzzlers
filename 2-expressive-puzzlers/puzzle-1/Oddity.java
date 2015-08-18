public class Oddity {
    public static boolean isOdd(int i) {
        System.out.println(i + ": " + (i % 2));
        return (i % 2) == 1;
    }

    public static void main(String[] args) {
        System.out.println(isOdd(2));
        System.out.println(isOdd(1));
        System.out.println(isOdd(0));
        System.out.println(isOdd(-1));
        System.out.println(isOdd(-2));
    }
}