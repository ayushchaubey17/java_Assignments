import java.util.Arrays;

public class disEle {
    public static void main(String[] args) {
        int arr[][] = new int[4][5];

        int co = 1;
        int r = arr.length;
        int c = arr[0].length;


        int sr = 0;
        int er = r-1;
        int sc = 0;
        int ec = c-1;
        while (sc<=ec && sr<=er) {

            for(int i= sc;i<=ec;i++){
                arr[sc][i] = co++;
                System.out.print(arr[sc][i] +" ");
            }
            sr++;
            System.out.println();
            for(int i= sr;i<=er;i++){
                arr[i][ec] = co++;
                System.out.print(arr[i][ec] +" ");
            }
            ec--;

            System.out.println();
            for(int i= ec;i>=sc;i--){
                arr[er][i] = co++;
                System.out.print(arr[er][i] +" ");
            }
            er--;
            System.out.println();
            for(int i= er;i>=sr;i--){
                arr[i][sc] = co++;
                System.out.print(arr[i][sc] +" ");
            }
            sc++;
            System.out.println();

        }



    }
}
