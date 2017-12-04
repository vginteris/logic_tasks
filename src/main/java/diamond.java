public class diamond {
    public static void main(String[] args) {
        int sk1=23;

        for (int i = 0; i <sk1 ; i++) {
            for (int j = 0; j <sk1 ; j++) {
                if (j==(i/2)) System.out.print("*");
                else System.out.print("i");
            }
            System.out.println("");
        }
    }
}
