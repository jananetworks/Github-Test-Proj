import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Testpost 
{

	public static void main(String[] args)
	{
		try
		{
			{
				Class.forName("org.postgresql.Driver");
				Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gopi","postgres","1jana");
				System.out.println("open database successfully");
				Statement st=con.createStatement();
				String sql="insert into employee(id,name,age,address)"+"values(9,'karthik',55,'salem');";
				st.executeUpdate(sql);
				/*PreparedStatement ps=con.prepareStatement("insert into Test.emp(id,name,age,address) values(?,?,?,?)");
				ps.setInt(1, 3);
				ps.setString(2, "kannan");
				ps.setInt(3, 25);
				ps.setString(4, "salem");
				ps.executeUpdate();*/
				System.out.println("success");
			}		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
