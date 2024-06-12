import java.util.*;
class p3{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the Elemetns : ");
    for(int o=0;o<n;o++){
        arr[o]=sc.nextInt();
    }
    int no=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                 no=arr[i];
            }
            else {
                no=arr[j];
            }
            
         }

    }
        System.out.println("Second Largest No." +no);
    }
}