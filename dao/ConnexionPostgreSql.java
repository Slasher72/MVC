package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionPostgreSql {

private static String url = "jdbc:postgresql://172.16.99.2:5432/vpean";
private static String user = "v.pean";
private static String passwd = "peanvplpbg";
private static Connection connect;

public static Connection getInstance(){

	 if(connect == null){
		 try {
			 connect = DriverManager.getConnection(url, user, passwd);
	} catch (SQLException e) {
		     e.printStackTrace();
	}
	 }
	 return connect;

}

}