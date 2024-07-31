public class pp {
    public static void main(String[] args) {
        int a =5 ;
        change(a);
        System.out.println(a);

        int arr[] = {1,2,4};
        change(arr);
        System.out.println();
        int x =5;

        if (5 < 2 || x++>7) {

        }
        System.out.println(x);

    }

    static void change(int a) {
        a= 12;

    }


    static void change(int[] arr) {
        arr[1]= 12;

    }
}
