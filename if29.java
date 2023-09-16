import java.util.Scanner;


public class if29 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);





        int n = scanner.nextInt();



        if ( n > 0 && n % 2 == 0) System.out.println("musbat juft son");
        else if ( n > 0 &&  n % 2 != 0 ) System.out.println("musbat toq son");

        if ( n < 0 && n % 2 == 0) System.out.println("manfiy juft son");
        else if ( n < 0 &&  n % 2 != 0 ) System.out.println("manfiy toq son");

        else if ( n == 0) System.out.println("son nolga teng");












    }


}
