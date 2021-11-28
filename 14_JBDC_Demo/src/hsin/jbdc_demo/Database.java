package hsin.jbdc_demo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import project_kassenbon.model.sortiment.Produkt;

public class Database {

	private Connection db_conn;
	private String db_server;
	private String db_database;
	private String db_host;
	
	
	/**
	 * @param db_conn
	 */
	public Database(String server, String host, String database, String user, String pw) {
		String jdbc = "jdbc:" + server + "://" + host + "/" + database;
		try {
			this.db_conn = DriverManager.getConnection(jdbc, user, pw);
			if (db_conn != null) {
				System.out.println("Connected to Database");
			} else {
				System.out.println("Connection failed");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Employee[] getEmployees() {
		String sql = "SELECT * FROM employees";
		List<Employee> employeeList = new ArrayList<>();
		PreparedStatement query;
		ResultSet resultSet;
		try {
			query = this.db_conn.prepareStatement(sql);
			resultSet = query.executeQuery();
			
			while (resultSet.next()) {
				int employee_id = resultSet.getInt("employee_id");
				String first_name = resultSet.getString("first_name");
				String last_name = resultSet.getString("last_name");
				double salary = resultSet.getDouble("salary");
				employeeList.add(new Employee(employee_id, first_name, last_name, salary));
				
				
			}
//			System.out.println(employeeList);
		} catch (SQLException e) {
			System.out.println("Exception catched during sql query");
			e.printStackTrace();
		}
		return employeeList.toArray(new Employee[0]);
	}
	
	
	public void insertEmployee(Employee employee) {
		String sql = "INSERT INTO employees (employee_id, first_name, last_name, email, hire_date, job_id, salary) VALUES(?,?,?,?,?,?,?)";
		try {
			PreparedStatement statement =db_conn.prepareStatement(sql);
			statement.setInt(1, employee.getEmployee_id());
			statement.setString(2, employee.getFirst_name());
			statement.setString(3, employee.getLast_name());
			statement.setString(4, "meineEmail@fake.com");
			statement.setDate(5, new Date(System.currentTimeMillis()));
			statement.setString(6, "AC_ACCOUNT");
			statement.setDouble(7, employee.getSalary());
			
			int rowsAffected = statement.executeUpdate();
			System.out.println("Rows affected: " + rowsAffected);
		} catch (SQLException e) {
			System.out.println("Exception catched during sql query - insertEmployee");
			e.printStackTrace();
		}
		
	}
	
	
	public Produkt[] getProdukte() {
		String sql = "SELECT * FROM sortiment";
		List<Produkt> produktList = new ArrayList<>();
		PreparedStatement query;
		ResultSet resultSet;
		try {
			query = this.db_conn.prepareStatement(sql);
			resultSet = query.executeQuery();
			
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String bezeichnung = resultSet.getString("bezeichnung");
				double preis = resultSet.getDouble("preis");
				produktList.add(new Produkt(bezeichnung, preis, id));
				
				
			}
//			System.out.println(employeeList);
		} catch (SQLException e) {
			System.out.println("Exception catched during sql query in getProdukte");
			e.printStackTrace();
		}
		return produktList.toArray(new Produkt[0]);
	}
	
	public void insertProdukt(Produkt produkt) {
		String sql = "INSERT INTO sortiment (id, bezeichnung, preis) VALUES(?,?,?)";
		try {
			PreparedStatement statement =db_conn.prepareStatement(sql);
			statement.setInt(1, produkt.getId());
			statement.setString(2, produkt.getBezeichnung());
			statement.setDouble(3, produkt.getPreis());
			
			int rowsAffected = statement.executeUpdate();
			System.out.println("Rows affected: " + rowsAffected);
		} catch (SQLException e) {
			System.out.println("Exception catched during sql query - insertProdukt");
			e.printStackTrace();
		}
	}
	
	
	
}
