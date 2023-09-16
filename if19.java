import java.util.Scanner;

public class if19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        // b c d 1
        // c d a 2
        // d a b 3
        // a b c 4

        if ( b == c && c == d) System.out.println(1);
        else if ( c == d && d == a ) System.out.println(2);
        else if ( d == a && a == b) System.out.println(3);
        else if ( a == b && b == c) System.out.println(4);

        else System.out.println("yo'q");


    }

}
