package pl.coderslab.models;

import pl.coderslab.utils.BCrypt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class User {
	
	protected int id;
	private String username;
	private String password;
	private String email;
	private int user_group_id;
	
	public User (String username, String email, String password, int user_group_id) {
		this.username = username;
		this.email = email;
		this.setPassword(password);
		this.user_group_id = user_group_id;

	}
	
	public User() {
		
	}
	
	public void saveToDB(Connection conn) throws SQLException {
		
		if (this.id == 0) {
			String sql = "INSERT INTO Users(username, email, password, user_group_id ) VALUES (?, ?, ?, ?)";
			String generatedColumns[] = { "ID" };
			PreparedStatement preparedStatement;
			preparedStatement = conn.prepareStatement(sql, generatedColumns);
			preparedStatement.setString(1, this.username);
			preparedStatement.setString(2, this.email);
			preparedStatement.setString(3, this.password);
			preparedStatement.setInt(4, this.user_group_id);
			preparedStatement.executeUpdate();
			ResultSet rs = preparedStatement.getGeneratedKeys();
			if (rs.next()) {
				this.id = rs.getInt(1);
			} 
		} else {
			String sql2 = "UPDATE Users SET username=?, email=?, password=? , user_group_id = ? where id = ?";
			PreparedStatement preparedStatement2;
			preparedStatement2 = conn.prepareStatement(sql2);
			preparedStatement2.setString(1, this.username);
			preparedStatement2.setString(2, this.email);
			preparedStatement2.setString(3, this.password);
			preparedStatement2.setInt(4, this.user_group_id);
			preparedStatement2.setInt(5, this.id);
			preparedStatement2.executeUpdate();		
		}
	}
	
	static public User loadUserById(Connection conn, int id) throws SQLException {
		
		String sql = "SELECT * FROM Users where id=?";
		PreparedStatement preparedStatement;
		preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			User loadedUser = new User();
			loadedUser.id = resultSet.getInt("id");
			loadedUser.username = resultSet.getString("username");
			loadedUser.password = resultSet.getString("password");
			loadedUser.email = resultSet.getString("email");
			loadedUser.user_group_id = resultSet.getInt("user_group_id");
			return loadedUser;
		}
		return null;
	}
	
	static public User[] loadAllUsers(Connection conn) throws SQLException {
		
		ArrayList<User> users = new ArrayList<User>();
		String sql = "SELECT * FROM Users"; PreparedStatement preparedStatement;
		preparedStatement = conn.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			User loadedUser = new User();
			loadedUser.id = resultSet.getInt("id");
			loadedUser.username = resultSet.getString("username");
			loadedUser.password = resultSet.getString("password");
			loadedUser.email = resultSet.getString("email");
			loadedUser.user_group_id = resultSet.getInt("user_group_id");
			users.add(loadedUser);
		}
		User[] uArray = new User[users.size()]; 
		uArray = users.toArray(uArray);
		return uArray;
	}
	
	static public User[] loadAllUsersByGroupId(Connection conn, int id) throws SQLException {
		
		ArrayList<User> users = new ArrayList<User>();
		String sql = "SELECT * FROM Users WHERE user_group_id = ?"; 
		PreparedStatement preparedStatement;
		preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setInt(1,id);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			User loadedUser = new User();
			loadedUser.id = resultSet.getInt("id");
			loadedUser.username = resultSet.getString("username");
			loadedUser.password = resultSet.getString("password");
			loadedUser.email = resultSet.getString("email");
			loadedUser.user_group_id = resultSet.getInt("user_group_id");
			users.add(loadedUser);
		}
		User[] uGroupArray = new User[users.size()]; 
		uGroupArray = users.toArray(uGroupArray);
		return uGroupArray;
	}
	
	public void delete(Connection conn) throws SQLException {
		if (this.id != 0) {
			String sql = "DELETE FROM Users WHERE id= ?";
			PreparedStatement preparedStatement;
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, this.id);
			preparedStatement.executeUpdate();
		this.id=0;
		}
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = BCrypt.hashpw(password, BCrypt.gensalt());
	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getGroup() {
		return user_group_id;
	}
	
	public void setGroup(int user_group_id) {
		this.user_group_id = user_group_id;
	}
	
}
