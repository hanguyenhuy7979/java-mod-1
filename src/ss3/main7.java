package ss3;

import java.util.Scanner;

public class main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thâm niên công tác (TNCT) (Số tháng): ");
        int tnct = scanner.nextInt();

        double luongcoban = 650000.0;

        double heSoluong;
        if (tnct < 12) {
            heSoluong = 1.92;
        } else if (tnct < 36) {
            heSoluong = 2.34;

        } else if (tnct < 60) {
            heSoluong = 3.0;

        } else {
            heSoluong = 4.5;


        }
        double luong = heSoluong * luongcoban;
        System.out.println("Lương của nhân viên là : $" + luong);
    }
}
