package util;

public class Query {
  public static String adminAuthentication = "select * from admin where username=? and password=?";
  public static String addStudent = "insert into student values(?,?,?,?)";
  public static String viewStudent = "select * from student";
  public static String editStudent = "update student set name=?,dateOfBirth=?,contactNumber=? where id=?";
  public static String removeStudent = "delete from student where id=?";
}

