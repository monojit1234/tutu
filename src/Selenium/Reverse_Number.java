package Selenium;

public class Reverse_Number {

	public static void main(String[] args) 
	{
		//REVERSE
		int n=12346;
		/*int rev=0;
		while(n!=0)
		{
			rev=rev*10;
			rev=rev+(n%10);
			n=n/10;
		}

		System.out.println(rev);*/
		
		//SUM OF DIGIT
		int sum=0;
		while(n!=0)
		{
			
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println(sum);
	}

}
