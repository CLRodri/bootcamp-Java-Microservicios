package com.everis.everiseclipse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args ) throws SQLException
    {
        conexion();
    }
    
    
    private static void conexion() throws SQLException {
    	Connection conn = null;
    	String url = "jdbc:mysql//localhosthost:3306/nttdata_jdbc_ex";
    	String user = "formacion";
    	String password = "";
    	Statement st = null;
    	ResultSet rs = null;
    	String sql ="SELECT * FROM nttdata_mysql_soccer_team;";
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			st = conn.createStatement();
			rs = st.executeQuery(sql);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	
    	conn.close();
    	
    }
}
