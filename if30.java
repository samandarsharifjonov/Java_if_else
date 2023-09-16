import java.util.Scanner;


        public class if30 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);





        int n = scanner.nextInt();



        if ( n > 1 && n < 10 && n % 2 == 0 ) System.out.println("Bir xonali juft son");
        else if ( n > 0 && n < 10 && n % 2 != 0 ) System.out.println("Bir xonali toq son");


        if ( n > 9 && n <= 99 && n % 2 == 0 ) System.out.println("Ikki xonali juft son");
        else if (n > 9 && n <= 99 && n % 2 != 0)System.out.println("Ikki xonali toq son");


         if ( n > 99 && n < 999 && n % 2 == 0 ) System.out.println("Uch xonali juft son");
        else if (n > 99 && n < 999 && n % 2 != 0)System.out.println("Uch xonali toq son");







    }


}
