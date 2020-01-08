



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author PRATIK
 */
public class Consoleapp {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/consoledata";
        String uname = "root";
        String pwd = "0000";
        String query = "select * from asgaurd";
        //Class.forName("com.mysql.jdbc.Driver");
        try{
            try (Connection con = DriverManager.getConnection(url,uname,pwd)) {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);
                
                while(rs.next())
                {
                    System.out.println("Username: "+rs.getString(1)+" Field: "+rs.getString(2));
                }
                
                st.close();
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception "+e);
        }
    }
    
}
