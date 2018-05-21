/*
 * �����ݿ��������
 * �����ݿ�Ĳ���������crud
 * ���ô洢����
 * 
 *ע�⣺����������ݿ�ʱ���������쳣���ʾδ��������JAR������������һ��ԭ�����SQL������﷨����
 *java.lang.ClassNotFoundException: com.microsoft.jdbc.sqlserver.SQLServerDviver
 * */
package com.mhl.db;
import java.util.*;
import java.sql.*;
public class SqlHelper {
	//������Ҫ�Ķ���
	Connection ct=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String url="jdbc:sqlserver://127.0.0.1:1433;databaseName=restaurant";
	String user="sa";
	String passwd="yuer";
	
	//���캯������ʼ��ct
	public SqlHelper()
	{
		try {
			//��������
			Class.forName(driver);
			//�õ�����
			ct=DriverManager.getConnection(url,user,passwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//[]paras��ͨ��?��ֵ��ʽ���Է�ֹ©��ע�뷽ʽ����֤��ȫ��
	public ResultSet query(String sql,String []paras)
	{
		try {
			ps=ct.prepareStatement(sql);
			//��sql�Ĳ�����ֵ
			for(int i=0;i<paras.length;i++)
			{
				ps.setString(i+1, paras[i]);
			}
			//ִ�в�ѯ
			rs=ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		//���ؽ����
		return rs;
	}
	//�ر���Դ�ķ���
	public void close()
	{
		try {
			if(rs!=null) rs.close();
			if(ps!=null) ps.close();
			if(ct!=null) ct.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
