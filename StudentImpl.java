package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Student;
import util.Db;
import util.Query;

public class StudentImpl implements IStudent {
  PreparedStatement pst = null;
  ResultSet rs = null;
  int result = 0;

  @Override
  public int addStudent(Student student) {
    try {
      pst = Db.getCon().prepareStatement(Query.addStudent);
      pst.setInt(1, student.getId());
      pst.setString(2, student.getName());
      pst.setDate(3, student.getDateOfBirth());
      pst.setLong(4, student.getContactNumber());
      result = pst.executeUpdate();
    } catch (ClassNotFoundException | SQLException e) {
      result = 0;
    } finally {
      try {
        Db.getCon().close();
        pst.close();
      } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    return result;
  }

  @Override
  public List<Student> viewStudent() {
    List<Student> student = new ArrayList<Student>();
    try {
      pst = Db.getCon().prepareStatement(Query.viewStudent);
      rs = pst.executeQuery();
      while (rs.next()) {
        Student e = new Student(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getLong(4));
        student.add(e);
      }

    } catch (ClassNotFoundException | SQLException e) {
      try {
        Db.getCon().close();
        pst.close();
        rs.close();
      } catch (ClassNotFoundException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      } catch (SQLException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }

    }
    return student;
  }

  @Override
  public int editStudent(Student student) {
    try {
      pst = Db.getCon().prepareStatement(Query.editStudent);
      pst.setInt(4, student.getId());
      pst.setString(1, student.getName());
      pst.setDate(2, student.getDateOfBirth());
      pst.setLong(3, student.getContactNumber());
      result = pst.executeUpdate();
    } catch (ClassNotFoundException | SQLException e) {
      result = 0;
    } finally {
      try {
        Db.getCon().close();
        pst.close();
      } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    return result;
  }

  @Override
  public int removeStudent(Student student) {
    try {
      pst = Db.getCon().prepareStatement(Query.removeStudent);
      pst.setInt(1, student.getId());
      result = pst.executeUpdate();
    } catch (ClassNotFoundException | SQLException e) {
      result = 0;
    } finally {
      try {
        Db.getCon().close();
        pst.close();
      } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    return result;
  }

}
