/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persist;

/**
 *
 * @author dyzun
 */
public abstract class DbAccessConfiguration {
	static final String DRIVER = "com.mysql.jdbc.Driver";
	
	static final String CON_URL = "jdbc:mysql://localhost:3306/4050_term";//edit to SQL Table Name
	
	static final String DB_CONNECTION_USERNAME = "root";//your username
	
	static final String DB_CONNECTION_PASSWORD = "";//your password
}