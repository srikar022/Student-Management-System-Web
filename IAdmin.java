package dao;

import model.Admin;

public interface IAdmin {
  public int authenticate(Admin admin);
}
