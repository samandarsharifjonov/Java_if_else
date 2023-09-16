import java.util.Scanner;

public class if14 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && b > c || a < b && b < c){

            System.out.println(c+" "+a);

        }else if ( b > c && c > a|| b < c && c < a){

            System.out.println(a+" "+b);

        }else if ( c > a && a > b|| c < a && a < b){

            System.out.println(b+" "+c);

        }else if ( a == b ) {

            System.out.println(a+" "+c);

        }else if ( b == c){

            System.out.println(b+" "+a);

        }else if ( c == a){

            System.out.println(c+" "+b);
        }
        


    }
}
