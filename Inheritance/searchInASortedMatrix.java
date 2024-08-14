public class searchInASortedMatrix {
    public static void main(String[] args) {
        int arr[][] = {{10, 20, 30, 40}
                , {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};


        int target = 33;

        int row = 0;
        int col = arr[0].length;
        while (row < args.length && col >= 0) {
            if (target == arr[row][col]) {
                System.out.println("found at row"+row+" and colmn"+col);
                return;
            }
            else if(target>arr[row][col]){
                row++;
            }
            else col--;


        }

    }
}
