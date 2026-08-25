public class checkprime {

    public static void main(String args[]) {

        int num = 29;

        boolean isprime = true;

        if (num <= 1) {
            isprime = false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }

        if (isprime) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }
}