import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlClass {

	public static void main(String[] args) {
		
		String url="jdbc:sqlserver://KATHALA\\SQLEXPRESS;databaseName=AdventureWorks2014;IntegratedSecurity=true;";
		
		try {
			Connection conn=DriverManager.getConnection(url);
			System.out.println("Connection successful");
			Statement st=conn.createStatement();
			String sqlquery="select * from dbo.Customer";
			ResultSet rs=st.executeQuery(sqlquery);
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"---"+rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
