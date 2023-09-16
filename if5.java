import java.util.Scanner;

public class if5 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner( System.in );
        int s = 0;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int musbat = 0;
        int manfiy = 0;



          if (a > 0) musbat++;
          if (b > 0) musbat++;
          if (c > 0) musbat++;
          if ( a < 0) manfiy++;
          if ( b < 0) manfiy++;
          if ( c < 0) manfiy++;


        System.out.println(musbat+" "+manfiy);


          }


    }


