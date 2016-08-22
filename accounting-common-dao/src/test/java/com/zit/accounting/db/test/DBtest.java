package com.zit.accounting.db.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBtest {

	public static final String url = "jdbc:mysql://127.0.0.1/accounting?useSSL=true&useLegacyDatetimeCode=false&serverTimezone=America/New_York";
	public static final String name = "com.mysql.cj.jdbc.Driver";
	public static final String user = "root";
	public static final String password = "myroot";

	public Connection conn = null;
	public PreparedStatement pst = null;

	public DBtest(String sql) {
		try {
			Class.forName(name);// 指定连接类型
			conn = DriverManager.getConnection(url, user, password);// 获取连接
			pst = conn.prepareStatement(sql);// 准备执行语句
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			this.conn.close();
			this.pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		String sql = "select * from acc_consume_type";//SQL语句  
		DBtest db1 = new DBtest(sql);//创建DBHelper对象  
  
        try {  
        	ResultSet  ret = db1.pst.executeQuery();//执行语句，得到结果集  
            while (ret.next()) {  
                String uid = ret.getString(1);  
               /* String ufname = ret.getString(2);  
                String ulname = ret.getString(3);  
                String udate = ret.getString(4); */
                System.out.println("ret.getString(1)=" + uid);
//                System.out.println(uid + "\t" + ufname + "\t" + ulname + "\t" + udate );  
            }//显示数据  
            ret.close();  
            db1.close();//关闭连接  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
	}
	
	
}
