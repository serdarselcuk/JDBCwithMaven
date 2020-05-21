package JDBC_Practice;

import Utility.ConfigurationReader;
import Utility.DBUtility;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestCase_Utility {

    @Test
    public void test() throws SQLException {
        ResultSet result = DBUtility.getResult("select * from employees");

        while(result.next()){

            String fullName = result.getString(2)+" "+result.getString(3);
            System.out.println(fullName);

        }
    }

    @Test
    public void test2() throws SQLException {
       ResultSet result =  DBUtility.getResult("select first_name || ' ' || last_name as fullname from employees where salary = (select max(salary) from employees)");
        result.next();
        System.out.println(result.getString(1));
    }
    @Test
    public void test3() throws SQLException {

        ResultSet result =  DBUtility.getResult("select * from employees");

        for (int i = 1; result.getMetaData().getColumnCount()>=i ; i++) {

            System.out.print("| " + result.getMetaData().getColumnLabel(i) + " |");
        }
        while (result.next()) {
            System.out.println();
            for (int i = 1; result.getMetaData().getColumnCount()>=i ; i++) {

                System.out.print("| "+result.getString(i)+" |");
                }
        }
    }
    @Test
    public void test4() throws SQLException {

//        DBUtility.toXLSX("fromJDBC.xlsx","employees");
    }
}
