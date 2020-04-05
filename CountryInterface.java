import java.util.ArrayList;

//this class help us to implement Prototype design pattern/
public interface CountryInterface {
	
	   //this function is used to add new record in database
	 	void addNewInfo(String country_code, String country_name, String continent, float country_surfaceArea, String country_headOfState);
	 	//this function is used to get all records which have country_code, passed by user as a parameter
	 	public Country_Body getInfobyCodes(String country_code);
	 	//this function is used to get all the information against country_name, passed by user as a parameter
	 	public Country_Body getInfobyName(String country_name);
	 	//this function used to fetch all the information of countries from database  
	    public ArrayList<Country_Body> getInfo();
	    
	    
}