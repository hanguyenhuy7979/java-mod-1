package ss4;

import java.util.Scanner;

public class main22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên dương a:");
        int a = scanner.nextInt();
        System.out.println("Nhập số nguyên dương b :");
        int b = scanner.nextInt();


        int soLuongsodoixung = 0;
        int tongsoDoXung = 0;


        int soLuongSoChinhPhuong = 0;
        int tongSoChinhPhuong = 0;

        int soLuongNguyenTo = 0;
        int tongSoNguyenTo = 0;


        for (int n = a; n <= b; n++) {
            String str = Integer.toString(n);
            boolean isPalindrone = true;
            for (int i = 0; i <= str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    isPalindrone = false;
                    break;
                }
            }
            if (isPalindrone) {
                soLuongsodoixung++;
                tongsoDoXung += n;
            }
            if (Math.sqrt(n) % 1 == 0) {
                soLuongSoChinhPhuong++;
                tongSoChinhPhuong += n;
            }
            boolean isPrime = true;
            if (n < 2) {
                isPrime = false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                soLuongNguyenTo++;
                tongSoNguyenTo += n;
            }
        }
        System.out.printf("Số đối xứng trong đoạn [%d,%d]:%d\n", a, b, soLuongsodoixung);
        System.out.printf("Tổng số đối xứng trong đoạn [%d,%d]:%d\n", a, b, tongsoDoXung);
        System.out.printf("Số chính phương trong đoạn [%d,%d]:%d\n", a, b, soLuongSoChinhPhuong);
        System.out.printf("Tổng số chính phương trong đoạn [%d,%d]:%d\n", a, b, tongSoChinhPhuong);
        System.out.printf("Số nguyên tố trong đoạn  [%d,%d]:%d\n", a, b, soLuongNguyenTo);
        System.out.printf("Tổng số nguyên tố trong đoạn [%d,%d]:%d\n", a, b, tongSoNguyenTo);
    }
}
