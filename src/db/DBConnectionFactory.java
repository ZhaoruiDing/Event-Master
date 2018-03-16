package db;
import db.mongodb.MongoDBConnection;
import db.mysql.MySQLConnection;
public class DBConnectionFactory {
	// This should change based on the pipeline.
	private static final String DEFAULT_DB = "mongodb";
	public static DBConnection getDBConnection(String db) {
		switch (db) {
			case "mysql": 
				return new MySQLConnection();//return new MySQLConnection();
			case "mongodb":
				return new MongoDBConnection();//return new MongoDBConnection();
			default: throw new IllegalArgumentException ("Invaild db"+db);
		
		}
	}
	
	public static DBConnection getDBConnection() {
		return getDBConnection(DEFAULT_DB);
		}
}