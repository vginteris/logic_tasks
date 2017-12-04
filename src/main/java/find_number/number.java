package find_number;

public class number {
    public static void main(String[] args) {
        int randomSk = (int)(Math.random() * 100) + 1;
        System.out.println("Random skaicius " + randomSk);
        int max = 100;
        int min = 1;
        int checkNumber = 0;
        int count = 0;
        int tempNumber = 0;

        while(randomSk != checkNumber) {
            checkNumber = (min + max) / 2;
            if(checkNumber==randomSk) {break;}
            else if (checkNumber > randomSk ) {
                max = checkNumber;
            } else {min = checkNumber;}
            System.out.println("skaiciavimas " + checkNumber);
            count ++;
        }
        System.out.println("Kompiuteris atspejo " + checkNumber + " per " + count);

    }

}
