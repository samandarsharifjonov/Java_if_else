import java.util.Scanner;

public class if4 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int s = 0;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int musbat = 0;
        int manfiy = 0;

        if ( a > 0 ) musbat++;
        else manfiy++;

        if ( b > 0)musbat++;
        else manfiy++;

        if ( c > 0 ) musbat++;
        else manfiy++;

        if ( a == 0 || b==0 || c==0) {

            System.out.println(musbat+" "+0);
        }else {

            System.out.println(musbat + " " + manfiy);
        }
    }

}