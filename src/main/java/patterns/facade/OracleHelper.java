package patterns.facade;

import java.sql.Connection;

/**
 * Created by Artyom on 11/5/2015.
 */
public class OracleHelper {

    public static Connection getOracleDBConnection(){
    //get MySql DB connection using connection parameters
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }

    public void generateOracleHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }
}
