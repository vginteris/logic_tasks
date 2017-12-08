package factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inser factorial number");
        long facNumber = scanner.nextLong();
        System.out.println(facNumber + " factorial is:  " + factorialCount(facNumber));
    }

    public static long factorialCount(long facNumber) {
        long sum=facNumber;
        if (facNumber == 0) return 1;
        else
        {
            for (long i = (facNumber-1); i > 0; i--)
            {
                sum *= i;
            }
            return sum;
        }
    }
}
