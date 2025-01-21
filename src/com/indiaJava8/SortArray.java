package com.indiaJava8;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int arr[]={1,9,7,8,4,5,2,3};

        int temp;
        System.out.println(Arrays.toString(arr));

        for(int i =0; i <arr.length-1;i++){

            for(int j =0; j <arr.length-1;j++){

                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;

                }

            }

        }

        System.out.println(Arrays.toString(arr));

    }
}
