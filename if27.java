import java.util.Scanner;

public class if27 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        if ( x < 0 ){

            System.out.println(0);

        } else if ( Math.floor(x) % 2 == 0 ) {

            System.out.println(1);

        }else if (Math.floor(x) % 2 != 0){

            System.out.println(-1);

        }


    }

}
