class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            //For multiples of 3, print Fizz
            if (i%3 == 0) {

                System.out.println("Fizz");

            }
            //For multiples of 5, print Buzz
            else if (i%5 == 0) {
                System.out.println("Buzz");

            }
            //For multiples of 3 & 5, print FizzBuzz

            else if (i%3 && i%5 == 0) {
                System.out.println("FizzBuzz");

            }

        }
    }
}
