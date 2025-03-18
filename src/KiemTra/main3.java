package KiemTra;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi:");
        String s = scanner.nextLine();
        isCount(s);
    }
    static void isCount(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                count++;
            }
        }
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("Bạn đã nhập sai!!");
        }
    }
}


