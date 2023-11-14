import java.util.*;

public class a5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        partitionNegativeAndPositive(n, arr);
    }

    // Method to partition negative and positive numbers without comparing with 0
    static void partitionNegativeAndPositive(int n, int arr[]) {
        // Write your code here
        int p=0,n1=0;
        int arrp[] = new int[n],arrn[]=new int[n];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>=0){
                arrp[p]=arr[i];
                p++;
            }
            else{
                arrn[n1]=arr[i];
                n1++;
            }
        }
        if(p==arr.length){
            for(int i=0;i<= arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println(" ");
            System.out.print("Array doesn't have negative numbers");
        }
        else{
            if(arr[0]>=0) {
                for (int i = 0; i < p; i++) {
                    System.out.print(arrp[i] + " ");
                }
                System.out.println(" ");
                for (int i = 0; i <n1; i++) {
                    System.out.print(arrn[i] + " ");
                }
            }
            else{
                for (int i = 0; i < n1; i++) {
                    System.out.print(arrn[i] + " ");
                }
                System.out.println(" ");
                for (int i = 0; i < p; i++) {
                    System.out.print(arrp[i] + " ");
                }
            }
        }
    }
    
}
