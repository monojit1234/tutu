package Selenium;

public class Assignment1 
{
    
	public static void main(String[] args) 
	{
		Methods FM=new Methods();
		String Browser,Username,Password;
		Browser="Firefox"; 								//LUNCH ONLY IN EITHER FIREFOX OR IE(FOR IE, USE IE IN CAPS)
		Username="paulmonojit.mount@gmail.com"; 									//PROVIDE THE USER NAME
		Password="Joygobinda@123"; 									//PROVIDE THE PASSWORD 
		FM.Login(Username, Password, Browser);
		System.out.println("Execution Completed");

	}

}
