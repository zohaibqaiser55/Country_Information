import java.util.ArrayList;
import java.util.Scanner;

public class MenuBackEnd {
	
	static CountryInterface dao = new CountryInterfaceImpl();
	//Scanner is used to take input from user
	static Scanner in =new Scanner(System.in);
	//This variable will take in the user choice in INT form
	int input=in.nextInt();
		
	
	public static void option_1() {
		
		//this show all the information of all countries if user required:
		//dao.getInfo();
		
		ArrayList<Country_Body> country = dao.getInfo();
		
		// PRINTING THEM TO THE CONSOLE
		for (Country_Body c : country) {
			System.out.println(c);
		}
		
	}
	
	public static void option_2() {
		
		//Insert new Country record in database 
		System.out.print(" - Enter a Code Based on 3 Letters :");
		String C_code=in.next();
		System.out.print(" - Enter the Name of the Country :");
		String C_name=in.next();
		System.out.print(" - Enter the Continent for the Country :");
		String C_continent=in.next();
		System.out.print(" - Enter the Value of surface Area :");
		Float C_area=in.nextFloat();
		System.out.print(" - Enter the Name of HeadOfState :");
		String C_head=in.next();
		dao.addNewInfo(C_code, C_name,C_continent, C_area, C_head);
		}
		
	public static void option_3() {
		//this will be show us Country Information against country name 
		System.out.println(" - Enter the Name of Country (Note : Case sensitive) ");
		String C_names=in.next();
		System.out.println(dao.getInfobyName(C_names));
		
		
	}
	
	public static void option_4() {
		//this will show us Country Information against country Code:
		System.out.println("Enter Country name to retrieve Information, only contains 3 letter: ");
		//holding the code, Entered by user
		String C_codes=in.next();
		//Printing the data of the country against the entered Code
		System.out.println(dao.getInfobyCodes(C_codes)	);
		
	}


}
