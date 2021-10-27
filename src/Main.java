import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöriyel Değerini Giriniz: ");
        int n = scanner.nextInt();
        int total1 = 1;
        int total2 = 1;
        int total3 = 1;

        for (int i = 1; i <= n; i++) {
            total1 = total1 * i;

        }

        System.out.print("Kombinasyon Değerini Giriniz: ");
        int r = scanner.nextInt();

        for (int i2 = 1; i2 <= r; i2++) {
            total2 = total2 * i2;
        }
        int fark = n - r;

        for (int i3 = 1; i3 <= fark; i3++) {
            total3 = total3 * i3;
        }

        int sonuc = total1 / (total2 * (total3));

        System.out.println(n + "'in " + r + "'li kombinasyonun sonucu: " + sonuc);
    }
}