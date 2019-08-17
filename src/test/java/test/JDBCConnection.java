package test;

import org.junit.Test;

import java.sql.*;

public class JDBCConnection {


        String oracleDbUrl = "jdbc:oracle:thin:@ec2-18-219-241-100.us-east-2.compute.amazonaws.com:1521:xe";
        String oracleBdUserName = "hr";
        String getOracleDbPassword = "hr";
    @Test
    public void oracleJDBC() throws SQLException {
        Connection connection= DriverManager.getConnection(oracleDbUrl,oracleBdUserName,getOracleDbPassword);

        //Statement statement=connection.createStatement();
        Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);


        ResultSet resultSet=statement.executeQuery("select * from countries");

//        while(resultSet.next()) {
//
//            System.out.println(resultSet.getString(1)+ "-"+resultSet.getString("country_name")+"-"+resultSet.getInt("region_id"));
//
//
//        }
        resultSet.next();
        System.out.println(resultSet.getRow());

         resultSet.last();
        System.out.println(resultSet.getRow());

        resultSet.last();
        int rowCount=resultSet.getRow();
        System.out.println("Number of rows :"+rowCount);

        resultSet.close();
        statement.close();
        connection.close();
    }
  @Test
    public void jdbcMetaData() throws SQLException {
      Connection connection= DriverManager.getConnection(oracleDbUrl,oracleBdUserName,getOracleDbPassword);

      //Statement statement=connection.createStatement();
      Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
 String sql="select from employee_id, last_name,job_id,salary from employees";

      ResultSet resultSet=statement.executeQuery(sql);


    //Database metadata
      DatabaseMetaData dbMetadata=connection.getMetaData();
      System.out.println("User :"+dbMetadata.getUserName());

      System.out.println("Database type: "+ dbMetadata.getDatabaseProductName());




      resultSet.close();
      statement.close();
      connection.close();
  }
}
