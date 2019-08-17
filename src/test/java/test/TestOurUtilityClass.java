package test;

import utilities.Config;
import utilities.DBUtility;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class TestOurUtilityClass {
    public static void main(String[] args) throws SQLException {
        DBUtility.openConnection(Config.getProperty("dbType"));

        List<Map<String,Object>> table=DBUtility.executeSQL("select * from employees");

        System.out.println("Size of my table :"+table.size());

        for(Map<String,Object> m:table){

            System.out.println(m.get("FIRST_NAME")+ " "+m.get("LAST_NAME")+" "+m.get("SALARY"));
        }
        DBUtility.closeConnection();

    }
}
