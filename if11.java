import java.util.Scanner;

public class if11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a != b && a > b) {
            System.out.println(a+" "+a);
        } else if ( a != b && a < b){
            System.out.println(b+" "+b);
        }else if (a == b) System.out.println(0+" "+0);

    }
}
