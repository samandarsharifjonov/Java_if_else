import java.util.Scanner;

public class if13 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        if ( a > b && b > c || a < b && b < c){

            System.out.println(b);

        }else if ( b > c && c > a || b < c && c < a){

            System.out.println(c);

        }else if ( c > a && a > b || c < a && a < b){

            System.out.println(a);

        }


    }

}