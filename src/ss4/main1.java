package ss4;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên n :");
        int n = scanner.nextInt();


        for (int i = 1; i <= n; i++) {
            System.out.println(i + "\t");
        }
    }
}
