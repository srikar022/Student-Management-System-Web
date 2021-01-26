package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Admin;
import util.Db;
import util.Query;

public class AdminImpl implements IAdmin {
  PreparedStatement pst = null;
  ResultSet rs = null;
  int result = 0;

  @Override
  public int authenticate(Admin admin) {
    try {
      pst = Db.getCon().prepareStatement(Query.adminAuthentication);
    } catch (ClassNotFoundException | SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    try {
      pst.setString(1, admin.getName());
      pst.setString(2, admin.getPassword());
      rs = pst.executeQuery();
      while (rs.next()) {
        result++;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    try {
      Db.getCon().close();
      pst.close();
      rs.close();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return result;
  }

}

