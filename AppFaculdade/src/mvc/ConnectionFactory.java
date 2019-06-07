package mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/faculdade?useTimezone=true&serverTimezone=UTC",
					"root", "94353682");
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

}