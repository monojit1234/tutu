package Assignment1;
public class Facebook_Main 
{
    
	public static void main(String[] args) 
	{
		String Browser,Username,Password;
		Functional_Method FM=new Functional_Method();
		Browser="Firefox"; //LUNCH ONLY IN EITHER FIREFOX OR IE(FOR IE, USE IE IN CAPS)
		Username="paulmonojit.mount@gmail.com"; //PROVIDE THE USER NAME
		Password="joygobinda"; //PROVIDE THE PASSWORD 
		FM.Login(Username, Password, Browser);

	}

}
