package ss6_method;

public class main {
    public static void main(String[] args) {

        // tính tổng 2 số a , b sử dụng phương thức
        int a = 2;
        int b = 3;
        calTotal(2, 3);

        int result = calTotal2(2,3);
        System.out.println(result);


    }


    public static void calTotal(int a, int b) {
        int total = a + b;
        System.out.printf("total: " + total);
    }


        public static int calTotal2( int a, int b){
            int total = a + b;
            return total;

        }
    }

