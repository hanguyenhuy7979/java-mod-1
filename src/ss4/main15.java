package ss4;

import java.util.Scanner;

public class main15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều cạnh của hình vuông :");
        int chieuDaiCanh = scanner.nextInt();

        System.out.println("Hình a");
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
        System.out.println("Hình b");
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
        System.out.println("Hình c");
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
    }
}