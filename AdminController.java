package controller;

import dao.AdminImpl;
import dao.IAdmin;
import model.Admin;

public class AdminController {
  IAdmin iadmin = new AdminImpl();

  public int authenticate(String name, String password) {  
    Admin admin = new Admin(name, password);
    return iadmin.authenticate(admin);
  }
}
