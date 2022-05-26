class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            // For multiples of 3 & 5, print FizzBuzz

            if (i % 15 == 0) {
                System.out.println("FizzBuzz");

            }
            // For multiples of 3, print Fizz
            if (i % 3 == 0) {

                System.out.println("Fizz");
                continue;
            }
            // For multiples of 5, print Buzz
            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }

        }
    }
}
