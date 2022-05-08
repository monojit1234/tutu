package Assignment1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class Character_Count {

	public static void main(String[] args) 
	{
		String Str="Applealkfkkuydfjkppyrjf";
		Hashtable<Character,Integer> HM=new Hashtable<Character,Integer>();
		int count=0;
		for(int i=0;i<Str.length();i++)
		{
			char C=Str.charAt(i);
			for(int j=0;j<Str.length();j++)
			{
				if(C==Str.charAt(j))
				{
					count++;
					
				}
			}
			HM.put(C, count);
			count=0;
		}
		Set<Character> k=HM.keySet();
		String res="";
		for(Character n:k)
		{
			//if(HM.get(n)>1)      //If I want to show the repeated alphabet
			System.out.println(n+" "+HM.get(n));
			//System.out.println(n +"Repeating"+ );
			res=res+String.valueOf(n)+String.valueOf(HM.get(n));
			
		}
		System.out.println(res);

	}

}
