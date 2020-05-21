package JDBC_Practice;

import java.sql.*;

public class SimpleConnection {

    public static void main(String[] args) throws SQLException {
        String  dataType ="oracle",
                host = "3.86.94.56",
                port = "1521",
                SID  = "xe";
        /*
        URL FORMULA : jdbc:dataType:thin:@host:port:SID
         */
        String url = "jdbc:"+dataType+":thin:@"+host+":"+port+":"+SID;
        Connection connection = DriverManager.getConnection(url,"hr","hr");
        Statement statement = connection.createStatement();
        ResultSet countriesTable = statement.executeQuery("select * from countries");

        while (countriesTable.next()){
            countriesTable.getString(1);
        }

    }
}
