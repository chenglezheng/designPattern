package com.clz.design.pattern.constructionPattern.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool {

    private Vector<Connection> pool;

    /*公有属性*/
    private String url="";
    private String username="";
    private String password="";
    private String driverClassName="";

    private int poolSize=10;
    private static ConnectionPool instance=null;
    Connection connection=null;

    private ConnectionPool(){
        pool=new Vector<Connection>(poolSize);
        for (int i = 0; i <poolSize ; i++) {
            try {
                Class.forName(driverClassName);
                connection=DriverManager.getConnection(url,username,password);
                pool.add(connection);
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    /* 返回连接到连接池 */
    public synchronized void release() {
        pool.add(connection);
    }

    /* 返回连接池中的一个数据库连接 */
    public synchronized Connection getConnection() {
        if (pool.size() > 0) {
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        } else {
            return null;
        }
    }

}
