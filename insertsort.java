import java.util.*;
public class insertsort{
    public static void Insert_sort(int[] a,int n){
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;

                j--;
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
        Insert_sort(a,n);
       
         for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
         }
    }
}