package ss4;

import java.util.Scanner;

public class main8 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Nhập vào số nguyên n: ");
        int n =  scanner.nextInt();

        int a = 1;
        while (a <= n){
            System.out.println(a + "");
            a =  2 * a + 1;

        }
    }
}
