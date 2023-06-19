package com.gfg.Tcs.Arrays;

import java.util.Scanner;

public class RotateLeft {

	public static void RotateLeft(int arr[],int n,int k) {
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		reverse(arr,0,n-1);
	}
	
	public static void reverse(int arr[],int start,int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		RotateLeft(arr,n,k);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
