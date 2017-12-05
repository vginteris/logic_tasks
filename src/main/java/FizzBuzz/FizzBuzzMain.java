package FizzBuzz;

public class FizzBuzzMain {
    public static void main(String[] args) {
        String multiplesThree = "Fizz";
        String multiplesFive = "Buzz";
        for (int i = 1; i <=50 ; i++) {
            String tempNumber = i + " - ";
            if (i % 3 == 0) tempNumber += multiplesThree;
             else if (i % 5 == 0) tempNumber += multiplesFive;
            System.out.println(tempNumber);
        }
    }
}
