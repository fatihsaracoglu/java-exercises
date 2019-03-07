public class FindPrimes {

    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);

        for (int i = 2; i <= max; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }

    static boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i <= n/2; i++) {
            if ((n % i) == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}