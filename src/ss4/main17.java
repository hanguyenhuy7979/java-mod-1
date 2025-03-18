package ss4;

import java.util.Scanner;

public class main17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều dài cạnh: ");
        int chieuDaiCanh = scanner.nextInt();

        System.out.println("Hình a ");
        for (int i = 1; i <= chieuDaiCanh; i++) {
            for (int j = 1; j <= chieuDaiCanh; j++) {
                if (i == 1 || i == chieuDaiCanh || j == 1) {
                    System.out.println("* ");
                } else {
                    System.out.println(" ");
                }

            }
            System.out.println();
        }
        System.out.println("Hình b ");
        for (int i = 1; i <= chieuDaiCanh; i++) {
            for (int j = 1; j <= chieuDaiCanh; j++) {
                if (i == 1 || i == chieuDaiCanh || j == chieuDaiCanh - i + 1) {
                    System.out.println("* ");
                } else {
                    System.out.println(" ");
                }

            }
            System.out.println();
        }
    }
}
