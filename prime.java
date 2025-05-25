public class prime{
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to get first n prime numbers
    public static int[] firstNPrimes(int n) {
        int[] primes = new int[n];
        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                primes[count] = num;
                count++;
            }
            num++;
        }
        return primes;
    }

    public static void main(String[] args) {
        // Generate first 20 prime numbers
        int[] prime = firstNPrimes(20);

        // Print the result
        System.out.println("The first 20 prime numbers are:");
        for (int primeNumbers : prime) {
            System.out.print(prime + " ");
        }
    }
}