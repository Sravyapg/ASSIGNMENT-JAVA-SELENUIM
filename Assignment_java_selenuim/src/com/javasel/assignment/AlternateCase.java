
// Code convert india to InDiA 
package com.javasel.assignment;

public class AlternateCase {
	public static void main(String[] args) {

		String s="india";


		char ch[]=s.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			if(i%2==0)
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}

	}
}

