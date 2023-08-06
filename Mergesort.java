import java.util.ArrayList;
import java.util.Scanner;

public class Mergesort{
    public static void Merge_sort(int[] a,int low,int high){
    if(low<high){
        int mid=(low+high)/2;
    Merge_sort(a,low,mid);
    Merge_sort(a,mid+1,high);
    merge(a,low,mid,high);

    }
}
    public static void merge(int[] a,int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while((left<=mid) && (right<=high)){
            if(a[left]<a[right]){
                temp.add(a[left]);
                left++;
            }
            else{
                temp.add(a[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(a[left]);
            left++;
        }
        while(right<=high){
            temp.add(a[right]);
            right++;
        }
        int i = low;
        for (Integer num : temp) {
        a[i] = num;
        i++;
        }
        

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Merge_sort(a,0,n-1);
       
         for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
         }
    }
    }
