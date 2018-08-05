/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechef;

import java.util.Arrays;

/**
 *
 * @author Singh
 */
public class QuickSort {
    public static void main(String[] args) {
        int arr[]={10, 7, 8, 9, 1, 5};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
    private static void quickSort(int[] arr,int start,int end){
        if(start<end){
            //System.out.println("Start="+start+"  End="+end);
            int partition = partition(arr,start,end);
            //System.out.println("Partition="+partition);
            quickSort(arr,start,partition-1);
            quickSort(arr,partition+1,end);
        }
        //System.out.println("False for "+start+"  "+end );
    }
    
    private static int partition(int[] arr,int l,int h){
        int pivot = arr[l];
        int i=l+1; //for finding elements greater than pivot
        int j=h; //for finding elements less than than pivot
        while(i<j){
            while(i<h && pivot>=arr[i])//element less than pivot 
                i++;
            while(j>l && pivot < arr[j])//element greater than pivot
                j--;
            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[l];
        arr[l]=arr[j];
        arr[j]=temp;
        return j;
    }
    
}


