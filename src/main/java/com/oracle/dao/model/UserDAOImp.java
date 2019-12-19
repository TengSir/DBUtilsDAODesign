package com.oracle.dao.model;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDAOImp  implements  UserDAO{
    @Override
    public User login(String username, String password) {
        User user=null;
        BeanHandler<User>  bh=new BeanHandler<>(User.class);
        QueryRunner runner=new QueryRunner(ConnectionPool.getDataSource());
        try {
            user=runner.query("select * from user where username=? and password=?",bh,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public boolean register(User user) {
        QueryRunner runner=new QueryRunner(ConnectionPool.getDataSource());
        try {
            int count=runner.update("insert into user values(?,?,?,?,?)",user.getUserid(),user.getUsername(),user.getPassword(),user.getAge(),user.getNickname());
            return count>0?true:false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updatePassword(int userid, String newPassword) {
        QueryRunner runner=new QueryRunner(ConnectionPool.getDataSource());
        try {
            int count=runner.update("update user set password=? where userid=?",userid,newPassword);
            return count>0?true:false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public User userDetail(int userid) {
        return null;
    }
}
