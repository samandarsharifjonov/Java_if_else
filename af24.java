import java.util.Scanner;

public class af24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int p = 1;
        for (int i = 1; i <= n; i++) {
            p *= i * Math.atan(Math.pow(x, i)+5.5);

        }
        System.out.println(p);
    }
}
