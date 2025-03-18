package ss4;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên  n:");
        int n = scanner.nextInt();


        for (int i = 1 ; i <= n; i++) {


            if (i % 2 != 0) {

                System.out.println(i + " ");
            }
        }
    }
}
