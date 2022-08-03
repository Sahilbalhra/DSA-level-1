package Sorting;

public class MergeSort {
    public static void conquer(int arr[],int si,int mid,int ei){
        int merged[]=new int[ei-si+1];

        int idx1=si;
        int idx2=mid+1;
        int x=0;

        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merged[x++]=arr[idx1++];
            }else{
                merged[x++]=arr[idx2++];
            }
        }

        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while(idx2<=ei){
            merged[x++]=arr[idx2++];
        }

        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }

    }
    public static void divide(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr,si,mid,ei);
    }
    public static void output(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

        // Algorithm:

        // step 1: start
        // step 2: declare array and left, right, mid variable
        // step 3: perform merge function.
        // mergesort(array,left,right)
        // mergesort (array, left, right)
        // if left > right
        // return
        // mid= (left+right)/2
        // mergesort(array, left, mid)
        // mergesort(array, mid+1, right)
        // merge(array, left, mid, right)
        // step 4: Stop

        divide(arr, 0, n-1);
        output(arr, n);

        //tc nlog(n)

    }

}
