import java.util.*;
class p1 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Entert the size of array : ");
        int size=sc.nextInt();
        int arr[]=new int [size];
        int arr1[]=new int[size];
        int count=0;
        int o,d;
        System.out.println("Enter the elements");
            for(int i=0;i<size;i++) {
                arr[i]=sc.nextInt();
            }
            for(int j=0;j<size;j++) {
                arr1[j] = 0;
            }
                for( o=0;o<size;o++) {
                    for( d=o+1;d<size;d++){
                        if(arr[o]==arr[d]) {
                            count++;
                        }
                        if (count==1) {
                            arr1[d]=arr[o];
                        }
                    }
                    System.out.println(arr1[d]);
                }
    }
}