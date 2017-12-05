package fibonacci_number;

import java.util.Scanner;

public class FibonacciMain {
    public static void main(String[] args) {
        System.out.println("Insert Fibonnaci number series");
        long fibseries = new Scanner(System.in).nextInt();
        long secondNumber = 1;
        long firstNumber = 0;
        for (; fibseries > 1; fibseries--) {
            if (firstNumber == 0) System.out.print(1+", ");
            long fibNumber = firstNumber+secondNumber;
            firstNumber = secondNumber;
            secondNumber = fibNumber;
            if (fibseries!=2){
            System.out.print(fibNumber+", ");
            }else  System.out.print(fibNumber);
        }

    }
}
