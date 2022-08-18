package anudip.org;
public class Class {
void start()
{
	System.out.println("start method call");
}
void displayInstruction()
{
	System.out.println("displayInstruction call");
	
}
void exit()
{
	System.out.println("exit method call");
}
public static void main(String[] args)
{
	Class obj=new Class();
	int menuInput=7;
	switch(menuInput)
	{
	case 1:
		obj.start();
		break;
	case 2:
		obj.displayInstruction();
		break;
	case 3:
		obj.exit();
		break;
	default:
		System.out.println("Not a valid menu input");
	}
	
	
}
}
