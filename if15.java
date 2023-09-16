import java.util.Scanner;

public class if15 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


       if ( a > b && b > c){

           System.out.print(a+" "+b);

       }else if ( b > c && c > a) {

           System.out.print(b + " " + c);

       } else if ( c > a && a > b){

               System.out.print(c+" "+a);

       } else if (a > c && c > b) {

           System.out.println(a+" "+c);


       } else if ( b > a && a > c) {

           System.out.println(b+" "+a);

       } else if (c > b && b > a) {

           System.out.println(c+" "+b);

       }


    }

}
