package ss4;

import java.util.Scanner;

public class main18 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);


        System.out.println("Nhập chiều dài cạnh của hình: ");
        int chieuDaiCanh = scanner.nextInt();

        for (int i = 1; i <= chieuDaiCanh; i++){
            for (int j = 1; j <= chieuDaiCanh; j++){
                if (i == 1 || i == chieuDaiCanh || j == 1 || j == chieuDaiCanh || i == j){
                    System.out.println("*");
                }else{
                    System.out.println(" ");
                }
            }
            System.out.println();

        }
    }
}
