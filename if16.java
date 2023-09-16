import java.util.Scanner;

public class if16 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        if ( a < b && b < c) {
            System.out.println( a*2+ " " +b*2+ " " +c*2 );
        } else {

            System.out.println(-a+" "+-b+" "+-c);
        }



    }


}



