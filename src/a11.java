import java.util.*;

public class a11 {
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
        int newarr[]=new int[arr.length];
        int nonzerocount=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]!=0){
                newarr[nonzerocount]=arr[i];
                nonzerocount++;
            }
        }
        for (int i=nonzerocount;i<newarr.length;i++){
            newarr[i]=0;
        }
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=newarr[i];
        }
    }
}
