package week1.day1;

import java.util.Arrays;

public class SecondLarge {

	public static void main(String[] args) {
		int[] a= {3,2,11,4,6,7};
		int length=a.length;
		Arrays.sort(a);
		for(int i=length-1;i>=0;i--)
		
		{
			System.out.println(a[i]);
		}
		// TODO Auto-generated method stub
		System.out.println("the 2nd large is "+a[length-2]);

	}

}
