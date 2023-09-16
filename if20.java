import java.util.Scanner;

public class if20 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double l1 = Math.abs(a - b);
        double l2 = Math.abs(a - c);



        if ( l1 < l2){


            System.out.print(b + " " + l1);
//            System.out.println(b-a);

        }else {


            System.out.println(c+" "+l2);
//            System.out.println(c-a);


        }











    }



}
