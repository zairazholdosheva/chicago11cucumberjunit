package test;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseExample {
    public static void main(String[] args) {
        // url:  ec2-18-219-241-100.us-east-2.compute.amazonaws.com
        // username: hr
        // password: hr
        /*
        *
        | first_name    | last_name |
        | Ellen         | Abel      |
        *
        | first_name    | last_name |
        | Sundar        | Ande      |
        *
        | first_name    | last_name |
        | Mozhe         | Atkinson  |
​* */
        Map<String, Object> map1 = new HashMap<>();
        map1.put("first_name", "Ellen");
        map1.put("last_name", "Abel");

        Map<String, Object> map2 = new HashMap<>();
        map2.put("first_name", "Sundar");
        map2.put("last_name", "Ande");

        Map<String, Object> map3 = new HashMap<>();
        map3.put("first_name", "Mozhe");
        map3.put("last_name", "Atkinson");

        List<Map<String, Object>> table = new ArrayList<>();
        table.add(map1);
        table.add(map2);
        table.add(map3);

        for (Map<String, Object> map : table) {
            System.out.println(map.get("first_name") + " " + map.get("last_name"));
        }

System.out.println("=================================================================");
        String oracleUrl = "jdbc:oracle:thin:@ec2-18-219-241-100.us-east-2.compute.amazonaws.com:1521:xe";
        String oracleUsername = "hr";
        String oraclePassword = "hr";

        try {
            Connection connection = DriverManager.getConnection(oracleUrl, oracleUsername, oraclePassword);
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement.executeQuery("select first_name, last_name from employees");

            ResultSetMetaData metaData = resultSet.getMetaData();

            int columnCount = metaData.getColumnCount();
            String columName = metaData.getColumnName(1);

            System.out.println("Column count: " + columnCount);
            System.out.println("Column Name: " + columName);

            List<Map<String, Object>> myTable = new ArrayList<>();

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
    }
}