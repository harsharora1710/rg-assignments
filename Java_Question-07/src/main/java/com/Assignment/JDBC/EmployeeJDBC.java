package com.Assignment.JDBC;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/Week3HW_DB";
    private static final String USER = "";
    private static final String PASSWORD = "";

    public void addEmployee(Employee emp) {
        String sql = "INSERT INTO employee (id, name, department) VALUES (?, ?, ?)";

        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Week3HW_DB", USER, PASSWORD);
                PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setInt(1, emp.getId());
            stmt.setString(2, emp.getName());
            stmt.setString(3, emp.getDepartment());
            stmt.executeUpdate();
            System.out.println("Employee added.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void viewEmployees() {
        String sql = "SELECT * FROM employee";

        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Week3HW_DB", USER, PASSWORD);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String dept = rs.getString("department");
                System.out.println(id + " | " + name + " | " + dept);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void updateEmployee(int id, String name, String dept) {
        String sql = "UPDATE employee SET name = ?, department = ? WHERE id = ?";

        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Week3HW_DB", USER, PASSWORD);
                PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setString(1, name);
            stmt.setString(2, dept);
            stmt.setInt(3, id);
            int rows = stmt.executeUpdate();
            System.out.println(rows > 0 ? "Employee updated." : "Employee not found.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deleteEmployee(int id) {
        String sql = "DELETE FROM employee WHERE id = ?";

        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Week3HW_DB", USER, PASSWORD);
                PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            System.out.println(rows > 0 ? "Employee deleted." : "Employee not found.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
