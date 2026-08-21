public class Q6 {
    public static void main(String[] args) {

        int a = 20;
        int b = 18;
        int lcm = 1;

        for (int i = 1; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
        }

        System.out.println("LCM = " + lcm);
    }
}