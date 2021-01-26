package dao;

import java.util.List;

import model.Student;

public interface IStudent {
  public int addStudent(Student student);

  public List<Student> viewStudent();

  public int editStudent(Student student);

  public int removeStudent(Student student);
}
