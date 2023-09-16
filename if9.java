import java.util.Scanner;
public class if9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat(); // A sonni kiritamiz.
        float b = scanner.nextFloat(); // B sonni kiritamiz.

        float temp = a; // yangi o'zgaruvchi olib qiymatlarni almashtiramiz.
        a = b;
        b = temp;

        if ( a < b) System.out.println(a+" "+b); // Agar a son b dan katta bo'lsa avval ani keyin b ni chiqaramiz
        else System.out.println(b+" "+a); // aks holda avval b ni keyin a ni chiqarami.
    }
}