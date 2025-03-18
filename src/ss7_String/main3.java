package ss7_String;

public class main3 {
    public static void main(String[] args) {
       //  int n =2;
        //System.out.println(n);
        int [] arr= {10,20,30};
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "\t");
        }
    }
    static void changeData(int[] arr){
        arr[1] = 99;
        arr= new int[]{9,9,9};
        arr[1]= 100;
    }
}
