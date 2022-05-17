public class HelloWorld {
    private static int number = 2;
    private static char character = 'a';
    private static boolean isTrue = true;
    private static double decimalValue = 123.05;

    public static void main(String[] args) {
        System.out.println("Hello World 2022!");
        System.out.println("Printing a number: " + number);
        setNumber(5);
        System.out.println("Printing a number after it is set: " + number);
        System.out.println("Printing a character: " + character);
        System.out.println("Printing a boolean: " + isTrue);
        System.out.println("Printing a decimal Value: " + decimalValue);

        int sum = addNumbers(3,5);
        System.out.println("Printing the sum: " + sum);

    }

    public static void setNumber(int parameterNumber) {
        number = parameterNumber;
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
