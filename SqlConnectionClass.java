import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SqlConnectionClass {

		//set connection of Database
		//52.50.23.197
		private String address  ="jdbc:mysql://52.50.23.197/world";
		// where user is cctstudent
		private String user = "cctstudent";
		//password of Pass1234!
		private String password="Pass1234!";
		//creating object of Connection 
		private Connection connect;
		
		public Connection getConnection()
	{   
			//putting the connection statement in try catch as things could go wrong so, its better to use it to get exception in case something went wrong
	 		try{
	 			
	 			// Get a connection to the database
	 			connect = DriverManager.getConnection(address, user, password);

	 			connect.createStatement();
	 			return connect;	 
	 		}
	 		catch( SQLException se ){
	 			System.out.println( "SQL Exception:" ) ;

	 			// Loop through the SQL Exceptions
	 			while( se != null ){
	 				System.out.println( "State  : " + se.getSQLState()  ) ;
	 				System.out.println( "Message: " + se.getMessage()   ) ;
	 				System.out.println( "Error  : " + se.getErrorCode() ) ;

	 				se = se.getNextException() ;
	 			}
	 		}
	 		catch( Exception e ){
	 			System.out.println( e ) ;
	 		}
	 		return null;	  
	}
		public void closing() {
			try {
				connect.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
