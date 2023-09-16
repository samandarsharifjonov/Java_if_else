import java.util.Scanner;

public class if10 {

    public static void main(String[] args) {
    Scanner scanner  = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();


    if ( a != b) {
        int c = a + b;
        a = c;
        b = c;

            System.out.println(a+" "+b);

        }else {

        a = 0;
        b = 0;

            System.out.println(a+" "+b);
        }

      }

}
