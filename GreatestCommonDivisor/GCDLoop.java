public class GCDLoop {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int gcdivisor = gcd(a > b ? a : b, a > b ? b : a);

        System.out.println("Greatest Common Divisor of " + a + " and " + b + " is " + gcdivisor);
    }

    public static int gcd(int a, int b) {
        int remainder = a % b;
        do {
            a = b;
            b = remainder;
            remainder = a % b;
        } while (remainder != 0 && remainder < b);

        return b;
    }
}
