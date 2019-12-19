package com.oracle.dao.model;

public interface UserDAO {

    public User login(String username,String password);

    public boolean  register(User user);

    public boolean updatePassword(int userid,String newPassword);

    public User  userDetail(int userid);
}
