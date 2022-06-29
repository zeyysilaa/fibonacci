import java.util.Scanner;

public class FiboncciSayisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kac basamakli olsun :");
        int n = input.nextInt();
        int toplam = 1;
        for (int i = 0; i <= n; i = (toplam-i)) {
            System.out.println(i + "+" + toplam + "=" + (toplam+i));
            toplam += i;
        }
    }
}
