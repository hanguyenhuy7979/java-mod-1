package ss7_String;

public class main1 {
    public static void main(String[] args) {
        String str1 ="Nguyễn Văn A";
        String str2 ="Nguyễn Văn A";
        String str3 = new String("Nguyễn Văn A");



        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));


        int a = 2;
        int b = 2;

        System.out.println(a==b);






    }
}
