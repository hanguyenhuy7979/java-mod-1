package ss2;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Nhập tên sản phẩm ");
        String tenSanPham = scanner.nextLine();

        System.out.println("Nhập số lương");
        int soluong = scanner.nextInt();

        System.out.println("Đơn giá từ bàn phím  ");
        double dongia = scanner.nextDouble();

        double tien = soluong * dongia;

        double thueGTGT = 0.1 * tien;


        System.out.println("Tên Sản phẩm : " + tenSanPham);
        System.out.println("Tiền : " + tien);
        System.out.println("Thuế GTGT : " + thueGTGT);
    }
}
