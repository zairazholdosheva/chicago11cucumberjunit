package utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtility {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void openConnection(String dbType) throws SQLException {


        switch (dbType) {
            case "Oracle":
                connection = DriverManager.getConnection(Config.getProperty("oracleUrl"),
                        Config.getProperty("oracleUsername"),
                        Config.getProperty("oraclePassword"));
                break;
            default:
                connection = null;


        }
    }

    public static List<Map<String, Object>> executeSQL(String query) throws SQLException {
      statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
      resultSet = statement.executeQuery(query);
        List<Map<String, Object>> myTable = new ArrayList<>();
        try {

            ResultSet resultSet = statement.executeQuery("select * from employees");

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            String columName = metaData.getColumnName(1);

            System.out.println("Column count: " + columnCount);
            System.out.println("Column Name: " + columName);



            while (resultSet.next()) {

                Map<String, Object> map = new HashMap<>();

                for (int i = 1; i <= columnCount; i++) {
                    map.put(metaData.getColumnName(i), resultSet.getObject(i));
                }
                myTable.add(map);
            }
            for (Map<String, Object> m : myTable) {
                System.out.println(m.get("FIRST_NAME") + "==" + m.get("LAST_NAME"));
            }
        } catch (SQLException e) {
            System.out.println("Failed to open connection!");
        }
        return myTable;

    }
    public static  void closeConnection() throws SQLException {
        connection.close();
        statement.close();
        resultSet.close();
    }
}
