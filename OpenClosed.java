package com.company;


class Array{
    public void sort(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
}
class DesArray{
    public void sort(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
}

public class OpenClosed {

    public static void main(String[] args) {
        int arr[]={1,6,5,3,4};
        int i;
        Array ar=new Array();
        ar.sort(arr);
        System.out.println("values in the arrays are");
        for( i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
	// write your code here
    }
}
