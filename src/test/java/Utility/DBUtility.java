package Utility;
import java.sql.*;
public class DBUtility {


    private static Connection connection;
    private static Statement statement;
    public static DatabaseMetaData metadata;
    static {
        try {
            String  username =ConfigurationReader.getConfig("JDBC_Name"),
                    password =ConfigurationReader.getConfig("JDBC_Password"),
                    url = ConfigurationReader.getConfig("JDBC_Url");
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            metadata = connection.getMetaData();


        }catch(Exception e) { }
    }
    public static ResultSet getResult(String sql) {
        // creates the result
        ResultSet result = null;
        try {
            result = statement.executeQuery(sql);
        }catch(Exception e) {}
        return result;
    }
    public static void tearDown() {
        // closes the connection at the last step
        try {
            connection.close();
        }catch(Exception e) { }
    }
    public static void UpdateQuery(String sql) {
        // INSERT, UPDATE, , DELETE, ALTER, TRUNCATE, DROP
        try {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
        }
    }
/*
    public static void toXLSX(String path,String dataTable) throws SQLException {

        ResultSet result =  getResult("select * from "+dataTable);


        XLSX_Writer xlsx = new XLSX_Writer();
        xlsx.XLSX_Write(path,dataTable);

        int xlsxRowNum = 0; // to iterate all the rows while result.next() iterating
        while (result.next()) {
            for (int i = 1; result.getMetaData().getColumnCount()>=i ; i++) {// this line will write all the row before "result.next() executed again
                int columnOfXlsx = i-1;
                if( xlsxRowNum==0){
                    xlsx.setValueToCells(result.getMetaData().getColumnLabel(i),0,columnOfXlsx);
                }
                else{
                    xlsx.setValueToCells(result.getString(i),xlsxRowNum,columnOfXlsx);
                }
            }
            xlsxRowNum++;// after whole column writen paaing the next row
        }

    }*/

}