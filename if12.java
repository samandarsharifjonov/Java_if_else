import java.util.Scanner;

public class if12 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int min = a;
        if ( min > b ) System.out.println(b);
        else if ( min > c ) System.out.println(c);
        else System.out.println(min);


    }
}