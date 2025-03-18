package ss4;

import java.util.Scanner;

public class main11 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Nhập vào số nguyên dương n :");
        int n = scanner.nextInt();

        double sum = 0.0;

        for (int i = 1; i <= n ; i ++){
            int fact =1;


        for ( int j = 1; j <= n; j++){
            fact += 1.0 / fact;
        }
            System.out.println("Tổng s = "+ sum);
        }
    }
}
