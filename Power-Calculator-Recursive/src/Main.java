import java.util.Scanner;

public class Main {

    static int power(int n1, int n2) {
        if (n2 == 0)
            return 1;
        else if (n2 == 1)
            return n1;
        else
            return n1 * (power(n1 , n2 - 1));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2;

        System.out.print("Taban değeri giriniz : ");
        n1 = scan.nextInt();

        System.out.print("Kuvvet giriniz : ");
        n2 = scan.nextInt();

        System.out.println("Sonuç : " + power(n1, n2));

    }
}
