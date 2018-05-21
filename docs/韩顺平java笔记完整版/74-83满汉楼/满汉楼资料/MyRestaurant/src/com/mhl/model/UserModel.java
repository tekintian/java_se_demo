/*
 * �����û�������ģ�ͣ���������ɶ��û��ĸ��ֲ�����������Ҫ��д��Ŀ��Ҫ��ҵ�����
 * */
package com.mhl.model;
import java.sql.*;

import sun.java2d.pipe.SpanClipRenderer;

import com.mhl.db.*;
public class UserModel {
	/**
	 * 
	 * @param cleId �û����
	 * @param passwd �û�����
	 * @return �û���ְλ��������û������ڣ��򷵻ؿ�
	 */
	public String checkUser(String cleId,String passwd)
	{
		String zhiwei="";
		SqlHelper sh=null;
		try {
			
			//��֯sql���Ͳ����б�Ϊ��ֹע��©������ȡ?��ֵ��ʽ(paras[])
			//����������sql�������̫������ʹ�����ӷ��������ӣ������������𣬵ڶ����Ǵ�ģ�ԭ����cleId" +�е�����
			//��ȱ�ٿո���ȷ�ǣ�cleId " +����һ���������ҵ�����һ����Сʱ���ż������ģ���΢��ע��ֲܿ���
//			String sql="select cleZw from clerkInfo c,login l where c.cleId=l.cleId " +
//					"and l.cleId=? and l.passwd=?";
//			String sql="select cleZw from clerkInfo c,login l where c.cleId=l.cleId" +
//			"and l.cleId=? and l.passwd=?";
			
			String sql="select cleZw from clerkInfo c,login l where c.cleId=l.cleId " +
			"and l.cleId=? and l.passwd=?";
			String paras[]={cleId,passwd};
			sh=new SqlHelper();
			//��SqlHelper���еõ����ݿ�Ľ����
			ResultSet rs=sh.query(sql, paras);
			if(rs.next())
			{
				//�����ȥ����ȡ��ְλ
				zhiwei=rs.getString(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally 
		{
			sh.close();
		}
		return zhiwei;
	}

}
