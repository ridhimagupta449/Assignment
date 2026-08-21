public class Q1 {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        try {
            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        }

        try {
            String str = null;
            System.out.println(str.length());
        }
        catch (NullPointerException e) {
            System.out.println("Null value cannot be accessed!");
        }

        System.out.println("Program continues normally.");
    }
}