package com.company.Learnjava.Exception.Checked;
import java.sql.*;

public class SqlException {

        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/student";
            String user = "root";
            String password = "password";

            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "password")) {
                String sql;
                sql = "SELECT * FROM student WHERE id = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, 100);
                ResultSet result = statement.executeQuery();
                while (result.next()) {
                    System.out.println(result.getString("name"));
                }
            } catch (SQLException e) {
                System.out.println("Error executing SQL statement: " + e.getMessage());
            }
        }
    }


