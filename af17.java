import java.util.Scanner;

public class af17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int s = 1;

        for (int i = 1; i <= n ; i++) {
            s *= Math.cos(x) + Math.pow(2, i);
        }
        System.out.println(s);
    }

}
