package model;

import java.sql.Date;

public class Student {
  private int id;
  private String name;
  private Date dateOfBirth;
  private long contactNumber;

  public Student() {
    // TODO Auto-generated constructor stub
  }

  public Student(int id, String name, Date dateOfBirth, long contactNumber) {
    super();
    this.id = id;
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.contactNumber = contactNumber;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDate(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public long getContactNumber() {
    return contactNumber;
  }

  public void setContactNumber(long contactNumber) {
    this.contactNumber = contactNumber;
  }

  @Override
  public String toString() {
    return "id=" + id + ", name=" + name + ", Date Of Birth=" + dateOfBirth + ", Contact Number=" + contactNumber;
  }

}

