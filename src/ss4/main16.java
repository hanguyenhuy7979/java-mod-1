package ss4;

import java.util.Scanner;

public class main16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều dài cạnh của hình tam giác:");
        int chieuDaiCanh = scanner.nextInt();


        System.out.println("Hình a");
        for (int i = 1; i <= chieuDaiCanh; i++) {
            for (int j = 1; j <= chieuDaiCanh; j++) {
                System.out.println("* ");
            }
            System.out.println();
        }
        System.out.println("Hình b");
        for (int i = 1; i <= chieuDaiCanh; i++) {
            for (int j = 1; j <= chieuDaiCanh - i + 1; j++) {
                System.out.println("* ");
            }
            System.out.println();
        }
        System.out.println("Hình c");
        for (int i = 1; i <= chieuDaiCanh; i++) {
            for (int j = 1; j <= chieuDaiCanh - i; j++) {

                System.out.println();
            }
            for (int j = 1; j <= i; j++) {
                System.out.println("* ");
            }
            System.out.println();
        }
        System.out.println("Hình d");
        for (int i = 1; i <= chieuDaiCanh; i++) {
            for (int j = 1; j < i; j++) {
                System.out.println(" ");
            }
            for (int j = 1; j <= chieuDaiCanh - i + 1; j++) {
                System.out.println("* ");
            }
            System.out.println();
        }
        System.out.println("Hình e");
        for (int i = 1 ; i <= chieuDaiCanh ; i++){
            for (int j = 1 ; j <= chieuDaiCanh - i + 1; j++) {
                if (i == 1 || j == 1 || j == chieuDaiCanh - i + 1) {
                    System.out.println("* ");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Hình f");
        for (int i = 1 ; i <= chieuDaiCanh ; i++){
            for (int j = 1 ; j <= chieuDaiCanh - i ; j++){
                System.out.println(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++){
                System.out.println("* ");
            }
            System.out.println();
        }
        System.out.println("Hình g");
        for (int i = 1 ; i <= chieuDaiCanh ; i++){
            for (int j = 1 ; j < i ; j++){
                System.out.println(" ");
            }
          for (int j = 1; j <= (chieuDaiCanh - i)* 2 + 1; j++){
              System.out.println("* ");
          }
            System.out.println();
        }
    }
}