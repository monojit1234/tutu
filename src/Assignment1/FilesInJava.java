package Assignment1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FilesInJava {

	public static void main(String[] args) throws IOException 
	{
		//CREATING OF FILE
		
		/*File f=new File("D:\\JavaFileCreation"+"\\"+"File1.txt");   //This is used to open the file if the file present.
		f.createNewFile(); //It returns boolean variable and so we can print some message
		*/
		
		//CREATING DIRECTORY OR FOLDER   OUTPUT: A folder name DIRECTORY created
		/*File f=new File("D:\\JavaFileCreation"+"\\"+"DIRECTORY");
		f.mkdir();*/
		
		
		//CREATIG OF FILE USING FILEWRITER
		//FileWriter fw=new FileWriter("D:\\JavaFileCreation"+"\\"+"File2.xlsx");     
		//Basically it is used to write something in the file and at the same if the file defined is not present will create it.
		
		//This is the actual method to creat a excel file
		FileOutputStream fip=new FileOutputStream("D:\\JavaFileCreation"+"\\"+"File2.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet S=wb.createSheet("Test");
		wb.write(fip);
		fip.close();
		
		//TEXT FILE READING CHARACTERWISE
		//================================
		
		/*File fr=new File("D:\\JavaFileCreation"+"\\"+"File1.txt");   //This is used to open the file if the file present.
		FileReader FR=new FileReader(fr);
		int c;
		while((c=FR.read())!=-1)
		{
			System.out.println((char)c);
		}*/
		
		
		//TEXT FILE READING LINEWISE
		//============================
		
		/*File fr=new File("D:\\JavaFileCreation"+"\\"+"File1.txt");   //This is used to open the file if the file present.
		FileReader FR=new FileReader(fr);
		BufferedReader BR=new BufferedReader(FR);
		String c;
		//c=BR.readLine();
		//System.out.println(c);  //This will only print 1st line if we don't use while loop
		while((c=BR.readLine())!=null)
		{
			System.out.println(c);
		}*/
		
		
		//TEXT FILE READING CHARACTERWISE USING FILEINPUTSTREAM
		//======================================================
		
		/*File fr=new File("D:\\JavaFileCreation"+"\\"+"File1.txt");   //This is used to open the file if the file present.
		FileInputStream FIS=new FileInputStream(fr);
		
		int c;
		while((c=FIS.read())!=-1)
		{
			System.out.println((char)c);
		}*/
		
		//TEXT FILE READING LINEWISE USING FILEINPUTSTREAM WHICH IS USED TO READ BOTH BINARY AND TEXT FILE
		//================================================================================================
		
				/*File fr=new File("D:\\JavaFileCreation"+"\\"+"File1.txt");   //This is used to open the file if the file present.
				FileInputStream FIS=new FileInputStream(fr);
				
				// Use this for reading the data.
	            byte[] buffer = new byte[1000];
				int c ,bytes=0;
				while((c=FIS.read(buffer))!=-1)
				{
				
					System.out.println(new String(buffer));	
					bytes++;
				}
				
				System.out.println("Total bytes:"+" "+bytes);	*/
				
				
				
				
				
		
		//CREATING A FILE AND WRITE SOMETHING
		//====================================
		
/*		FileWriter fw=new FileWriter("D:\\JavaFileCreation"+"\\"+"File3.txt");
		BufferedWriter BW=new BufferedWriter(fw);   //This line is optional
		String Da="This is file2 where I am writing something";
		BW.write(Da);
		BW.close();   //This line is required
		System.out.println("Writing Completed Successfully");*/
		
		
		//WRITE SOMETHING USING FILEOUTPUTSTREAM. AND LIKEWISE FILEWRITER ,FILEOUTPUTSTREAM ALSO CREATE A FILE IF IT IS NOT PRESENT
		//=======================================================================================================
		
		/*File fr=new File("D:\\JavaFileCreation"+"\\"+"File2.txt");
		String Da1="This is textfile where i am wiriting something";
		byte[] buffer = Da1.getBytes();  //To write using fileoutputstream we have convert into byte.
		FileOutputStream FOS=new FileOutputStream(fr);
		FOS.write(buffer);
		System.out.println("Writing Completed Successfully");*/
		
		//Creating xl file
       /*File fr=new File("D:\\JavaFileCreation"+"\\"+"Excel.xlsx");
		FileOutputStream FOS=new FileOutputStream(fr);*/
		
		//APPENDING TEXT TO EXISTING FILE USING FILEWRITER
		//=================================================
		
		/*FileWriter fw=new FileWriter("D:\\JavaFileCreation"+"\\"+"File2.txt",true);  //True will append the text
		BufferedWriter BW=new BufferedWriter(fw);
		String Da="This is a girl";
		BW.write("%s\r\n"); //This allows to enter text from next line
		BW.write(Da);
		BW.close();
		System.out.println("Writing Completed Successfully");*/
		
		//APPENDING TEXT TO EXISTING FILE FROM NEXTLINE USING FILEINPUTSTREAM
		//====================================================================
		
		/*File fr=new File("D:\\JavaFileCreation"+"\\"+"File2.txt");
		String Da1="This is using fileinputstream";
		byte[] buffer = Da1.getBytes();
		FileOutputStream FOS=new FileOutputStream(fr,true);
		FOS.write("\r\n".getBytes());  //IT will allow only byte type or integer
		FOS.write(buffer);
		System.out.println("Writing Completed Successfully");*/
		
	}

}
