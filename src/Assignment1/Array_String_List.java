package Assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import org.apache.bcel.generic.IADD;
import org.openqa.selenium.WebElement;

public class Array_String_List {

	public static void main(String[] args) 
	{
		//1.List
		//2.Count of alphabets in a String
		/*3. 1
		     2 3
		     4 5 6
		     7 8 9 10 */
		//4. Fetch substring from a string which are duplicates
		
/*		double Crater_length=0.5;
		int Total=(int) (Crater_length*3);
		System.out.println(Total);*/
	   
		
		//1.LIST EXAMPLE
/*		List<Integer> IL=new ArrayList<>();  //Integer List   //List<Integer> IL=new ArrayList<Integer>();
		List<WebElement> WL=new ArrayList<WebElement>();//WebList
		List<String> SL=new ArrayList<>();  //String List
		IL.add(5);
		IL.add(10);
		IL.add(-15);
		IL.add(20);
		IL.add(25);
		//IL.add(30, 35);
		for(Integer i:IL)
		{
			
			System.out.println(i);
		}
		System.out.println("List Size is " +IL.size());*/
		
		//2 Counts of occurance of characters in string	
				/*String s="Monojit Paul @fgf@y";
				//System.out.println(s.charAt(5));
				char c;
				int i;
				for(c='A';c<='Z';c++)
				{
					int count=0;
					for(i=0;i<s.length();i++)
					{
					   char ch=s.toUpperCase().charAt(i);
					   if(ch==c)
					   {
						   count++;
					   }
					}
					if(count>0)
					{
						System.out.println(c+"count is  : " +count);
					}
				}*/
				
				//              OR
				
				/*int loop,len,aCount=0,bCount=0,cCount=0,dCount=0,eCount=0,fCount=0,gCount=0,hCount=0,iCount=0,jCount=0,kCount=0,lCount=0,mCount=0,nCount=0,oCount=0,pCount=0,qCount=0,rCount=0;
				int sCount=0,tCount=0,uCount=0,vCount=0,wCount=0,xCount=0,yCount=0,zCount=0;
				len=s.length();
				for(loop=0;loop<len;loop++)
				{
					switch(s.substring(loop,loop+1).toUpperCase())
					{
						case "A": aCount++;
								  break;
						case "B": bCount++;
						          break;
						case "C": cCount++;
						          break;
						case "D": dCount++;
						          break;
						case "E": eCount++;
						          break;
						case "F": fCount++;
						          break;
						case "G": gCount++;
					    		  break;
						case "H": hCount++;
						    		break;
						case "I": iCount++;
						    break;
						case "J": jCount++;
						    break;
						case "K": kCount++;
						    break;
						case "L": lCount++;
						    break;
						case "M": mCount++;
						          break;
						case "N": nCount++;
						          break;
						case "O": oCount++;
						          break;
						case "P": pCount++;
						          break;
						case "Q": qCount++;
						          break;
						case "R": rCount++;
						          break;
						case "S": sCount++;
				          break;
						case "T": tCount++;
						          break;
						case "U": uCount++;
						          break;
						case "V": vCount++;
						          break;
						case "W": wCount++;
						          break;
						case "X": xCount++;
						          break;
						case "Z": zCount++;
				          break;
					}
				}
				System.out.println("icount"+iCount);
				System.out.println("jcount"+jCount);
				System.out.println("mcount"+mCount);
				System.out.println("ncount"+nCount);
				System.out.println("tcount"+tCount);
				System.out.println("ocount"+oCount);
				if(aCount>0)
				{
					System.out.println("a's count is "+aCount);
				}
				if(bCount>0)
				{
					System.out.println("b's count is "+bCount);
				}
				if(cCount>0)
				{
					System.out.println("c's count is "+cCount);
				}
				if(dCount>0)
				{
					System.out.println("d's count is "+dCount);
				}
				if(eCount>0)
				{
					System.out.println("e's count is "+eCount);
				}
				if(fCount>0)
				{
					System.out.println("f's count is "+fCount);
				}
				if(gCount>0)
				{
					System.out.println("g's count is "+gCount);
				}
				if(hCount>0)
				{
					System.out.println("h's count is "+hCount);
				}
				if(iCount>0)
				{
					System.out.println("i's count is "+iCount);
				}
				if(jCount>0)
				{
					System.out.println("j's count is "+jCount);
				}
				if(kCount>0)
				{
					System.out.println("k's count is "+kCount);
				}
				if(lCount>0)
				{
					System.out.println("l's count is "+lCount);
				}
				if(mCount>0)
				{
					System.out.println("m's count is "+mCount);
				}
				if(nCount>0)
				{
					System.out.println("n's count is "+nCount);
				}
				if(oCount>0)
				{
					System.out.println("o's count is "+oCount);
				}
				if(pCount>0)
				{
					System.out.println("p's count is "+pCount);
				}
				if(qCount>0)
				{
					System.out.println("q's count is "+qCount);
				}
				if(rCount>0)
				{
					System.out.println("r's count is "+rCount);
				}
				if(sCount>0)
				{
					System.out.println("s's count is "+sCount);
				}
				if(tCount>0)
				{
					System.out.println("t's count is "+tCount);
				}if(uCount>0)
				{
					System.out.println("u's count is "+uCount);
				}if(vCount>0)
				{
					System.out.println("v's count is "+vCount);
				}if(wCount>0)
				{
					System.out.println("w's count is "+wCount);
				}if(xCount>0)
				{
					System.out.println("x's count is "+xCount);
				}if(yCount>0)
				{
					System.out.println("y's count is "+yCount);
				}
				if(zCount>0)
				{
					System.out.println("z's count is "+zCount);
				}
				*/
				
		/*//3. 
				
				int num=9,i,j;
				int no=0;
				for(i=1;i<num/2;i++)
				{
					
					String res="";
					for(j=1;j<=i & no<num;j++)
					{
						no++;
						res=res+" "+String.valueOf(no);
					}
					System.out.println(res);
				}
				*/
		
		
		  //String to character array
/*		  String N="Monojit Paul";
		  char A[]=N.toCharArray();
		  char B[]=new char[10];
		  for(int i=0;i<A.length-5;i++)
		  {
			  B[i]=A[i];
		  }
		  System.out.println(B);  //In Array
		  String S=String.valueOf(B);//Converted the char array back to String
		  System.out.println(S);*/
		HashMap<Character,Integer> HM=new HashMap<Character,Integer>();
		  String str="Monojit";
		  int len=str.length();
		  int i,coun=0;
		  for(i=0;i<len;i++)
		  {
			  char c=str.charAt(i);
			  for(int j=0;j<len;j++)
			  {
				  if(c==str.charAt(j))
				  {
					  coun++;
					 
				  }
				  
			  }
			  
			  HM.put(c, coun);
			  coun=0;
		  }
		  Set<Character> k=HM.keySet();
			
			for(Character n:k)
			{
				if(HM.get(n)>1)      
				{
				   System.out.println(n+" " +"Repeating"+" "+ HM.get(n));
				}
				
			}
		

	}

}
