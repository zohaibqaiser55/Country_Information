
import java.util.Scanner;


public class CountryMain {
	 	
		//Scanner is used to take input from user
		static Scanner in =new Scanner(System.in);
		//This variable will take in the user choice in INT form
		int input=in.nextInt();
	
	public static void main(String[] args) {
	
		//This will be used by the loop 
		String repeat="y";
		//This loop will be used to make sure that the program keep running after performing some function
		//as long as user don't want to quit
		while(repeat.equals("y"))
		{
			System.out.println("----------------------");
			System.out.println(" -  Welcome - ");
            System.out.println("----------------------");
            System.out.println("(1- Information about ALL stored Countries");
            System.out.println("(2- Add new RECORD for a Country");
            System.out.println("(3- Get information by Country NAME");
            System.out.println("(4- Get information by Country CODE");
            System.out.println("----------------------");
            System.out.print("Please enter a number:");
			
			//This variable will take in the user choice in INT form
			int input=in.nextInt();
			System.out.print(input);
			
			//****For Selection for Menu If else statements are being used
			
			//(1) Information about ALL stored Countries
			if(input==1){
				MenuBackEnd.option_1();
			}
			
			//(2) Add new RECORD for a Country
			else if(input==2){
				MenuBackEnd.option_2();
			}
			
			//3- Get information by Country NAME
			else if(input==3)
			{
				MenuBackEnd.option_3();
			}
			
			//4- Get information by Country CODE
			else if(input==4)
			{
				MenuBackEnd.option_4();
			}
			
			else
			{
				//If the choice  is not correct than it show this error by default:
				System.out.println("- Error ");
				System.out.println(" - Kindly Select From the Provided Choices");

			}
			
			//It will Repeat the whole process for performing any asked task
			System.out.println("----------------------");
			System.out.println(" - Would you like to Start again y or n :");
			repeat=in.next();
			
		}
		//Goodbye Message
		System.out.println(" - GooD bye - Stay Home - And Stay Safe - ");
		
		
		
	}


}
