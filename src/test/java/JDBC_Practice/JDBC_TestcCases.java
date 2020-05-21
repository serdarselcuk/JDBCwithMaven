/*
package JDBC_Practice;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class JDBC_TestcCases {
    Connection connection;
    Statement statement;


    @BeforeMethod
    public void setUp() throws SQLException {
        String  dataType ="oracle",
                host = "3.86.94.56",
                port = "1521",
                SID  = "xe";
        */
/*
        URL FORMULA : jdbc:dataType:thin:@host:port:SID
         *//*

        String url = "jdbc:"+dataType+":thin:@"+host+":"+port+":"+SID;
        connection = DriverManager.getConnection(url,"hr","hr");
        statement = connection.createStatement();

    }

    @Test(description = "verify seyfo's salary is greater than messi")
    public void test1()throws SQLException {

        ResultSet salaryTable = statement.executeQuery("select * from testers");

        Map<String,Integer>salaries = new LinkedHashMap<String, Integer>();

        while(salaryTable.next()){
            salaries.put(salaryTable.getString(2),salaryTable.getInt(3));

        }
        Assert.assertTrue(salaries.get("Seyfo")>salaries.get("Hakan"));

    }
}
*/
