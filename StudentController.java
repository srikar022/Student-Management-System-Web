package controller;

import java.sql.Date;
import java.util.List;

import dao.StudentImpl;
import dao.IStudent;
import model.Student;

public class StudentController {
  IStudent sImpl = new StudentImpl();

  public int addStudent(int id, String name, Date dateOfBirth, long contactNumber) {
    Student student = new Student(id, name, dateOfBirth, contactNumber);
    return sImpl.addStudent(student);
  }

  public List<Student> viewStudent() {
    return sImpl.viewStudent();
  }

  public int editStudent(int id, String name, Date dateOfBirth, long contactNumber) {
    Student student = new Student(id, name, dateOfBirth, contactNumber);
    return sImpl.editStudent(student);
  }

  public int removeStudent(int id) {
    Student student = new Student();
    student.setId(id);
    return sImpl.removeStudent(student);
  }

}
