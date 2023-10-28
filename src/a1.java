import java.util.*;

public class a1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        moveZerosToEnd(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Method to find move all zeros to the end of the array
    static void moveZerosToEnd(int[] arr) {
        // Write your code here
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int value : arr) {
            arrList.add(value);
        }

        for(int i=0;i<=arr.length-1;i++){
            int index = arrList.indexOf(0);
            int x=0;
            if (index!=-1){
                arrList.remove(index);
                arrList.add(arr.length-1,0);
            }
        }
    }
}
