package ss4;

import java.util.Scanner;

public class main24 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Nhập giá tiền của món đồ :");
        int giaMonDo = scanner.nextInt();
        System.out.println("Nhận Số Tiền khách hàng trả: ");
        int tienKhachHangTra = scanner.nextInt();


        int tienThoiLai = tienKhachHangTra - giaMonDo;
        int menhGiaTien;

        for (int i = 2; i >= 0 ; i--){
            int heSo = (int) Math.pow(10,i);

            menhGiaTien = 5000 * heSo;
            if (tienThoiLai >= menhGiaTien){
                System.out.printf("%d tờ %d\n", tienThoiLai / menhGiaTien,menhGiaTien);
                tienThoiLai %= menhGiaTien;
            }
            menhGiaTien = 2000 * heSo;
            if (tienThoiLai >= menhGiaTien){
                System.out.printf("%d tờ %d\n", tienThoiLai / menhGiaTien,menhGiaTien);
                tienThoiLai %= menhGiaTien;
            }
            menhGiaTien = 1000 * heSo;
            if (tienThoiLai >= menhGiaTien){
                System.out.printf("%d tờ %d\n", tienThoiLai / menhGiaTien,menhGiaTien);
                tienThoiLai %= menhGiaTien;
            }
        }
        System.out.println("Số tiền còn lại " + tienThoiLai);
    }
}
