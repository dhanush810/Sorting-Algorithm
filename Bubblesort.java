import java.util.Scanner;

public class Bubblesort {
    public static void Bubble_sort(int[] a,int n){
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Bubble_sort(a,n);
       
         for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
         }
    }
}
