import java.util.Scanner;

public class Quicksort {
    public static int Qs(int[]a,int low,int high){
        int pivot=a[low];
        int i=low;
        int j=high;
        while(i<j){
            while(a[i]<=pivot && i<high){
                i++;
            }
            while(a[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;            
            }
        }
        int temp=a[low];
        a[low]=a[j];
        a[j]=temp;
        return j;
    }
    public static void Quick_sort(int[] a,int low,int high){
        if(low<high){
           int  partition=Qs(a,low,high);
           Quick_sort(a,low, partition-1);
           Quick_sort(a,partition+1,high) ;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Quick_sort(a,0,n-1);
       
         for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
         }
    }
}
