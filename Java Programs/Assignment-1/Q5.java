public class Q5 {
    public static void main(String[] args) {

        int a = 20;
        int b = 28;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD = " + a);
    }
}