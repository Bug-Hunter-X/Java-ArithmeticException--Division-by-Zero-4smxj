public class MyClass {
    public static void main(String[] args) {
        int x = 0;
        try {
            int y = 10 / x; 
            System.out.println(y);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        }
    }
}