//JDBC API
import java.sql.*;
public class JDBCTest {
    public static void main(String[] args) throws Exception { 
        //1. Loading drivers
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2. Establishing the connection
        String url = "jdbc:mysql://localhost:3306/sampledb";
        String uname ="root";
        String pwd ="root";
        Connection con = DriverManager.getConnection(url,uname,pwd);
        if(con != null){
            System.out.println("Connection established!");
        }
        else{
            System.out.println("Connection Failed");
        }
        //3. Create Statement
        Statement st = con.createStatement();
        //4. Execute Queries
        String query = "select * from account";
        ResultSet rs = st.executeQuery(query);
        // process results
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getDouble(2)+" "+rs.getString(3));
        }
        // close the connection
        con.close();
    }
}
