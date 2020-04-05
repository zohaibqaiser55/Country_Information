import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CountryInterfaceImpl implements CountryInterface{
	 //create object of Connection
    Connection conn;
    
    public CountryInterfaceImpl()
	{
    	//create object of Class which basically used to connect with MySql
	    SqlConnectionClass obj=new SqlConnectionClass();
	    conn=obj.getConnection();
	}
    
  //this override function is used to add new record in database
  	@Override
  	public void addNewInfo(String C_code, String C_name, String C_continent, float C_surfaceArea, String C_headOfState) {
  		try {
  		//This query will be used to Enter the data in the data base
		String Query = "insert into country(Code,Name,Continent,SurfaceArea,HeadOfState) values (" + C_code +", '"+C_name+ ", '"+C_continent +", '"+C_surfaceArea+", '" +C_headOfState+"')";
		//Entering the Data in the Data Base
		PreparedStatement preparedStatement = conn.prepareStatement(Query);
		//Passing the Information (that user Entered) so can be used in above query.
		preparedStatement.setString(1,C_code);
		preparedStatement.setString(2,C_name);
		preparedStatement.setString(3,C_continent);
		preparedStatement.setFloat(4,C_surfaceArea);
		preparedStatement.setString(5,C_headOfState);
		
		
		int res=preparedStatement.executeUpdate();
          if(res>0){
 	            System.out.println("Country Added Successfully ");
          }
  			
  			}catch (SQLException e) {
  					e.printStackTrace();
  			}
  		}
  	
  //this function is used to get All information against Country_Name which is passed by user as a parameter.
  	@Override
	public Country_Body getInfobyName(String country_name) {
		// TODO Auto-generated method stub
		
		 Country_Body countryOBJ= null;
		try {
			
			//conn = DriverManager.getConnection(connectionString, user, password);
			String query = "select * from country";
	        PreparedStatement preparedStatement = conn.prepareStatement(query);
	        ResultSet rs = preparedStatement.executeQuery();     
	        while(rs.next())
	        {
	        	if(rs.getString("Name").equals(country_name))
                {
	        		String code=rs.getString("Code");
                    String name=rs.getString("Name");
                    String continent=rs.getString("continent");
                    Float surfaceOfArea=rs.getFloat("SurfaceArea");
                    String headOfState=rs.getString("HeadOfState");
                    countryOBJ = new Country_Body(code,name,continent,surfaceOfArea,headOfState);
                }  
	        }
	      
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return countryOBJ;
		
	}
	@Override
	public ArrayList<Country_Body> getInfo() {
		// TODO Auto-generated method stub
		
		
		// CREATE THE ARRAYLIST TO PUT ALL THE Country_BodyS
				// THAT ARE GOING TO BE RETURNED
				ArrayList<Country_Body> Country_Bodys = new ArrayList<Country_Body>();				
				// QUERYING THE DATABASE
				String query = "select * from country";
				// ACCESSING THE DATABASE
				
		        PreparedStatement preparedStatement;
				try {
					preparedStatement = conn.prepareStatement(query);
					ResultSet rs = preparedStatement.executeQuery();  
					while( rs.next() ) {
						// FOR EACH ONE OF THE VALUES, WE WANT TO
						// GET THE ATTRIBTUES
						String country_code=rs.getString("Code");
	                    String country_name=rs.getString("Name");
	                    String country_continent=rs.getString("continent");
	                    Float country_surfaceArea=rs.getFloat("SurfaceArea");
	                    String country_headOfState=rs.getString("HeadOfState");
						
						Country_Bodys.add(new Country_Body(country_code,country_name, country_continent,country_surfaceArea,country_headOfState));	
					}
					
			
					} catch (SQLException e1) {
					e1.printStackTrace();
				}
		             
				// RETURN THE ARRAYLIST WITH ALL THE Country_BodyS
				return Country_Bodys;
	}
	@Override
	public Country_Body getInfobyCodes(String country_code) {
		// CREATING THE OBJECT THAT WE'RE GOING TO RETURN
					Country_Body ctryb = null;
					// THIS METHOD IS IN CHARGE OF CREATING THE QUERY
					
					String query = "select * from country";
			        PreparedStatement preparedStatement;
					try {
						preparedStatement = conn.prepareStatement(query);
												
						// QUERYING THE DATABASE
				        ResultSet rs = preparedStatement.executeQuery();     
						// WITH THE RESULT GET THE DATA AND PUT IT IN THE INSTANCE 
						// OF CUSTOMER
						
						while( rs.next() ) {
							// FOR EACH ONE OF THE VALUES, WE WANT TO
							if(rs.getString("Code").equals(country_code))
				            {
							// GET THE ATTRIBTUES
							String country_codes=rs.getString("Code");
				            String country_name=rs.getString("Name");
				            String country_continent=rs.getString("continent");
				            Float country_surfaceArea=rs.getFloat("SurfaceArea");
				            String country_headOfState=rs.getString("HeadOfState");
				            ctryb = new Country_Body(country_codes,country_name, country_continent,country_surfaceArea,country_headOfState);
				            break;
				            }
						}
							
							
					}catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					// RETURN THE CUSTOMER 
					return ctryb;	
	}
	

		
	
}

