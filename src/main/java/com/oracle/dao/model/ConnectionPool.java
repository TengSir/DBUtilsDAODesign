package com.oracle.dao.model;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 数据库连接池帮助类
 */
public class ConnectionPool {

    private static  DataSource  dataSource;
    private static  Connection connection;

    public static Connection getConnection() {
        try {
            connection=dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    static {
        Properties properties=new Properties();
        try {
            properties.load(new FileInputStream("/Users/tengsir/workspace/java/idea/DBUtilsDAODesign/src/main/resources/datasource.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            dataSource= BasicDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource(){
        return dataSource;
    }

}
