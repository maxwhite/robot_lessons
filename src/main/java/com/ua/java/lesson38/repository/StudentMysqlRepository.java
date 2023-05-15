package com.ua.java.lesson38.repository;

import com.ua.java.lesson38.model.Student;

import java.sql.*;

public class StudentMysqlRepository implements StudentRepository{

    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/university?user=root&password=password";

    private static final String INSERT_STATEMENT = "INSERT INTO students (age, course, first_name, last_name) VALUES (?, ?, ?, ?)";

    private static final String RETRIEVE_STATEMENT = "SELECT * FROM students WHERE id = ?";

    @Override
    public void save(Student student) {
        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);

            PreparedStatement ps = conn.prepareStatement(INSERT_STATEMENT);

            ps.setInt(1, student.getAge());
            ps.setString(2, student.getCourse());
            ps.setString(3, student.getFirstName());
            ps.setString(4, student.getLastName());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Student getStudent(int id) {

        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);

            PreparedStatement ps = conn.prepareStatement(RETRIEVE_STATEMENT);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            rs.next();

            return Student.builder().
                    id(id).age(rs.getInt("age")).
                    course(rs.getString("course")).
                    lastName(rs.getString("last_name")).
                    firstName(rs.getString("first_name")).build();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
