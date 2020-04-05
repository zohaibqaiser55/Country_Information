
//*****Reference*****
// The code from the week5.2 by Amilcar has been used as a reference(base) to generate this class
//Student name : Zohaib Qaiser.

public class Country_Body {
	
	//****Basic Variables or attributes of Country which is basically holds by Database
	//This Attribute "code" is used to hold the value of code from the provided Database
	private String code;
	//This Attribute "name" is used to hold the name of the country from the provided Database
	private String name;
	//This Attribute "continent" is used to hold the name of the continent from the provided Database
	private String continent;
	//This Attribute "surfaceArea" is used to hold the numerical value of surfaceArea from the provided Database
	private float surfaceArea;
	//And lastly This Attribute "headOfState" is used to hold the name of head state of a country from the provided Database
	private String headOfState;
	
	public Country_Body(String code, String name, String continent, float surfaceArea, String headOfState) {
		
		this.code = code;
		this.name = name;
		this.continent = continent;
		this.surfaceArea = surfaceArea;
		this.headOfState = headOfState;
	}
	@Override
	public String toString() {
		return "Country_Body [code=" + code + ", name=" + name + ", continent=" + continent + ", surfaceArea="
				+ surfaceArea + ", headOfState=" + headOfState + "]";
	}
	
		//getter and setter for Attribute "code"
	//getting the value 
	public String getCode() {
		return code;
	}
	//setting the value
	public void setCode(String code) {
		this.code = code;
	}
	
		//getter and setter for Attribute "name"
	//getting the value 
	public String getName() {
		return name;
	}
	//setting the value
	public void setName(String name) {
		this.name = name;
	}
	
		//getter and setter for Attribute "continent"
	//getting the value
	public String getContinent() {
		return continent;
	}
	//setting the value
	public void setContinent(String continent) {
		this.continent = continent;
	}
	
		//getter and setter for Attribute "surfaceArea"
	//getting the value 
	public float getSurfaceArea() {
		return surfaceArea;
	}
	//setting the value
	public void setSurfaceArea(float surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	
		//getter and setter for Attribute "surfaceArea"
	//getting the value 
	public String getHeadOfState() {
		return headOfState;
	}
	//setting the value
	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}
	

}
