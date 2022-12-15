package org.example.utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DB_Util {


    // declaring at class level so all methods can access
    private static Connection con ;
    private static Statement stmt;
    private static ResultSet rs ;
    private static ResultSetMetaData rsmd ;


    /**
     * Create Connection by jdbc url and username , password provided
     * @param url  jdbc url for any database
     * @param username username for database
     * @param password password for database
     */
    public static void createConnection(String url , String username, String password){

        //Codes

    }




    /**
     * Run the sql query provided and set the
     * Statement, ResultSet, ResultSetMetaData object value
     * for all other methods to use
     * this method does not need to return ResultSet object
     * since  we already have methods to handle returning values
     * @param sql the query to run
     */
    public static void runQuery(String sql){

        //Codes

    }

    /**
     * destroy method to clean up all the resources after being used
     */
    public static void destroy(){

        //Codes

    }

    /**
     * This method will reset the cursor to before first location
     */
    private static void resetCursor(){

        //Codes
    }

    /**
     * find out the row count
     * @return row count of this ResultSet
     */
    public static int getRowCount(){

        //Codes

    }


    /**
     * find out the column count
     * @return column count of this ResultSet
     */
    public static int getColumnCount(){

        //Codes

    }



    /**
     * // Get all the Column names into a list object
     * @return  List<String>
     */
    public static List<String> getAllColumnNamesAsList(){

        //Codes

    }

    // get entire row of data according to row number

    /**
     * Getting entire row of data in a List of String
     * @param rowNum row number to get as a list
     * @return row data as List of String
     */
    public static List<String> getRowDataAsList( int rowNum ){

        //Codes

    }



    /**
     * getting the cell value according to row num and column index
     * @param rowNum  row number to get the data from
     * @param columnIndex column number to get the data from
     * @return the value in String at that location
     */
    public static String getCellValue(int rowNum , int columnIndex) {

        //Codes

    }

    /**
     * getting the cell value according to row num and column name
     * @param rowNum  row number to get the data from
     * @param columnName column Name to get the data from
     * @return the value in String at that location
     */
    public static String getCellValue(int rowNum ,String columnName){

        //Codes

    }


    /**
     * Get First Cell Value at First row First Column
     */
    public static String getFirstRowFirstColumn(){

        return getCellValue(1,1) ;

    }

    /**
     * Get First Cell Value at First row First Column
     * @return as number
     */
    public int getFirstCellAsInt(){
        return Integer.parseInt(getCellValue(1,1) );
    }

    //

    /**
     * getting entire column data as list according to column number
     * @param columnNum column number to get all data
     * @return List object that contains all rows of that column
     */
    public static List<String> getColumnDataAsList(int columnNum){

        //Codes

    }

    /**
     * getting entire column data as list according to column Name
     * @param columnName column name to get all data
     * @return List object that contains all rows of that column
     */
    public static List<String> getColumnDataAsList(String columnName){

        //Codes

    }


    /**
     * display all data from the ResultSet Object
     */
    public static void  displayAllData(){

        //Codes

    }

    /**
     * Save entire row data as Map<String,String>
     * @param rowNum row number
     * @return Map object that contains key value pair
     *      key     : column name
     *      value   : cell value
     */
    public static Map<String,String> getRowMap(int rowNum){

        //Codes

    }
    /**
     * We know how to store one row as map object
     * Now Store All rows as List of Map object
     * @return List of Map object that contain each row data as Map<String,String>
     */
    public static List<Map<String,String>> getAllRowAsListOfMap(){

        //Codes

    }

}
