package Assignment1;

import java.util.Scanner;

public class Max_value_in_array 
{

	public static void main(String[] args) 
	{
		int a[] =new int[20],n,r=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		n=s.nextInt();
		System.out.println("Inert "+n +" numbers in the array" );
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("The numbers in the array" );
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]>r)
			{
				r=a[i];
			}
		}
		System.out.println("The heighest number is " +r );
		for(int i=0;i<n;i++)
		{
			int min=a[i];
			for(int j=i+1;j<n;j++)
			{
			     if(min>a[j])
			     {
				   min=a[j];
			     }
			}
			System.out.println("The lowest number is " +min );
			break;
		}
		
	}

}
