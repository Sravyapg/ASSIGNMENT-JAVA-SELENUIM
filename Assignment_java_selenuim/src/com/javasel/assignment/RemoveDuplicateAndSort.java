
//Java code to remove duplicate elements in array and sort the elements in ascending order
package com.javasel.assignment;

	import java.util.LinkedHashSet;
	public class RemoveDuplicateAndSort {
		public static void main(String[] args) {

			int a[]= {1,3,5,7,5,2,9,1,1,5,6,8,7,2,4,8,6,9,5,4,89,65,17};
			int temp=0;

			for(int i=0;i<a.length-1;i++) {

				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[j];
						a[j]=a[i];
						a[i]=temp;
					}
				}
			}

			LinkedHashSet<Integer> hset =  new LinkedHashSet<Integer>();	
			for(int i = 0;i<a.length;i++)
			{
				hset.add(a[i]);
			}
			Object[] arr = hset.toArray();
			for(int i = 0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}

