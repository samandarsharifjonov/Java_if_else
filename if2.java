import java.util.Scanner;

public class if2 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if ( a > 0 ){

            System.out.println(a+1);

        }else if ( a < 0 ) {

            System.out.println(a-2);

        }else if ( a == 0) {

            System.out.println(-2);
        }
    }

}
