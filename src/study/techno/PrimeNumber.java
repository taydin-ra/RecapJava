package study.techno;

public class PrimeNumber {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        for (i = 1; i <= 50; i++) {

            int counter = 0;

            for (j = i; j >= 1; j--) {

                if (i % j == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                System.out.println(i + " is a prime number");
            }
        }
    }
}

